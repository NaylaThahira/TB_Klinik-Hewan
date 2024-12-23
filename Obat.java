public class Obat {  
    private int idObat;
    private String namaObat;
    private int stock;

    // Konstruktor
    public Obat(String namaObat) {
        this.namaObat = namaObat;
        this.idObat = 0;  // Misalnya diambil dari database atau set default
        this.stock = 0;   // Misalnya diambil dari database atau set default
    }

    public int getIdObat() {
        return idObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Nama Obat: " + namaObat + ", Stock: " + stock + " mg";
    }
}
