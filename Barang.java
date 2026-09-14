class Barang {
    private String nama;
    private double harga;
    private int jumlah;

    Barang(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif!");
        }
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        if (jumlah >= 0) {
            this.jumlah = jumlah;
        } else {
            System.out.println("Jumlah barang tidak boleh negatif!");
        }
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
