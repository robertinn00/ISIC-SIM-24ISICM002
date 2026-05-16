/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcm;

/**
 *
 * @author yahir

*/

public class MCM {
    public static void main(String[] args) {
        
        long semilla = 21435;
        int cantidad = 50;

        double[] secuencia = generarSecuencia(semilla, cantidad);

        System.out.println("\nSecuencia generada:");

        for (int i = 0; i < secuencia.length; i++) {
            System.out.printf("U%d = %.5f%n", (i + 1), secuencia[i]);
        }
    }

    public static double[] generarSecuencia(long semilla, int cantidad) {

        int d = String.valueOf(semilla).length();

        double[] numeros = new double[cantidad];

        long x = semilla;

        for (int i = 0; i < cantidad; i++) {
            long cuadrado = x * x;
            String cuadradoTexto = String.format("%0" + (2 * d) + "d", cuadrado);

            int inicio = d / 2;
            int fin = inicio + d;

            String centro = cuadradoTexto.substring(inicio, fin);

            x = Long.parseLong(centro);

            numeros[i] = x / Math.pow(10, d);

            System.out.print((i + 1) + "\t\t");
            System.out.print(x + "\t\t");
            System.out.print(cuadradoTexto + "\t\t");
            System.out.print(centro + "\t\t");
            System.out.println(numeros[i]);

        }

            System.out.println("--------------------------------------------------------------------------------");
        return numeros;
    }
}