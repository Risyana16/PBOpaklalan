
package Tugas1;

import java.util.Scanner;


public class main4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        int jam, menit, detik, totdet;
        System.out.print("Inputkan Jam : ");
        jam = Input.nextInt();
        System.out.print("Inputkan Menit : ");
        menit = Input.nextInt();
        System.out.print("Inputkan Detik : ");
        detik = Input.nextInt();
        
        totdet = jam*3600+menit*60+detik;
        
        System.out.println(totdet);
    }
}
