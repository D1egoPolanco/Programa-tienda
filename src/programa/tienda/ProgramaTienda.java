package ProgramaTienda ;
import java.util.Scanner;

public class ProgramaTienda {
    //aqui el usuario tiene la opcion de iniciar secion y de tener una contraseña que le permitita entrar al sistema 
    public class Administrador{
        private String usuario,pasword;
        
        public Administrador (String nombre,String contra){
            this.usuario=usuario;
            this.pasword=pasword;
        }
        
        public String getUsuario(){
            return usuario;
        }
        public String getPasword(){
            return pasword;
        }
        
    }
    
    public class Proveedor{
        private String compania,nombre;
        private int telefono;
        
        public Proveedor(String empresa,String nombre, String productos, String direccion,int telefono){
            this.compania=compania;
            this.nombre=nombre;
          
            this.telefono=telefono;
        }
        
        public String getEmpresa(){
            return compania;
        }
        public String getNombre(){
            return nombre;
        }
        
        
        public int getTelefono(){
            return telefono;
        }
        
               public void setEmpresa(String compania){
            this.compania=compania;
        }
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
       
        
        public void setTelefono(int telefono){
            this.telefono=telefono;
        }
        
    }
      public class mercancia{
        private String nombre;
        private int cantidad;
        private double precio;
        
        public mercancia(String nombre,int cantidad, double precio){
           
            this.nombre=nombre;
            this.cantidad=cantidad;
            this.precio=precio;
        }
       
        public String getNombre(){
            return nombre;
        }
        public int getCantidad(){
            return cantidad;
        }
        public double getPrecio(){
            return precio;
        }
        
       //edicion de datos
        public void editNombre(String nombre){
            this.nombre=nombre;
        }
        public void setCantidad(int cantidad){
            this.cantidad=cantidad;
        }
        public void setPrecio(double precio){
            this.precio=precio;
        }
      
    }
    
    public class Factura{
        private String nombreneg,fecha,compras, tipos;
        private double totalpagar;
        
        public Factura(String nombreneg,String fecha,String compras, String tipos, double totalcompra){
            this.nombreneg=nombreneg;
            this.fecha=fecha;
            this.compras=compras;
            this.tipos=tipos;
            this.totalpagar=totalcompra;
        }
        
        public String getNombreneg(){
            return nombreneg;
        }
        public String getFecha(){
            return fecha;
        }
        public String getCompras(){
            return compras;
        }
        public double getTotalcompra(){
            return totalpagar;
        }

        public void setCompras(String compras){
            this.compras=compras;
        }
        public void setTotalcompra(double totalcompra){
            this.totalpagar=totalcompra;
        }
          
}
        
    public static void main(String[] args) {
          }
    
}
//BY Diego Polanco 00301417