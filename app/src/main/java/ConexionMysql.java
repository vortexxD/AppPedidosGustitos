import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Models.ClienteModels;
import Models.ContabilidadModels;
import Models.OrdenModels;
import Models.PedidoModels;
import Models.ProductoModels;

public class ConexionMysql implements ConexionDB{
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String Url = "jdbc:mysql://localhost:3306/gustitosdb";
    private static final String Usuario = "root";
    private static final String Contrasena = "";
    private Statement Statement = null;
    private ResultSet Resultado = null;
    public ConexionMysql() {
        // TODO Auto-generated constructor stub
    }
    static {
        try {
            Class.forName(Driver);
        }catch(ClassNotFoundException e) {
            System.out.println("Error al Cargar el Controlador");
            e.printStackTrace();
        }
    }
    @Override
    public Connection Conectar() {
        Connection Conexion = null;
        try {
            Conexion = DriverManager.getConnection(Url,Usuario,Contrasena);
        }catch(SQLException e) {
            System.out.println("Error de Conexion");
            e.printStackTrace();
        }
        return Conexion;
    }
    //InsercionInicial
    public void DatoInicial(int[] TotalProducto) {
        try {
            int i=0;
            Statement = Conectar().createStatement();
            while(i<TotalProducto.length) {
                String Update = "UPDATE producto SET Cantidad='"+TotalProducto[i]+"' WHERE Id_Producto='"+(i+1)+"'";
                Statement.executeUpdate(Update);
                i++;
            }
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                if(Resultado!=null) {
                    Resultado.close();
                }
                if(Statement!=null)
                    Statement.close();
                if(Conectar()!=null)
                    Conectar().close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    // M�todosProductos
    @Override
    //ObtenerProductos
    public ProductoModels[] TotalProductos() {
        // TODO Auto-generated method stub
        ProductoModels Cantidad[] = new ProductoModels[8];
        try {
            Statement = Conectar().createStatement();
            Resultado = Statement.executeQuery("Select * FROM producto");
            int i = 0;
            while(Resultado.next()) {
                Cantidad[i].SetId_Producto(Resultado.getInt(0));
                Cantidad[i].SetNombreProducto(Resultado.getString(1));
                Cantidad[i].SetCantidad(Resultado.getInt(2));
                Cantidad[i].SetPrecio(Resultado.getFloat(3));
                i++;
            }
            i=0;
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                if(Resultado!=null) {
                    Resultado.close();
                }
                if(Statement!=null)
                    Statement.close();
                if(Conectar()!=null)
                    Conectar().close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return Cantidad;
    }
//  Actualización de Cantidad de Productos
    @Override
    public void ActualizarProducto(ProductoModels Producto) {
        String Update = "UPDATE producto SET Cantidad='"+Producto.GetCantidad()+"' WHERE Id_Producto='"+Producto.GetId_Producto()+"'";
        try {
            Statement = Conectar().createStatement();
            Statement.executeUpdate(Update);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                if(Resultado!=null) {
                    Resultado.close();
                }
                if(Statement!=null)
                    Statement.close();
                if(Conectar()!=null)
                    Conectar().close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
//  Inserciones a la Base de Datos
    @Override
    public void InsertarOrden(OrdenModels Orden){
        String Insert = "INSERT INTO orden ('Id_Orden','id_Producto','CantidadPedido') VALUES ('"+
                Orden.GetId_Orden()+"','"+Orden.GetId_Producto()+"','"+Orden.GetCantidadPedido()+"')";
        try {
            Statement = Conectar().createStatement();
            Statement.executeUpdate(Insert);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                if(Resultado!=null) {
                    Resultado.close();
                }
                if(Statement!=null)
                    Statement.close();
                if(Conectar()!=null)
                    Conectar().close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    @Override
    public void InsertarPedido(PedidoModels Pedido){
        String Insert = "INSERT INTO pedidos ('Id_Pedido', 'Observaciones', 'Cliente') VALUES ('"+
                Pedido.GetId_Pedido()+"','"+Pedido.GetObservaciones()+"','"+Pedido.GetId_Cliente()+"')";
        try {
            Statement = Conectar().createStatement();
            Statement.executeUpdate(Insert);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                if(Resultado!=null) {
                    Resultado.close();
                }
                if(Statement!=null)
                    Statement.close();
                if(Conectar()!=null)
                    Conectar().close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    @Override
    public void InsertarContabilidad(ContabilidadModels Contabilidad){
        String Insert = "INSERT INTO 'contabilidad' ('Id_Cuenta', 'CantidadProductosVendidos', 'VentaTotal', 'Fecha')" +
                " VALUES ('"+Contabilidad.GetId_Cuenta()+"','"+Contabilidad.GetCantidadProductosVendidos()+"','"+
                Contabilidad.GetVentaTotal()+"','"+Contabilidad.GetFecha()+"')";
        try {
            Statement = Conectar().createStatement();
            Statement.executeUpdate(Insert);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                if(Resultado!=null) {
                    Resultado.close();
                }
                if(Statement!=null)
                    Statement.close();
                if(Conectar()!=null)
                    Conectar().close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    @Override
    public void InsertarCliente(ClienteModels Cliente){
        String Insert = "INSERT INTO clientes ('Id_Cliente', 'Nombres', 'Direccion', 'Telefono') VALUES ('"+
                Cliente.GetIdCliente()+"','"+Cliente.GetNombres()+"','"+Cliente.GetDireccion()+"','"+
                Cliente.GetTelefono()+"')";
        try {
            Statement = Conectar().createStatement();
            Statement.executeUpdate(Insert);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                if(Resultado!=null) {
                    Resultado.close();
                }
                if(Statement!=null)
                    Statement.close();
                if(Conectar()!=null)
                    Conectar().close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
