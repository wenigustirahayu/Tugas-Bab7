package BAB7;
public class Gold extends Member {
    double diskon;

    public Gold(String produk, String jasa, double hargaProduk, double hargajasa, String nama) {
        super(produk, jasa, hargaProduk, hargajasa, nama);
    }
   
    public double diskonLayanan(){
        return 0.15;
    }
    public double diskonProduk(){
        return super.diskonProduk();
    }
    public void Salon(){
        super.Salon();
        System.out.println("Anda terdaftar sebagai Member GOLD");
        System.out.println("-Diskon Pelayanan sebesar 15%");
        System.out.println("-Diskon Produk sebesar 10%");
        System.out.println("========================================");
        System.out.println("");
    }    
    public double biaya(){
        double total;
        total = super.biaya()- super.getHargaPelayanan()*diskonLayanan();
        return total;
    }
 }
