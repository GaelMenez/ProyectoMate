/**
 *  Programa que muestra el uso de las clases
 *  Punto2D y OperacionesConPuntos2D
 *
 *  Actividad a realizar:
 *  1.- Pedir los datos en enorno gráfico
 *  2.- Probar los métodos de OperacionesConPuntos2D
 *
 *   @version 22/Sep/22
 */

package Metricas1;

import javax.swing.*;

public class UsaOperacionesConPuntos2D {



    public static void main(String... something){

        double ax = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));
        double ay = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y"));

        Punto2D a = new Punto2D(ax, ay);
        Punto2D b = new Punto2D();
        double norma = OperacionesConPuntos2D.norma(a);
        double dAB = OperacionesConPuntos2D.metricaEuclidiana(a,b);
        double diAB = OperacionesConPuntos2D.metricaTaxista(a,b);
        double disAb = OperacionesConPuntos2D.dotProduct(a,b);
        double areaT = OperacionesConPuntos2D.area(a,b);

        
        JOptionPane.showMessageDialog(null, "La norma de " + a + " es : " + norma );
        JOptionPane.showMessageDialog(null, "La distancia del punto " + a + "al punto " + b + "es " + dAB );
        JOptionPane.showMessageDialog(null, "La metrica taxista de los puntos " + a + " y " + b + "es " + diAB );
        JOptionPane.showMessageDialog(null, "El producto de los puntos " + a + " y " + b + "es " + disAb );
        JOptionPane.showMessageDialog(null, "El area del triangulo formado por las metricas es " + areaT );
    }
}
