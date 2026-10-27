/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanbangundatar;

/**
 *
 * @author Asus Tuf Gaming
 */
public class Persegi extends Bangundatar {
    
    float sisi;
    
     Persegi(float sisi){
         super.luas = sisi * sisi;
         super.keliling = sisi *4;
         System.out.println("LUAS persegi : "+luas);
         System.out.println("KELILING persergi : "+keliling);
    }
}

