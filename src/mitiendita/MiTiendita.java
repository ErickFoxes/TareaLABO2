package mitiendita;

/**
 * 
 * @author Erick
 */
//Tiene Login, lo hice por error :'v
public class MiTiendita {   
    String Usuario,Contrasena;
    
     /*Métodos Setter*/
    public void setUsuario(String Usuario){
        this.Usuario = Usuario;
    }
    public void setContrasena(String Contrasena){
        this.Contrasena = Contrasena;
    }
    
    /*Métodos Getter*/
    public String getUsuario(){
        return Usuario;
    }
    public String getContrasena(){
        return Contrasena;
    }

    
    public static void main(String[] args) {
        Tienda Ini = new Tienda();
        Ini.IniciarSesion();
    }
    
}
