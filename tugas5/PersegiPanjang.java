/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author Asus Tuf Gaming
 */
public class PersegiPanjang extends Bangundatar{
    private float panjang;
    private float lebar ;
    
    public void setPanjang (float panjang){
        this.panjang = panjang;
    }
    
    public float getPanjang (){
        return panjang;
    }
    
    public void setLebar(float lebar){
        this.lebar = lebar ;
    }
      public float getLebar (){
        return panjang;
    }
    
    @Override
    protected float luas(){
        return panjang * lebar ;
    }
    @Override
    protected float keliling(){
        return (panjang * lebar)*2 ;
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
