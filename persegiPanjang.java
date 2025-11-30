/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package okta9_tugas;

/**
 *
 * @author USER
 */
public class persegiPanjang {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    // Method dengan objek sebagai parameter
    public static double hitungLuasHitam(PersegiPanjang luar, PersegiPanjang dalam) {
        return luar.hitungLuas() - dalam.hitungLuas();
    }
}

public class LuasBidangHitam {
    public static void main(String[] args) {
        // Asumsi: persegi panjang besar dan kecil di dalamnya
        PersegiPanjang luar = new PersegiPanjang(10, 8);
        PersegiPanjang dalam = new PersegiPanjang(6, 4);
        
        double luasHitam = PersegiPanjang.hitungLuasHitam(luar, dalam);
        System.out.println("Luas bidang hitam: " + luasHitam);
    }
}
