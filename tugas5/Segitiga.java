/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author Asus Tuf Gaming
 */
public class Segitiga extends Bangundatar {
    private float alas;
    private float tinggi;
    
    public void setAlas(float alas){
        this.alas = alas;
    }
    
    public float getAlas(){
        return alas;
    }
    
    public void setTinggi(float tinggi){
        this.tinggi = tinggi;
    }
    
    public float getTinggi(){
        return tinggi;
    }
    
    
    @Override
    protected float luas(){
        return 0.5f * alas * tinggi;
    }
    
    @Override
    protected float keliling(){
        return 3*alas;
    }
    
     @Override
    public float getLuas(){
         System.out.println("Luas : "+this.luas());
        return luas() ;
    }
    
    @Override
    public float getKeliling(){
         System.out.println("Keliling : "+this.keliling());
        return keliling();
    }
    
}
