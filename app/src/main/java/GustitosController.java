import Models.ProductoModels;

public class GustitosController implements ProcesadorDatosInterface{
    private ConexionDB ConexionDB;

    private int[] TotalProducto = new int[6];
    private int[] RepositorioDatos= new int[6];
    private int Devolucion = 0;

    GustitosController(ConexionDB ConexionDB){
        this.ConexionDB = ConexionDB;
        this.TotalProducto[0]=0;
        this.TotalProducto[1]=0;
        this.TotalProducto[2]=0;
        this.TotalProducto[3]=0;
        this.TotalProducto[4]=0;
        this.TotalProducto[5]=0;
    }

    @Override
    public void Gustitos(int Juane, int CangaPecho, int CangaPierna, int TacachoCecinaChorizo,
                         int TacachoChicharron, int Chicha){
        int i=0;
        this.TotalProducto[0]=Juane;
        this.TotalProducto[1]=CangaPecho;
        this.TotalProducto[2]=CangaPierna;
        this.TotalProducto[3]=TacachoCecinaChorizo;
        this.TotalProducto[4]=TacachoChicharron;
        this.TotalProducto[5]=Chicha;
        while(i<6) {
            this.RepositorioDatos[i]=this.TotalProducto[i];
            i++;
        }
    }

    @Override
    public ProductoModels[] getTotalProducto() {
        ProductoModels[] TotalProductos = this.ConexionDB.TotalProductos();
        return TotalProductos;
    }

    @Override
    public int getDevoluciones() {
        int Devoluciones = this.Devolucion;
        return Devoluciones;
    }

    @Override
    public boolean VenderProducto(int Id, int Cantidad) {
        boolean Codigo = true;
        if(Id<7 && this.TotalProducto[Id]>=Cantidad) {
            Codigo=false;
            this.TotalProducto[Id]-=Cantidad;
//            ConexionDB.ActualizarProducto();
        }else
        if(Id<7 && Cantidad==0)
            Codigo=false;
        else
            Codigo=true;
        return Codigo;
    }

    @Override
    public boolean DevolverProducto(int Id, int Cantidad) {
        boolean Estado = true;
        if(Id<7) {
            if(this.RepositorioDatos[Id]>=(this.TotalProducto[Id]+Cantidad)) {
                Estado=false;
                this.TotalProducto[Id]+=Cantidad;
//                this.ConexionDB.ActualizarProducto(Id, this.TotalProducto[Id]);
                Devolucion++;
            }
        }else
        if(Id<7 && Cantidad==0)
            Estado=false;
        else
            Estado=true;
        return Estado;
    }

    @Override
    public void AñadirProducto(int Id, int Cantidad) {
        this.TotalProducto[Id]+=Cantidad;
//        ConexionDB.ActualizarProducto(Id, this.TotalProducto[Id]);
    }
}
