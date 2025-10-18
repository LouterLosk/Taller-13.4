package taller133;

import java.util.Scanner;
/**3.13 (La clase Empleado) Cree una clase llamada Empleado,
 que incluya tres variables de instancia: un primer nombre (tipo String),
 un apellido paterno (tipo String) y un salario mensual (double).
 Su clase debe tener un constructor que inicialice las tres variables de instancia.
 Proporcione un método establecer y un método obtener para cada variable de instancia.
 Si el salario mensual no es positivo, no establezca su valor. Escriba una aplicación de
 prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado.
 Cree dos objetos Empleado y muestre el salario anual de cada objeto.
 Después, proporcione a cada Empleado un aumento del 10%
 y muestre el salario anual de cada Empleado otra vez.*/
public class Main {
    public static void main(String[] args) {
        /**Creacion de objetos de la clase Empleados*/
        Empleado e1 = new Empleado("","",0.0);
        Empleado e2 = new Empleado("","",0.0);
        Scanner sc = new Scanner(System.in);

        /**Leer los valores de cada empleado*/
        /**Empleado 1*/
        System.out.println("Primer empleado");
        System.out.print("Primer Nombre: ");
        e1.setPrimerNombre(sc.nextLine());
        System.out.print("Apellido Paterno: ");
        e1.setApellidoPaterno(sc.nextLine());
        System.out.print("Salario Mensual: ");
        e1.setSalarioMensual(sc.nextDouble());
        sc.nextLine();
        System.out.println();

        /**Empleado 2*/
        System.out.println("Segundo Empleado");
        System.out.print("Primer Nombre: ");
        e2.setPrimerNombre(sc.nextLine());
        System.out.print("Apellido Paterno: ");
        e2.setApellidoPaterno(sc.nextLine());
        System.out.print("Salario Mensual: ");
        e2.setSalarioMensual(sc.nextDouble());
        sc.nextLine();

        /** Logica*/
        if (e1.getSalarioMensual()<0){
            e1.setSalarioMensual(0.0);
        }
        if (e2.getSalarioMensual()<0){
            e2.setSalarioMensual(0.0);
        }

        /** LLamada al metodo y despliege*/
        System.out.println();
        System.out.println("Detalle empleado 1");
        System.out.println(e1.detalleEmpleado(e1.getPrimerNombre(),e1.getApellidoPaterno(), e1.getSalarioMensual()));

        System.out.println();
        System.out.println("Detalle empleado 2");
        System.out.println(e2.detalleEmpleado(e2.getPrimerNombre(),e2.getApellidoPaterno(), e2.getSalarioMensual()));

    }
}

