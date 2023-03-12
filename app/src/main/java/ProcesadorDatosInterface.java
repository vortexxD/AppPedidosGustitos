import Models.ProductoModels;

public interface ProcesadorDatosInterface {
    public void Gustitos(int Juane, int CangaPecho, int CangaPierna, int TacachoCecinaChorizo,
                         int TacachoChicharron, int Chicha);
    public ProductoModels[] getTotalProducto();
    public int getDevoluciones();
    public boolean VenderProducto(int Id, int Cantidad);
    public boolean DevolverProducto(int Id, int Cantidad);
    public void AñadirProducto(int Id, int Cantidad);
}
