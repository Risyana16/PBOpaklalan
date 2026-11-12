
package tugas5;

public class Lingkaran extends Bangundatar{
    private float jari_jari;
    
    public void setJari(float jari_jari){
        this.jari_jari = jari_jari;
    }
    
    public float getJari (){
        return jari_jari;
    }
    
    @Override
    protected float luas(){
        return(jari_jari*jari_jari*3.14f);
    }
    
    
    @Override
    protected float keliling(){
        return (2f*3.14f* jari_jari);
    }
    
    @Override 
    public float getLuas(){
        System.out.println("Luas : "+this.luas());
        return luas();
    }
    
    @Override 
    public float getKeliling(){
        System.out.println("Keliling : "+this.keliling());
        return keliling();
    }
}
