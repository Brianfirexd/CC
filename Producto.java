public class Producto {

    public String CodProd;
    public String nombre;
    public double precio;
    private double costo;
    public String descripcion;
    public int CodBus;


    public Producto(String CodProd, String nombre, double precio, int costo, String descripcion){
        this.CodProd = CodProd;
        this.nombre = nombre;
        this.precio = precio;
        this.costo = costo;
        this.descripcion = descripcion;
    }

    public double getCosto(){
        return costo;
    }

    public void setCosto(double costo){
        this.costo = costo;
    }


}
