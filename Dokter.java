public class Dokter implements Diagnosable {
    private String nama;

    public Dokter(String nama) {
        this.nama = nama;
    }

    @Override
    public void diagnosa(String keluhan, String namaDokter, Obat obat, int dosis) {
        // Metode diagnosa sekarang tidak mencetak informasi apa pun ke konsol.
        // Anda dapat menambahkan logika lain di sini jika diperlukan.
    }

    public String getNama() {
        return nama;
    }
}
