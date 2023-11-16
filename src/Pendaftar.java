public class Pendaftar {
    // atribut data
    private final String no;
    private final String nama;
    private final String alamat;
    private final boolean kondisi;

    // constructor Pendaftar
    public Pendaftar(String no, String nama, String alamat, boolean kondisi) {
        this.no = no;
        this.nama = nama;
        this.alamat = alamat;
        this.kondisi = kondisi;
    }

    /*
     * public Pendaftar(String nama, boolean kondisi) {
     * this.nama = nama;
     * this.kondisi = kondisi;
     * }
     */

    // function getter nama
    public String getNama() {
        return nama;
    }

    // function getter kondisi
    public boolean getKondisi() {
        return kondisi;
    }

    @Override
    public String toString() {
        return String.format("%s%s", "", no, nama, alamat);
    }
}
