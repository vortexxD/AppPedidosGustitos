package Models;

public class Pedidos_Ordenes_Productos {
    private PedidoModels[] Pedidos;
    private OrdenModels[][] Ordenes;
    private ProductoModels[][][] Productos;
    Pedidos_Ordenes_Productos(PedidoModels[] Pedidos, OrdenModels[][] Ordenes, ProductoModels[][][] Productos){
        this.Pedidos = Pedidos;
        this.Ordenes = Ordenes;
        this.Productos = Productos;
    }

    public OrdenModels[][] getOrdenes() {
        return Ordenes;
    }

    public PedidoModels[] getPedidos() {
        return Pedidos;
    }

    public ProductoModels[][][] getProductos() {return Productos;}

    public void setOrdenes(OrdenModels[][] ordenes) {
        Ordenes = ordenes;
    }

    public void setPedidos(PedidoModels[] pedidos) {
        Pedidos = pedidos;
    }

    public void setProductos(ProductoModels[][][] productos) {
        Productos = productos;
    }
}
