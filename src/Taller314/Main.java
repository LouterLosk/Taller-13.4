package Taller314;

import javax.swing.*;

/**Cree una clase llamada Fecha,que incluya tres variables de instancia:
 un mes (tipo int),
 un día (tipo int)
 y un año (tipo int).
 Su clase debe tener un constructor que inicialice las tres variables de instancia,
 y debe asumir que los valores que se proporcionan son correctos.
 Proporcione un método establecer y un método obtener para cada variable de instancia.
 Proporcione un método mostrarFecha, que muestre el mes, día y año, separados por barras diagonales (/).
 Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.   */

public class Main {
    public static void main(String[] args) {
        /**Creacion de objetos de la clase fecha*/
        Fecha f1 = new Fecha(0,0,0);
        /**Leer los valores de la fecha*/
        f1.setDia(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia")));
        f1.setMes(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Mes")));
        f1.setAnio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año")));
        /** LLamada al metodo y despliege*/
        JOptionPane.showMessageDialog(null,f1.mostrarFecha(f1.getDia(),f1.getMes(),f1.getAnio()));
    }
}
