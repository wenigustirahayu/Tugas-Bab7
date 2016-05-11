package BAB7;
public class Premium extends Member{
 double diskon;
    public Premium(String produk, String jasa, double hargaProduk, double hargalayanan, String nama) {
        super(produk, jasa, hargaProduk, hargalayanan, nama);
    }
    public double  diskonLayanan(){
        return 0.2;
    }
    public double diskonProduk(){
        return super.diskonProduk();
    }
    public void Salon(){
        super.Salon();
        System.out.println("Anda terdaftar sebagai Member PREMIUM");
        System.out.println("-Diskon Pelayanan sebesar 20%");
        System.out.println("-Diskon Produk sebesar 10%");
    }
    public double biaya(){
        double total;
        total = super.biaya()- super.getHargaPelayanan()*diskonLayanan();
        return total;
    }
}
    
