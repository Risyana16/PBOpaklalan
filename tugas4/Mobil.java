package tugas4;


public class Mobil {
    String merek;
    String model;
    int tahun;
            
    public Mobil(String merek, String model){
        this.merek = merek;
        this.model = model;
        this.tahun = 2025;
        
    }
    public Mobil(String merek, String model,int tahun){
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
        
    }
    
    
    void tampil (){
        System.out.println("Merek : "+merek);
        System.out.println("Merek : "+model);
        System.out.println("Merek : "+tahun);
        
    }
}
