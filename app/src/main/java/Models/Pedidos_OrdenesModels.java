package Models;

public class Pedidos_OrdenesModels {
    private int Id_Pedidos_Ordenes;
    private int Id_Pedido;
    private int Id_Orden;
    Pedidos_OrdenesModels(int Id_Pedidos_Ordenes, int Id_Pedido, int Id_Orden){
        this.Id_Pedidos_Ordenes = Id_Pedidos_Ordenes;
        this.Id_Pedido = Id_Pedido;
        this.Id_Orden = Id_Orden;
    }

    public int getId_Orden() {
        return Id_Orden;
    }

    public int getId_Pedido() {
        return Id_Pedido;
    }

    public int getId_Pedidos_Ordenes() {
        return Id_Pedidos_Ordenes;
    }

    public void setId_Orden(int id_Orden) {
        Id_Orden = id_Orden;
    }

    public void setId_Pedido(int id_Pedido) {
        Id_Pedido = id_Pedido;
    }

    public void setId_Pedidos_Ordenes(int id_Pedidos_Ordenes) {
        Id_Pedidos_Ordenes = id_Pedidos_Ordenes;
    }
}
