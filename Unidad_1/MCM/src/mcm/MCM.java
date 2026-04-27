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
        // Configuración inicial
        long semilla = 3792;
        int nDigitos = 4;
        int nNumeros = 10;
        
        long x = semilla;

        long divisorCentro = (long) Math.pow(10, nDigitos / 2);
        long moduloCentro = (long) Math.pow(10, nDigitos);

        System.out.println("Generando " + nNumeros + " números usando Cuadrado Medio:");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < nNumeros; i++) {
            
            long cuadrado = x * x;
            
            x = Math.floorDiv(cuadrado, divisorCentro) % moduloCentro;
            
            double u = x / Math.pow(10, nDigitos);

            System.out.printf("I %d: Semilla extraída = %d | Número U = %.4f%n", (i + 1), x, u);
        }
    }
}