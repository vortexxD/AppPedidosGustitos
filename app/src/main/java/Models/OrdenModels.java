package Models;

public class OrdenModels {
    private int Id_Orden;
    private int Id_Producto;
    private int CantidadPedido;
    private int[] Id_Pedidos;

    OrdenModels(int Id_Orden, int Id_Producto, int CantidadPedido, int[] Id_Pedidos){
        this.Id_Orden = Id_Orden;
        this.Id_Producto = Id_Producto;
        this.CantidadPedido = CantidadPedido;
        this.Id_Pedidos = Id_Pedidos;
    }

    public void SetId_Orden(int Id_Orden){this.Id_Orden = Id_Orden;}
    public void SetId_Producto(int Id_Producto){this.Id_Producto = Id_Producto;}
    public void SetCantidadPedido(int CantidadPedido){this.CantidadPedido = CantidadPedido;}
    public int GetId_Orden(){return this.Id_Orden;}
    public int GetId_Producto(){return this.Id_Producto;}
    public int GetCantidadPedido(){return this.CantidadPedido;}

    public void setId_Pedidos(int[] id_Pedidos) {
        Id_Pedidos = id_Pedidos;
    }

    public int[] getId_Pedidos() {
        return Id_Pedidos;
    }
}
