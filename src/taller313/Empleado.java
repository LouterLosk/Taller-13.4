package taller313;

/**3.13 (La clase Empleado) Cree una clase llamada Empleado,
 que incluya tres variables de instancia:
 un primer nombre (tipo String),
 un apellido paterno (tipo String)
 y un salario mensual (double).
 Su clase debe tener un constructor que inicialice las tres variables de instancia.
 Proporcione un método establecer y un método obtener para cada variable de instancia.

 Si el salario mensual no es positivo, NO establezca su valor. Escriba una aplicación de
 prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado.
 Cree dos objetos Empleado y muestre el salario anual de cada objeto.
 Después, proporcione a cada Empleado un aumento del 10%
 y muestre el salario anual de cada Empleado otra vez.*/

public class Empleado {
    /**Atibutos de clase*/
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    /**Constructores y destructores**/
    public Empleado(String apellidoPaterno, String primerNombre, double salarioMensual) {
        this.apellidoPaterno = apellidoPaterno;
        this.primerNombre = primerNombre;
        this.salarioMensual = salarioMensual;
    }

    /**Metodos propios de java*/
    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    //setters
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String detalleEmpleado(String Nom,String Ape,Double Sal){
        String datos = "Primer Nombre: " + Nom + "\n" +
                "Apellido: " + Ape + "\n" +
                "Salario: " + Double.toString(Sal) + "\n"+
                "Salario anual: " + Sal * 12;
        return datos;
    }

}
