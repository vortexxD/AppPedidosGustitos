package Models;

import java.util.Date;

public class ContabilidadModels {
    private int Id_Cuenta;
    private int CantidadProductosVendidos;
    private float VentaTotal;
    private Date Fecha;
    private int Id_Pedido_Producto;
    ContabilidadModels(int Id_Cuenta, int CantidadProductosVendidos, float VentaTotal, Date Fecha, int Id_Pedido_Producto){
        this.Id_Cuenta = Id_Cuenta;
        this.CantidadProductosVendidos = CantidadProductosVendidos;
        this.VentaTotal = VentaTotal;
        this.Fecha = Fecha;
        this.Id_Pedido_Producto = Id_Pedido_Producto;
    }
    public void SetId_Cuenta(int Id_Cuenta){
        this.Id_Cuenta = Id_Cuenta;
    }
    public void SetCantidadProductosVendidos(int Cantidad){this.CantidadProductosVendidos = Cantidad;}
    public void SetVentaTotal(float VentaTotal){
        this.VentaTotal = VentaTotal;
    }
    public void SetFecha(Date Fecha){
        this.Fecha = Fecha;
    }
    public void SetId_Pedido_Producto(int Id_Pedido_Producto){this.Id_Pedido_Producto = Id_Pedido_Producto;}
    public int GetId_Cuenta(){
        return this.Id_Cuenta;
    }
    public int GetCantidadProductosVendidos(){
        return this.CantidadProductosVendidos;
    }
    public float GetVentaTotal(){
        return this.VentaTotal;
    }
    public Date GetFecha(){
        return this.Fecha;
    }
    public int GetId_Pedido_Producto(){return this.Id_Pedido_Producto;}
}
