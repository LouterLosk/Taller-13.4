package taller316;
import java.lang.classfile.instruction.StackInstruction;
import java.time.LocalDateTime;
/**Cree una clase llamada FrecuenciasCardiacas.
 Los atributos de la clase deben incluir el primer
 nombre de la persona,
 su apellido
 y fecha de nacimiento
 (la cual debe consistir de atributos independientes para el mes, día y año de nacimiento).
 */
public class FrecuenciasCardiacas {
    LocalDateTime ahora = LocalDateTime.now();
    /** Creacion de los atributos*/
    private String Nombre;
    private String Apellido;
    private int dia;
    private int mes;
    private int anio;

    /**Constructor*/
    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        Nombre = nombre;
        Apellido = apellido;
        this.dia = dia;
        this.anio = anio;
        this.mes = mes;
    }
    /**Metodos de java*/
    public String getNombre() {
        return Nombre;
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**La clase también debe incluir un método que calcule y devuelva la edad de la persona (en años),*/
    public int calculoEdad(int anio){
        int anioNow = ahora.getYear();       // Obtiene el año
        return anioNow - anio;
    }
    /**un método que calcule y devuelva la frecuencia cardiaca máxima de esa persona
     * la fórmula para calcular su frecuencia cardiaca máxima en pulsos por minuto es 220 menos su edad en años.*/
    public int frecuenciaMax(int edad){
        return 220 - edad;
    }
    /**Une los dias,meses y anios en un solo formato*/

    public String fechaNacimiento(int dia , int mes,int anio){
        return dia +"/" + mes + "/" + anio;
    }

    /**Su frecuencia cardiaca esperada tiene un rango que está entre el 50 y el 85% de su frecuencia cardiaca máxima.*/
    public String frecuenciaEsperada(int edad){
        int minimo = (int)(frecuenciaMax(edad) * 0.50);
        int maximo = (int)(frecuenciaMax(edad) * 0.85);
        return minimo + " - " + maximo + " pulsos por minuto";
    }

    /**(incluyendo el primer nombre de la persona, su apellido y fecha de nacimiento)*/
    public String detalle(String Nombre,String Apellido,int dia , int mes,int anio){
        String det =    "Nombre: " + Nombre + "\n" +
                        "Apellido: " + Apellido + "\n" +
                        "Fecha de nacimiento: " + fechaNacimiento(dia,mes,anio) +"\n" +
                        "Edad: " + calculoEdad(anio)+ "\n" +
                        "Frecuencia maxima: " + frecuenciaMax(calculoEdad(anio)) + "\n" +
                        "Rango de frecuencia esperada:" + "\n "+
                        frecuenciaEsperada(calculoEdad(anio));
        return det;
    }

}
