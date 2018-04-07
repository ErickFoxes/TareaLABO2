package mitiendita;

/**
 *
 * @author Erick
 */
public class Productos {
    
    String Nombre_Producto,Estado_Producto,Empresa;
    int Cantidad_Producto;
    double Costo_Unitario;
    
    /*Métodos Setter*/

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public void setEstado_Producto(String Estado_Producto) {
        this.Estado_Producto = Estado_Producto;
    }

    public void setCantidad_Producto(int Cantidad_Producto) {
        this.Cantidad_Producto = Cantidad_Producto;
    }

    public void setCosto_Unitario(double Costo_Unitario) {
        this.Costo_Unitario = Costo_Unitario;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }
    
    /*Métodos Getter*/

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public String getEstado_Producto() {
        return Estado_Producto;
    }

    public int getCantidad_Producto() {
        return Cantidad_Producto;
    }

    public double getCosto_Unitario() {
        return Costo_Unitario;
    }

    public String getEmpresa() {
        return Empresa;
    }
    
    
   
}
