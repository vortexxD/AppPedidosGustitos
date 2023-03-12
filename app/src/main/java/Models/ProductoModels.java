package Models;

public class ProductoModels {
    int Id_Producto = 0;
    String NombreProducto;
    float Precio;
    int Cantidad;
    int Disponible;
    ProductoModels(int Id_Producto, String NombreProducto, float Precio, int Cantidad, int Disponible){
        this.Id_Producto = Id_Producto;
        this.NombreProducto = NombreProducto;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.Disponible = Disponible;
    }
    public void SetId_Producto(int Id){
        this.Id_Producto = Id_Producto;
    }
    public void SetNombreProducto(String NombreProducto){
        this.NombreProducto = NombreProducto;
    }
    public void SetPrecio(float Precio){
        this.Precio = Precio;
    }
    public void SetCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }
    public void SetDisponible(int Disponible){this.Disponible = Disponible;}
    public int GetId_Producto(){
        return this.Id_Producto;
    }
    public String GetNombreProducto(){
        return this.NombreProducto;
    }
    public float GetPrecio(){
        return this.Precio;
    }
    public int GetCantidad(){
        return this.Cantidad;
    }
    public int GetDisponible(){return this.Disponible;}
}
