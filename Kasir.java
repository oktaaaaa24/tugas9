/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package okta9_tugas;

/**
 *
 * @author USER
 */
public class Kasir {
    private double hargaBarang;
    private int jumlahBarang;
    private double diskon;
    
    // Constructor 1: hanya harga barang
    public Kasir(double hargaBarang) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = 1;
        this.diskon = 0;
    }
    
    // Constructor 2: harga dan jumlah barang
    public Kasir(double hargaBarang, int jumlahBarang) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.diskon = 0;
    }
    
    // Constructor 3: semua data lengkap
    public Kasir(double hargaBarang, int jumlahBarang, double diskon) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.diskon = diskon;
    }
    
    public double hitungTotal() {
        double subtotal = hargaBarang * jumlahBarang;
        double potongan = subtotal * (diskon / 100);
        return subtotal - potongan;
    }
    
    public void cetakStruk() {
        System.out.println("=== STRUK PEMBELIAN ===");
        System.out.println("Harga Barang: Rp " + hargaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Total: Rp " + hitungTotal());
        System.out.println("=======================");
    }
    
    public static void main(String[] args) {
        // Test overload constructor
        Kasir transaksi1 = new Kasir(50000);
        Kasir transaksi2 = new Kasir(25000, 3);
        Kasir transaksi3 = new Kasir(100000, 2, 10);
        
        transaksi1.cetakStruk();
        transaksi2.cetakStruk();
        transaksi3.cetakStruk();
    }

}
