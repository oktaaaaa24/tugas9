/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package okta9_tugas;

/**
 *
 * @author USER
 */
public class pangkat {
    public static double hitungPangkat(double basis, int eksponen) {
        double hasil = 1;
        for (int i = 0; i < Math.abs(eksponen); i++) {
            hasil *= basis;
        }
        
        if (eksponen < 0) {
            return 1 / hasil;
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        double basis = 2;
        int eksponen = 3;
        System.out.println(basis + " pangkat " + eksponen + " = " + hitungPangkat(basis, eksponen));
    }
    
}
