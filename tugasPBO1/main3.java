
package Tugas1;

import java.util.Scanner;


public class main3 {
    public static void main(String[] args) {
        Scanner inputJari = new Scanner(System.in);
        float jari, keliling, luas;
        float PI = 3.14F;
       
        System.out.print("Masukan jari jari : ");
        jari = inputJari.nextFloat();
        luas = PI*jari*jari;
        keliling = 2*PI*jari;
        
        System.out.println(luas);
        System.out.println(keliling);
        
    }
}
