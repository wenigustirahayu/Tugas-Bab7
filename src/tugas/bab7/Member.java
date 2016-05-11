package BAB7;

public class Member extends Salon {

    public Member(String produk, String jasa, double hargaProduk, double hargalayanan, String nama) {
        super(produk, jasa, hargaProduk, hargalayanan, nama);
    }

    public double diskonProduk() {
        return 0.1;
    }

    public void Salon() {
        System.out.println("========================================");
        System.out.println("Anda Member");
    }

    @Override
    public double diskonLayanan() {
        return 0;
    }

    public double biaya() {
        double total;
        total = super.biaya() - super.getHargaProduk() * diskonProduk();
        return total;
    }
}
