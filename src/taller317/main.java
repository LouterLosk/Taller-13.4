package taller317;

import javax.sql.rowset.Joinable;
import javax.swing.*;

/**
 * Un tema relacionado con la salud que ha estado últimamente en las noticias es la computarización de los registros médicos.
 * Esta posibilidad se está tratando con mucho cuidado, debido a las delicadas cuestiones de privacidad y seguridad, entre otras cosas.
 * [Trataremos esas cuestiones en ejercicios posteriores].
 * La computarización de los registros médicos puede facilitar a los pacientes el proceso de compartir sus perfiles e historiales médicos con los diversos profesionales de la salud que consulten.
 * Esto podría mejorar la calidad del servicio médico, ayudar a evitar conflictos de fármacos y prescripciones erróneas, reducir los costos y, en emergencias, podría ayudar a salvar vidas.

 * En este ejercicio usted diseñará una clase “inicial” llamada PerfilMedico para una 100 Capítulo 3 Introducción a las clases, los objetos, los métodos y las cadenas persona.
 * Los atributos de la clase deben incluir
 * el primer nombre de la persona,
 * su apellido,
 * sexo,
 * fecha de nacimiento (que debe consistir de atributos separados para el día, mes y año de nacimiento),
 * altura (en centímetros)
 * y peso (en kilogramos).
 * Su clase debe tener un constructor que reciba estos datos.
 * Para cada atributo, debe proveer los métodos establecer y obtener.
 *
 * La clase también debe incluir métodos que calculen y devuelvan la edad del usuario en años,
 * la frecuencia cardiaca máxima
 * y el rango de frecuencia cardiaca esperada (vea el ejercicio 3.16),
 * además del índice de masa corporal (BM).
 *
 * Escriba una aplicación de Java que pida la información de la persona,
 * cree una instancia de un objeto de la clase PerfilMedico para esa persona e imprima la información de ese objeto
 * (incluyendo el primer nombre de la persona, apellido, sexo, fecha de nacimiento, altura y peso),
 * y que después calcule e imprima la edad de esa persona en años, junto con el BMI, la frecuencia cardiaca máxima
 * y el rango de frecuencia cardiaca esperada. También debe mostrar la tabla de valores del BMI VALORES DE BMI
 * Bajo peso: menos de 18.5
 * Normal: entre 18.5 y 24.9
 * Sobrepeso: entre 25 y 29.9 Obeso: 30 o más
 */


public class main {
    public static void main(String[] args) {
        PerfilMedico pm = new PerfilMedico("","","",0,0,0,0,0);
        PerfilMedico pm1 = new PerfilMedico("Ethan","Flores","Hombre",8,8,2006,170,76);

        /**Obtencion de datos*/
        pm.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
        pm.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
        pm.setSexo(JOptionPane.showInputDialog("Ingrese el sexo"));
        pm.setDia(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de nacimiento")));
        pm.setMes(Integer.parseInt(JOptionPane.showInputDialog("Ingrese le mes de nacimiento")));
        pm.setAnio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese le año de nacimiento")));
        pm.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura en cm")));
        pm.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en Kg")));
        JOptionPane.showMessageDialog(null,pm.detalle(pm.getNombre(),pm.getApellido(),pm.getSexo(),pm.getAltura(),pm.getPeso(),pm.getDia(),pm.getMes(),pm.getAnio()));
        System.out.println(pm.detalle(pm.getNombre(),pm.getApellido(),pm.getSexo(),pm.getAltura(),pm.getPeso(),pm.getDia(),pm.getMes(),pm.getAnio()));

    }
}
