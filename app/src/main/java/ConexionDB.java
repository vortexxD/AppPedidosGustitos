import java.sql.Connection;

import Models.ClienteModels;
import Models.ContabilidadModels;
import Models.OrdenModels;
import Models.PedidoModels;
import Models.ProductoModels;

public interface ConexionDB {
    public Connection Conectar();
    public ProductoModels[] TotalProductos();
    public void ActualizarProducto(ProductoModels Producto);
    public void InsertarOrden(OrdenModels Orden);
    public void InsertarPedido(PedidoModels Pedido);
    public void InsertarContabilidad(ContabilidadModels contabilidad);
    public void InsertarCliente(ClienteModels Cliente);
}
