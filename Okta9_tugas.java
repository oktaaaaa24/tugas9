/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package okta9_tugas;

/**
 *
 * @author USER
 */
public class Okta9_tugas {

    public static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * hitungFaktorial(n - 1);
    }
    
    public static void main(String[] args) {
        int angka = 5;
        System.out.println("Faktorial dari " + angka + " adalah: " + hitungFaktorial(angka));
    }
}