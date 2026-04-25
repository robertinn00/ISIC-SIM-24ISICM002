/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sim.pkg01.pkg02;

/**
 *
 * @author yahir
 */
public class SIM0102 {

    public static void MetodoLCG(int a, int m, int xn){
        for (int i = 1; i<= 5; i++){
            int Xn1 = (a * xn)%m;
             double Un = (double) Xn1/(m);
            
            System.out.println(i + "\t\t" + Xn1 + "\t" + Un);
            xn = Xn1;
        }
            
    }
    public static void main(String[] args) {
        MetodoLCG(22695477, 65536, 7);
    }
    
}
