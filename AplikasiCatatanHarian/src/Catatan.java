import java.time.LocalDate;


/**
 *Kelas Catatan merepresentasikan sebuah catatan dengan judul, isi, dan tanggal.
 * @author LENOVO
 */
public class Catatan { 
    private String judul; // Atribut untuk menyimpan judul catatan
    private String isi; // Atribut untuk menyimpan isi catatan
    private LocalDate tanggal; // Atribut untuk menyimpan tanggal pembuatan catatan
    /**
     * Konstruktor untuk membuat objek Catatan dengan judul, isi, dan tanggal.
     *
     * @param judul   Judul catatan
     * @param isi     Isi catatan
     * @param tanggal Tanggal pembuatan catatan
     */
    public Catatan(String judul, String isi, LocalDate tanggal) {
        this.judul = judul;
        this.isi = isi;
        this.tanggal = tanggal;
    }

    // Getter untuk mendapatkan nilai judul catatan
    // Setter untuk mengubah nilai judul catatan
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }
    
    // Getter untuk mendapatkan isi catatan
    // Setter untuk mengubah isi catatan
    public String getIsi() { return isi; }
    public void setIsi(String isi) { this.isi = isi; }
       
    // Getter untuk mendapatkan tanggal catatan
    // Setter untuk mengubah tanggal catatan
    public LocalDate getTanggal() { return tanggal; }
    public void setTanggal(LocalDate tanggal) { this.tanggal = tanggal; }
    
    /**
     * Mengoverride metode toString() untuk memberikan representasi string
     * dari objek Catatan.
     *
     * @return String yang merepresentasikan judul dan tanggal catatan.
     */
    @Override
    public String toString() { 
    // Mengembalikan string dalam format "judul (tanggal)"
        return judul + " (" + tanggal + ")";
    }

}
