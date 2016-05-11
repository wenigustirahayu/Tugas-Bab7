package BAB7;

public class nonMember extends Salon {

    double diskon;

    public nonMember(String produk, String jasa, double hargaProduk, double hargalayanan, String nama) {
        super(produk, jasa, hargaProduk, hargalayanan, nama);
    }

    public double diskonLayanan() {
        return 0;
    }

    public double diskonProduk() {
        diskon = 0;
        return diskon;
    }

    public void anggota() {
        System.out.println("Anda bukan Member, non Member tidak ada diskon!");
    }

    public double bayar() {
        double total;
        total = super.biaya() - super.getHargaProduk() * diskonProduk();
        return total;
    }
}

