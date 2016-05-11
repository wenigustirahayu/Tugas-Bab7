package BAB7;

import java.util.Scanner;

public class MainSalon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String produk, layanan, nama;
        double hargaProduk, hargaLayanan;
        System.out.println("===================================");
        System.out.println("           ALIABHATT SALON         ");
        System.out.println("===================================");
        System.out.println("-Pelayanan yang tersedia ");
        System.out.println("1. Smoothing        =   Rp. 100000");
        System.out.println("2. Facial           =   RP. 30000");
        System.out.println("3. Creambath        =   Rp. 25000");
        System.out.println("-Produk yang tersedia ");
        System.out.println("1. Shampo           =   Rp. 20000");
        System.out.println("2. Conditioner      =   Rp. 25000");
        System.out.println("3. Vitamin Rambut   =   RP. 30000");
        System.out.println("===================================");
        int pilihan;
        do {
            System.out.println("            Status Member          ");
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.println("4. Non Member");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Status   :  ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama             : ");
                    nama = in.next();
                    System.out.print("Jenis pelayanan  : ");
                    produk = in.next();
                    System.out.print("Harga pelayanan  : Rp.");
                    hargaProduk = in.nextDouble();
                    System.out.print("Jenis produk     : ");
                    layanan = in.next();
                    System.out.print("Harga produk     : Rp.");
                    hargaLayanan = in.nextDouble();
                    Salon pr = new Premium(produk, layanan, hargaProduk, hargaLayanan, nama);
                    pr.Salon();
                    pr.tampilkan();
                    System.out.println("Total Pembayaran   : Rp." + pr.biaya());
                    System.out.println("========================================");
                    System.out.println("           Terima Kasih            ");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Nama             : ");
                    nama = in.next();
                    System.out.print("Jenis pelayanan  : ");
                    produk = in.next();
                    System.out.print("Harga pelayanan  : Rp.");
                    hargaProduk = in.nextDouble();
                    System.out.print("Jenis produk     : ");
                    layanan = in.next();
                    System.out.print("Harga produk     : Rp.");
                    hargaLayanan = in.nextDouble();
                    Salon go = new Gold(produk, layanan, hargaProduk, hargaLayanan, nama);
                    go.Salon();
                    go.tampilkan();
                    System.out.println("Total Pembayaran   : Rp." + go.biaya());
                    System.out.println("========================================");
                    System.out.println("           Terima Kasih            ");
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Nama             : ");
                    nama = in.next();
                    System.out.print("Jenis pelayanan  : ");
                    produk = in.next();
                    System.out.print("Harga pelayanan  : Rp.");
                    hargaProduk = in.nextDouble();
                    System.out.print("Jenis produk     : ");
                    layanan = in.next();
                    System.out.print("Harga produk     : Rp.");
                    hargaLayanan = in.nextDouble();
                    Salon si = new Silver(produk, layanan, hargaProduk, hargaLayanan, nama);
                    si.Salon();
                    si.tampilkan();
                    System.out.println("Total Pembayaran   : Rp." + si.biaya());
                    System.out.println("========================================");
                    System.out.println("           Terima Kasih            ");
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Nama             : ");
                    nama = in.next();
                    System.out.print("Jenis pelayanan  : ");
                    produk = in.next();
                    System.out.print("Harga pelayanan  : Rp.");
                    hargaProduk = in.nextDouble();
                    System.out.print("Jenis produk     : ");
                    layanan = in.next();
                    System.out.print("Harga produk     : Rp.");
                    hargaLayanan = in.nextDouble();
                    Salon nm = new nonMember(produk, layanan, hargaProduk, hargaLayanan, nama);
                    nm.Salon();
                    nm.tampilkan();
                    System.out.println("Total Pembayaran   : Rp." + nm.biaya());
                    System.out.println("========================================");
                    System.out.println("           Terima Kasih            ");
                    System.out.println();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    System.out.println(" ");
                    break;
            }
        } while (pilihan != 0);
    }
}
