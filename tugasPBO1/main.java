
package Tugas1;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        System.out.print("Masukkan Tahun (1909 - 2024) : ");
        Scanner inputkan = new Scanner(System.in);
        int tahun;
        tahun = inputkan.nextInt();
        
        if(tahun % 4 == 0){
            System.out.println(tahun + " adalah tahun Kabisat");
        }else{
            System.out.println(tahun + "Bukan tahun Kabisat");
        }
        
    }
    
}
