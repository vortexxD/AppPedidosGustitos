package Models;

public class ClienteModels {
    int Id_Cliente = 0;
    String Nombres;
    String Direccion;
    String Telefono;
    ClienteModels(int id_Cliente,String Nombres, String Direccion, String Telefono){
        this.Id_Cliente = id_Cliente;
        this.Nombres = Nombres;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public void SetIdCliente(int Id){
        this.Id_Cliente = Id;
    }
    public void SetNombres(String Nombres){
        this.Nombres = Nombres;
    }
    public void SetDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    public void SetTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    public int GetIdCliente(){
       return this.Id_Cliente;
    }
    public String GetNombres(){
        return this.Nombres;
    }
    public String GetDireccion(){
        return this.Direccion;
    }
    public String GetTelefono(){
        return this.Telefono;
    }
}
