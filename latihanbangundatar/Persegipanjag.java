/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanbangundatar;

/**
 *
 * @author Asus Tuf Gaming
 */
public class Persegipanjag extends Bangundatar{
    float panjang;
    float lebar;
    
        Persegipanjag(float panjang, float lebar){
                super.keliling = 2* panjang *lebar;
                super.luas = panjang * lebar;
                System.out.println("LUAS persegi panjang : "+luas);
                System.out.println("KELILING persegi panjang : "+keliling);
    }
}
