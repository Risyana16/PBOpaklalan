package tugas5;


public class Persegi extends Bangundatar{
   private  float sisi;
   
  public void setSisi(float sisi){
       this.sisi = sisi;
   }
  
  public float getSisi(){
      return sisi;
  }
  
@Override
protected float luas(){
    return sisi * sisi;
}
@Override
protected float keliling(){
    return 4 * sisi;
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
