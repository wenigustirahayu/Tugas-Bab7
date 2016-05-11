package BAB7;
public abstract class Salon {
public abstract double diskonLayanan();
public abstract double diskonProduk();    
     public String produk;
     public String jasa;
     public double hargaLayanan;    
     public double hargaProduk;
     public String nama;
     public Salon (String produk, String jasa, double hargaProduk, double hargaLayanan, String nama){     
      this.produk=produk;
      this.jasa=jasa;
      this.hargaProduk=hargaProduk;
      this.hargaLayanan=hargaLayanan;
      this.nama=nama;
        }
     public String getNama(){
         return nama;
     }
     public String getProduk(){
         return produk;
     }
     public String getPelayanan(){
         return jasa;
    } 
     public double getHargaPelayanan(){
         return hargaLayanan;
     }
     public double getHargaProduk(){
         return hargaProduk;
     }
     public void Salon(){
         System.out.println("");
     } 
     public void tampilkan(){
         System.out.println("_______________________________________");
         System.out.println("Nama               : " + nama);
         System.out.println("Jenis Produk       : " + produk);
         System.out.println("Harga Produk       : " + hargaProduk);
         System.out.println("Jenis Pelayan      : " + jasa);
         System.out.println("Harga Pelayanan    : " + hargaLayanan);
         System.out.println("_______________________________________");
        
    }
     public double biaya(){
         double total;
         total=getHargaProduk()+getHargaPelayanan();
         return total;
         
    }
     
}
