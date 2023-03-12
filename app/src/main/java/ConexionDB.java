import java.sql.Connection;

import Models.PedidoModels;
import Models.ProductoModels;

public interface ConexionDB {
    public Connection Conectar();
    public void DatoInicial(int[] TotalProducto);
    public ProductoModels[] TotalProducto();
    public void TotalPedido();
    public PedidoModels[] MostrarPedidos();
    public void ActualizarProducto(int Id, int Cantidad);
    public void InsertarProducto(int Id, ProductoModels Producto);
}
