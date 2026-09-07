class Barang {
    String nama;
    double harga;
    int jumlah;

    Barang(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    double hitungTotal() {
        return harga * jumlah;
    }

    void tampilkanInfo() {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Total       : Rp" + hitungTotal());
        System.out.println("----------------------------");
    }
}
