/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package okta9_tugas;

/**
 *
 * @author USER
 */
public class KonverensiBiner {
    public static String keBiner(int bilangan) {
        if (bilangan == 0) {
            return "0";
        }
        
        StringBuilder biner = new StringBuilder();
        while (bilangan > 0) {
            biner.insert(0, bilangan % 2);
            bilangan /= 2;
        }
        return biner.toString();
    }
    
    public static void main(String[] args) {
        int bilangan = 10;
        System.out.println("Bilangan " + bilangan + " dalam biner: " + keBiner(bilangan));
    }
    
}
