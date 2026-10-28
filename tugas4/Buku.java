package tugas4;



public class Buku {
    String judul;
    String pengarang;
    int tahun_terbit;
    
    public Buku(String judul,String pengarang, int tahun_terbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
    }
    
    public Buku(String judul,String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
    }
    
    public Buku(String judul){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
    }
    
    void tampil(){
        System.out.println("Judul : "+judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Tahun terbit : "+tahun_terbit);
    }
}
