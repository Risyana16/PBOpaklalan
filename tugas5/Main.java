/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author Asus Tuf Gaming
 */
public class Main {
    public static void main(String[] args) {
        // Persegi
        System.out.println("Persegi : ");
        Persegi psg = new Persegi();
        psg.setSisi(10);
        psg.getSisi();
        psg.getLuas();
        psg.getKeliling();
        System.out.println(" ");
        
        // Lingkaran
        System.out.println("Lingkaran : ");
        Lingkaran l = new Lingkaran();
        l.setJari(8);
        l.getJari();
        l.getLuas();
        l.getKeliling();
        System.out.println(" ");
        
        // Persegi Panjang
        System.out.println("Persegi Panjang : ");
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(5);
        pp.setLebar(9);
        pp.getPanjang();
        pp.getLebar();
        pp.getLuas();
        pp.getKeliling();
        System.out.println(" ");
        
        // Segitiga
        System.out.println("Segitiga : ");
        Segitiga s = new Segitiga();
        s.setAlas(5);
        s.setTinggi(9);
        s.getAlas();
        s.getTinggi();
        s.getLuas();
        s.getKeliling();
        System.out.println(" ");
        
    }
}
