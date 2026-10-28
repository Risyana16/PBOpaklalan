package tugas4;


public class Main {
    public static void main(String[] args) {
        Buku b = new Buku("CINTA AKU");
        b.tampil();
        System.out.println("====================================");
        Mobil m = new Mobil("TOYATA","KIJANG KAPSUL");
        m.tampil();
        System.out.println("");
        Mobil m2 = new Mobil("TOYOTA","KIJANG KAPSUL ",2026);
        m2.tampil();
        System.out.println("====================================");
        Lingkaran l = new Lingkaran(5);
        l.tampil();
    }
}
