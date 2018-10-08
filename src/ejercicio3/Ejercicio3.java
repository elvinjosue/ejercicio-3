/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import javax.swing.JOptionPane;
/**
 *
 * @author MORALES
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable para recibir el string que ingrese el usuario
        String Altura,Edad,s;
  //opcion por si desea ingresar mas datos
    int opcion;
    //variables para convertir los datos que se ingresaron como cadena
    double e,a;
    //variables que sirven como acumuladores para los promedio de la edad y altura
    double promedioE=0,promedioA=0;
    /*acumulador que almacena las veces que el usuario ingreso datos 
    osea cada vez que la condicion el el while sea verdadera*/
        double i=0;
    
    do
    {
       //ingresando datos
       Altura = JOptionPane.showInputDialog("ingrese la altura : ");
        Edad = JOptionPane.showInputDialog("ingrese la edad : ");
        //convirtiendo variables
       a = Double.parseDouble(Altura);
        e = Double.parseDouble(Edad);
        //acumuladores de edad y altura respectivamente
        promedioE =promedioE +e;
        promedioA =promedioA +a;
         // acumulador del ciclo
        i++;
        //menu
        s = JOptionPane.showInputDialog("desea ingresar mas 1.Si 2.No: "); 
        opcion =Integer.parseInt(s);
        
    }while(opcion == 1);   //fin del ciclo
        /*promedio de la edad y altura va ser igual a la suma
        de los datos que se ingreso entre las veces que se ingresaron datos*/
        promedioE =promedioE/i;
        promedioA =promedioA/i;
        //imprimiendo resultados
        JOptionPane.showMessageDialog(null,"Promedio de edad: " +promedioE+" aÃ±os");
        JOptionPane.showMessageDialog(null,"Promedio de altura: " +promedioA+" cm");
    }
    
}
