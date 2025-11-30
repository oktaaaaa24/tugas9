/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package okta9_tugas;

/**
 *
 * @author USER
 */
public class nilai {
    class Nilai {
    private int[] nilaiArray;
    
    public Nilai(int[] nilai) {
        this.nilaiArray = nilai;
    }
    
    public double hitungRataRata() {
        if (nilaiArray.length == 0) return 0;
        
        int total = 0;
        for (int nilai : nilaiArray) {
            total += nilai;
        }
        return (double) total / nilaiArray.length;
    }
    
    public void tampilkanNilai() {
        System.out.print("Nilai: ");
        for (int nilai : nilaiArray) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}

class PengolahNilai {
    // Method yang mengembalikan objek
    public static Nilai buatObjekNilai(int[] dataNilai) {
        return new Nilai(dataNilai);
    }
}

public class RataRataNilai {
    public static void main(String[] args) {
        int[] data = {85, 90, 78, 92, 88};
        
        // Membuat objek melalui method yang mengembalikan objek
        Nilai nilaiObjek = PengolahNilai.buatObjekNilai(data);
        
        nilaiObjek.tampilkanNilai();
        System.out.println("Rata-rata: " + nilaiObjek.hitungRataRata());
    }
}
    
}
