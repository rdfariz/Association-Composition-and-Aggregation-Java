import java.util.ArrayList;

public class Jurusan {
    private String kodeJurusan, namaJurusan;
    private int jumlahMhs;
    private ArrayList<Mahasiswa> daftar = new ArrayList<Mahasiswa>();

    public Jurusan () {}

    public Jurusan (String kodeJurusan, String namaJurusan) {
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }

    public void addMahasiswa (Mahasiswa m) {
        daftar.add(m);
        jumlahMhs = daftar.size();
    }

    public void displayMahasiswa () {
        daftar.forEach(data-> System.out.println(data.getNim() + " / " + data.getNama()));
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public int getJumlahMhs() {
        return jumlahMhs;
    }
}
