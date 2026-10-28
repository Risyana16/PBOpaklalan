package tugas4;


public class Lingkaran {
    double jari_jari;
    
    public Lingkaran(double jari_jari){
        if(jari_jari <=0){
            this.jari_jari = 1.0;
        }else{
            this.jari_jari = jari_jari;
        }
    }
    
    
    
    void tampil(){
        double luas = 3.14*jari_jari * jari_jari;
        System.out.println("JARI JARI : "+jari_jari);
        System.out.println("LUAS : "+luas);
        
    }
    
    
}
