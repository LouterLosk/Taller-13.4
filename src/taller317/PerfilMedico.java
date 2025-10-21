package taller317;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

/**
 * Los atributos de la clase deben incluir
 * el primer nombre de la persona,
 * su apellido,
 * sexo,
 * fecha de nacimiento (que debe consistir de atributos separados para el día, mes y año de nacimiento),
 * altura (en centímetros)
 * y peso (en kilogramos). */
public class PerfilMedico {
    DecimalFormat formato = new DecimalFormat("#.##");
    LocalDateTime ahora = LocalDateTime.now();
    /**Creacion de atributos*/
    private String Nombre;
    private String Apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private int altura;
    private double peso;

    /**Constructores*/

    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int anio, int altura, double peso) {
        Nombre = nombre;
        Apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }

    /**Metodos propios de java*/

    public String getNombre() {
        return Nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
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

    public String getSexo() {
        return sexo;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    /**Metodos propios*/

    /**Une los dias,meses y anios en un solo formato*/
    public String fechaNacimiento(int dia , int mes,int anio){
        return dia +"/" + mes + "/" + anio;
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
    /**Su frecuencia cardiaca esperada tiene un rango que está entre el 50 y el 85% de su frecuencia cardiaca máxima.*/
    public String frecuenciaEsperada(int edad){
        int minimo = (int)(frecuenciaMax(edad) * 0.50);
        int maximo = (int)(frecuenciaMax(edad) * 0.85);
        return minimo + " - " + maximo + " pulsos por minuto";
    }

    /**Indice de masa corporal(IMC)*/
    public double IMC(double peso,double altura){
        altura = altura / 100;
        double imc = peso / (altura * altura);
        return imc;
    }

    /**
     * el rango de frecuencia cardiaca esperada. También debe mostrar la tabla de valores del BMI VALORES DE BMI
     * Bajo peso: menos de 18.5
     * Normal: entre 18.5 y 24.9
     * Sobrepeso: entre 25 y 29.9
     * Obeso: 30 o más*/
    public String calificaionIMC(double imc){
        String cali;
        if (imc < 18.5) {
            cali = "Clasificación: Bajo peso";
        } else if (imc < 25) {
            cali="Clasificación: Normal";
        } else if (imc < 30) {
            cali = "Clasificación: Sobrepeso";
        } else {
            cali = "Clasificación: Obesidad";
        }
        return cali;
    }

    /**(incluyendo el primer nombre de la persona, su apellido y fecha de nacimiento)*/
    public String detalle(String nombre,String apellido,String sexo,int altura,double peso,int dia , int mes,int anio){
        String det =
                "Datos del paciente" + "\n" +
                "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Sexo: " + sexo + "\n" +
                "Fecha de nacimiento: " + fechaNacimiento(dia,mes,anio) +"\n" +
                "Altura: " + altura +" cm"+"\n" +
                "Peso: " + peso + " Kilos"+ "\n" +
                "----------------------------" + "\n" +
                "Edad: " + calculoEdad(anio)+" años" + "\n" +
                "IMC: " + formato.format(IMC(peso,altura)) +"\n" +
                calificaionIMC(IMC(peso,altura)) +"\n" +
                "Frecuencia maxima: " + frecuenciaMax(calculoEdad(anio)) + "\n" +
                "Rango de frecuencia esperada:" + "\n "+
                frecuenciaEsperada(calculoEdad(anio));
        return det;
    }
}
