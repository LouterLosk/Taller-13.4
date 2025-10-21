/**
 * Cree una clase llamada Factura que una ferretería podría utilizar para representar una factura para un artículo vendido en la tienda.
 * Una Factura debe incluir cuatro piezas de información como variables de instancia:
 * un número de pieza (tipo String),
 * la descripción de la pieza (tipo String),
 * la cantidad de artículos de ese tipo que se van a comprar (tipo int)
 * y el precio por artículo (double).
 *
 * Su clase debe tener un constructor que inicialice las cuatro variables de instancia.
 *
 * Proporcione un método establecer y un método obtener para cada variable de instancia.
 * Además, proporcione un método llamado obtenerMontoFactura, que calcule el monto de la factura
 * (es decir, que multiplique la cantidad de artículos por el precio de cada uno)
 * y después devuelva ese monto como un valor double.
 * Si la cantidad no es positiva, debe establecerse en 0.
 * Si el precio por artículo no es positivo, debe establecerse en 0.0.
 * Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.
 *
 * */


package taller312;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Factura fc1 = new Factura("","",0,0.0);

        /**Leer los valores de la fecha*/
        fc1.setDsPieza(JOptionPane.showInputDialog("Ingrese la descripcion de la pieza."));
        fc1.setNrPieza(JOptionPane.showInputDialog("Ingrese el numero de piezas del producto."));
        fc1.setPrecioArt(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del articulo")));
        fc1.setCantCompra(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantida de compra")));

        if (fc1.getCantCompra() < 0){
            fc1.setCantCompra(0);
        }
        if (fc1.getPrecioArt() < 0){
            fc1.setPrecioArt(0.0);
        }
        /**Despliegue de valores*/
        JOptionPane.showMessageDialog(null,fc1.detaller(fc1.getNrPieza(),fc1.getDsPieza(), fc1.getCantCompra(), fc1.getPrecioArt(),fc1.obtenerMontoFactura(fc1.getCantCompra(),fc1.getPrecioArt())));
    }
}
