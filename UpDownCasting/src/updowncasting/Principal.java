/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package updowncasting;

/**
 *
 * @author sroa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cocinero c1 = new Cocinero();
       c1.mensajeCocinero(); //Cocinero tiene acceso a cocinero
       c1.mensajeEmpleado();//cocinero tiene acceso a Empleado
       
       
       Empleado e1= new Empleado();
       e1.mensajeEmpleado();//empleado puede obtener su metodo pero no puede acceder al de cocinero
       
       //Para poder acceder al de cocinero
       Empleado c = new Cocinero();//**Upcasting* 
//Clase cocinero hereda de la clase empleado
       c.mensajeEmpleado();//
 //c.mensajeCocinero(); no se puede ya que estamos haciendo una conversion. Una clase cocinero es un obj de clase empleado
 
 
 
 //****************DOWNCASTING********************
 Empleado co = (Cocinero)c1;//Downcasting
 //convirtiendo obj cocinero a 
 co.mensajeEmpleado();
 c1.mensajeCocinero();
 
 
        
        
        
        
        
    }
    
}
