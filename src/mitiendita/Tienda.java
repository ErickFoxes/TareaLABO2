package mitiendita;

import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class Tienda {
    Scanner leer = new Scanner(System.in);
    MiTiendita Tiendita = new MiTiendita();
    
    
    public Tienda(){}
    
    
    
    public void IniciarSesion(){
       
        System.out.println("----Inicio de sesión----\nUsuario:Maria, Contra:123");
        System.out.println("Usuario: ");
        Tiendita.setUsuario(leer.next());
        System.out.println("Contraseña: ");
        Tiendita.setContrasena(leer.next());
         if("Maria".equals(Tiendita.getUsuario()) && "123".equals(Tiendita.getContrasena())) {
             System.out.println("-------------Menú-------------");
            System.out.println("------------Producto----------");
            System.out.println("1) Agregar un producto\n2) Mostrar los productos\n3) Modificar un producto\n4) Cargar un producto\n5) Descargar un producto\n6) Eliminar un producto\n");
        }else{
            System.out.println("Algo salio mal :(");
        }
    }
    
    //PRODUCTOS
    public void Agregar_Producto(){
        
    }
    public void Mostrar_Producto(){
        
    }
    public void Modificar_Producto(){
        
    }
    public void Eliminar_Producto(){
        
    }
    public void Cargar_Producto(){
        
    }
    public void Descargar_Producto(){
        
    }
    
    //PROVEEDORES
    public void Agregar_Proveedor(){
        
    }
    public void Mostrar_Proveedor(){
        
    }
    public void Modificar_Proveedor(){
        
    }
    public void Eliminar_Proveedor(){
        
    }
    
     //USUARIOS
    public void Agregar_Administradores(){
        
    }
    public void Mostrar_Administradores(){
        
    }
    public void Modificar_Administradores(){
        
    }
    public void Eliminar_Administradores(){
        
    }

    
    
   
    
}
