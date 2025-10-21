package Taller314;

public class Fecha {
    /**Creacion de los atributos de la clase*/
    private int mes;
    private int dia;
    private int anio;

    /**Constructor*/
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    /**Metodos propios de Java*/
    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String mostrarFecha(int dia, int mes,int anio){
        String fecha = "La fecha es " + Integer.toString(dia)+ "/" + Integer.toString(mes)+"/"+Integer.toString(anio);
        return fecha;
    }
}


