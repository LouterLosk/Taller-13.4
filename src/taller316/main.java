package taller316;

import javax.swing.*;

/**Mientras se ejercita, puede usar un monitor de frecuencia cardiaca para ver que su corazón permanezca dentro de un rango seguro sugerido por sus entrenadores y doctores.
De acuerdo con la Asociación Estadounidense del Corazón (AHA) (www.americanheart.org/presenter. jhtml?identifier=4736),
 la fórmula para calcular su frecuencia cardiaca máxima en pulsos por minuto es 220 menos su edad en años.
 Su frecuencia cardiaca esperada tiene un rango que está entre el 50 y el 85% de su frecuencia cardiaca máxima.

 Cree una clase llamada FrecuenciasCardiacas.
 Los atributos de la clase deben incluir el primer
 nombre de la persona,
 su apellido
 y fecha de nacimiento
 (la cual debe consistir de atributos independientes para el mes, día y año de nacimiento).
 Su clase debe tener un constructor que reciba estos datos como parámetros.
 Para cada atributo debe proveer métodos establecer y obtener.
 La clase también debe incluir un método que calcule y devuelva la edad de la persona (en años),
 un método que calcule y devuelva la frecuencia cardiaca máxima de esa persona,
 y otro método que calcule y devuelva la frecuencia cardiaca esperada de la persona.
 Escriba una aplicación de Java que pida la información de la persona,
 cree una instancia de un objeto de la clase FrecuenciasCardiacas e imprima la información a partir de ese objeto
 (incluyendo el primer nombre de la persona, su apellido y fecha de nacimiento),
 y que después calcule e imprima la edad de la persona en (años), frecuencia cardiaca máxima y rango de frecuencia cardiaca esperada.*/



public class main {
    public static void main(String[] args) {
        FrecuenciasCardiacas f1 = new FrecuenciasCardiacas("","",0,0,0);
        /**Ingreso de datos*/
        f1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
        f1.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
        f1.setDia(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de nacimiento")));
        f1.setMes(Integer.parseInt(JOptionPane.showInputDialog("Ingrese le mes de nacimiento")));
        f1.setAnio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese le año de nacimiento")));

        /**Despliegue de datos*/
        System.out.println(f1.detalle(f1.getNombre(),f1.getApellido(),f1.getDia(),f1.getMes(),f1.getAnio()));
        JOptionPane.showMessageDialog(null,f1.detalle(f1.getNombre(),f1.getApellido(),f1.getDia(),f1.getMes(),f1.getAnio()));

    }
}
