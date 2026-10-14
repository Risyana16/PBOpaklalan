
package tugas2;

import java.util.Scanner;



class Sepedah{
    int jarak_tempuh = 0;
    String merek;
    int pilihan;
    String informasi;
    
    void maju(){
        jarak_tempuh +=10;
        System.out.println("Jarak Tempuh Sepedah : " + jarak_tempuh + "KM");
    }
    void berhenti(){
        System.out.println("Sepedah Berhenti");
        System.out.println("Objek Sepedah"+ merek +  ", jarak tempuh " + jarak_tempuh + "KM");
    }
    void mundur(){
        jarak_tempuh -=5;
        System.out.println("Bergerak mundur : " + jarak_tempuh + "KM");
    }
    
    void informasi(){
        System.out.println("Informasi : " +merek+ " ,jarak tempuh " + jarak_tempuh + "KM");
    }
    
    void Pilihan(){
        do{
            
            System.out.println("MENU");
            System.out.println("BERGERRAK MAJU TEKAN 1");
            System.out.println("BERGERRAK MUNDUR TEKAN 2");
            System.out.println("BERHENTI TEKAN 3");
            System.out.println("KELUAR PROGRAM TEKAN 0");
            
            Scanner input = new Scanner (System.in);
            System.out.print("Pilih : ");
            pilihan = input.nextInt();
            System.out.println("");
            
            if(pilihan==1){
                maju();
                informasi();
            }else if(pilihan==2){
                mundur();
                informasi();
            }else if(pilihan==3){
                berhenti();
                
            }else if(pilihan==0){
                System.out.println("Keluar Program");
                System.out.println("TERIMAKASIH");
            }else{
                System.out.println("Pilihan tidak ada");
            }
            System.out.println("");
        }while (pilihan != 0);
    
}
}

