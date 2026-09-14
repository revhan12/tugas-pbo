public class Main {
    public static void main(String[] args) {

        Barang barang1 = new Barang("Buku", 15000, 2);
        Barang barang2 = new Barang("Pulpen", 5000, 3);
        Barang barang3 = new Barang("Pensil", 3000, 4);

        barang1.tampilkanInfo();
        barang2.tampilkanInfo();
        barang3.tampilkanInfo();

        double totalBelanja =
                barang1.hitungTotal()
                + barang2.hitungTotal()
                + barang3.hitungTotal();

        System.out.println("Total Belanja : Rp" + totalBelanja);

        System.out.println("\nData barang1:");
        System.out.println("Nama : " + barang1.getNama());
        System.out.println("Harga : Rp" + barang1.getHarga());
        System.out.println("Jumlah : " + barang1.getJumlah());

        barang1.setNama("Buku Tulis");
        barang1.setHarga(20000);
        barang1.setJumlah(3);

        System.out.println("\nSetelah menggunakan setter:");
        barang1.tampilkanInfo();

        barang1.setHarga(-5000);
    }
}
