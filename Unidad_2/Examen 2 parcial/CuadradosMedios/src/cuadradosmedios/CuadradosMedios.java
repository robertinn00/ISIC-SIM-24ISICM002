/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadradosmedios;

/**
 *
 * @author yahir
 */
// import java.util.Scanner;

public class CuadradosMedios {
    public static void main(String[] args) {
        // Configuración inicial
        long semilla = 1234;
        //int nDigitos = 4;
        int nNumeros = 5;
        
        double[] secuencia = generarSecuencia(semilla, nNumeros);
        
        //long x = semilla;

        //long disvisorCentro = (long) Math.pow(10, nDigitos / 2);
        //long moduloCentro = (long) Math.pow(10, nDigitos);

        //System.out.println("Generando" + nNumeros + "números usando Cuadrado Medio:");
        //System.out.println("----------------------------------!");
       
    }
    public static double[] generarSecuencia(long semilla, int nNumeros) {
        int nDigitos = String.valueOf(semilla).length();
        
        double[] numeros = new double[nNumeros];

        long x = semilla;
        
        for (int i = 0; i < nNumeros; i++) {

            // 1. Elevar al cuadrado
            long cuadrado = x * x;

            // 2. Convertir a String y rellenar con ceros
            String texto = String.format("%0" + (2 * nDigitos) + "d", cuadrado);

            // 3. Extraer los dígitos centrales
            int inicio = nDigitos / 2;
            int fin = inicio + nDigitos;

            String centro = texto.substring(inicio, fin);

            // 4. Nueva semilla
            x = Long.parseLong(centro);

            // 5. Normalizar
            double u = x / Math.pow(10, nDigitos);

            numeros[i] = u;

            // Mostrar proceso
            System.out.printf(
                    "Iteración %d: Cuadrado = %s | Centro = %s | U = %.4f%n",
                    (i + 1),
                    texto,
                    centro,
                    u);
        }
        return numeros;
    }
}