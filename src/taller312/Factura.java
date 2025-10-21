package taller312;

public class Factura {
    /** asignacion de atributos */
    private String  nrPieza;
    private String  dsPieza;
    private int cantCompra;
    private double precioArt;
    /** constructores*/
    public Factura(String nrPieza, String dsPieza, int cantCompra, Double precioArt) {
        this.nrPieza = nrPieza;
        this.dsPieza = dsPieza;
        this.cantCompra = cantCompra;
        this.precioArt = precioArt;
    }
    /**set and get*/
    public String getNrPieza() {
        return nrPieza;
    }

    public String getDsPieza() {
        return dsPieza;
    }

    public int getCantCompra() {
        return cantCompra;
    }

    public Double getPrecioArt() {
        return precioArt;
    }

    public void setNrPieza(String nrPieza) {
        this.nrPieza = nrPieza;
    }

    public void setDsPieza(String dsPieza) {
        this.dsPieza = dsPieza;
    }

    public void setCantCompra(int cantCompra) {
        this.cantCompra = cantCompra;
    }

    public void setPrecioArt(Double precioArt) {
        this.precioArt = precioArt;
    }

    public double obtenerMontoFactura(int cantCompra,double precioArt ){

        double monto = cantCompra * precioArt;
        return monto;
    }

    public String detaller(String nrPieza,String dsPieza,int cantCompra,double precioArt,double monto){
        String det =    "Detalle de la pieza: " + dsPieza + "\n" +
                        "Numero de piezas: " + nrPieza + "\n" +
                        "Cantidad de compra: " + cantCompra + "\n" +
                        "Precio del articulo: " + precioArt + "\n" +
                        "El valor de la compra es de: " + monto;
      return det;
    }

}
