/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanbangundatar;

/**
 *
 * @author Asus Tuf Gaming
 */
 public class Lingkaran extends Bangundatar{
    float r;
    
     
    Lingkaran(float r){
        super.keliling = 2 * r* 3.14f;
        super.luas = 3.14f * r *r;
         System.out.println("LUAS LINGKARAN : "+luas);
         System.out.println("KELILING LIngkaran: "+keliling);
                
    }
    
}


