
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
    }
}
