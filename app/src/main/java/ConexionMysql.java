import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Models.PedidoModels;
import Models.ProductoModels;

public class ConexionMysql implements ConexionDB{
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String Url = "jdbc:mysql://localhost:3306/gustitosdb";
    private static final String Usuario = "root";
    private static final String Contrasena = "";

    private Statement Statement = null;
    private ResultSet Resultado = null;
    private ResultSet Resultado2 = null;

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

    @Override
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
    //ObtenerProducto
    public ProductoModels[] TotalProducto() {
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

    @Override
    public void ActualizarProducto(int Id, int Cantidad) {
        String Update = "UPDATE producto SET Cantidad='"+Cantidad+"' WHERE Id_Producto='"+(Id+1)+"'";
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

    @Override
    public void InsertarProducto(int Id, ProductoModels Producto) {
		/* TODO Auto-generated method stub
		String Update = "UPDATE producto SET Cantidad='"+Cantidad+"' WHERE Id_Producto='"+(Id+1)+"'";
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
		}*/
    }
    //FinM�todosProductos

    //M�todosPedidos
    @Override
    public void TotalPedido() {
        // TODO Auto-generated method stub

    }

    @Override
    public PedidoModels[] MostrarPedidos() {
        PedidoModels Pedidos[] = new PedidoModels[8];
        try {
            Statement = Conectar().createStatement();
            Resultado = Statement.executeQuery("Select * FROM producto");

            for(int i=0;Resultado.next();i++) {
                Pedidos[i].SetId_Pedido(Resultado.getInt(0));
                Pedidos[i].SetObservaciones(Resultado.getString(1));
                Pedidos[i].SetId_Cliente(Resultado.getInt(2));
                Pedidos[i].SetId_Ordenes(Resultado.get);
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
        return Pedidos;

    }
    //FinM�todosPedidos
}
