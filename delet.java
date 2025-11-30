/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package okta9_tugas;

/**
 *
 * @author USER
 */
public class delet {
    class Deret {
    private int[] angka;
    
    public Deret(int[] angka) {
        this.angka = angka;
    }
    
    // Pass-by-reference melalui array
    public static void generateDeretGeometri(int[] deret, int rasio) {
        if (deret.length > 0) {
            deret[0] = 6; // nilai awal
            for (int i = 1; i < deret.length; i++) {
                deret[i] = deret[i-1] * rasio;
            }
        }
    }
    
    public void tampilkanDeret() {
        System.out.print("Deret: ");
        for (int num : angka) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class BarisanAngka {
    public static void main(String[] args) {
        int[] deretArray = new int[5]; // untuk menyimpan 6,12,24,48,96
        
        // Pass-by-reference: mengubah array langsung
        Deret.generateDeretGeometri(deretArray, 2);
        
        Deret deretObjek = new Deret(deretArray);
        deretObjek.tampilkanDeret();
    }
}
    
}
