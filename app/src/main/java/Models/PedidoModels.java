package Models;

public class PedidoModels {
    private int Id_Pedido=0;
    private String Observaciones;
    private int Id_Cliente=0;
    private int[] Id_Ordenes;
    PedidoModels(int Id_Pedido, String Observaciones, int Id_Cliente, int[] Id_Ordenes){
        this.Id_Pedido = Id_Pedido;
        this.Observaciones = Observaciones;
        this.Id_Cliente = Id_Cliente;
        this.Id_Ordenes = Id_Ordenes;
    }
    public void SetId_Pedido(int Id){
        this.Id_Pedido = Id;
    }
    public void SetObservaciones(String Observaciones){
        this.Observaciones = Observaciones;
    }
    public void SetId_Cliente(int Id_Cliente){
        this.Id_Cliente = Id_Cliente;
    }
    public int GetId_Pedido(){
        return this.Id_Pedido;
    }
    public String GetObservaciones(){
        return this.Observaciones;
    }
    public int GetId_Cliente(){
        return this.Id_Cliente;
    }

    public void SetId_Ordenes(int[] Id_Ordenes){this.Id_Ordenes = Id_Ordenes;}

    public int[] getId_Ordenes() {
        return Id_Ordenes;
    }
}
