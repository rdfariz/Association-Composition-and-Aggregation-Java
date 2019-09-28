public class Main {

    public static void main(String[] args) {
        Jurusan jrs      = new Jurusan();
        Jurusan jrsInput = new Jurusan("FIT", "Fakultas Ilmu Terapan");
        jrs.addMahasiswa(new Mahasiswa("6706184127", "RdFariz"));
        jrs.addMahasiswa(new Mahasiswa("6706184128", "RdFariz2"));
        jrs.addMahasiswa(new Mahasiswa("6706184129", "RdFariz3"));
        jrs.addMahasiswa(new Mahasiswa("6706184130", "RdFariz4"));
        jrs.addMahasiswa(new Mahasiswa("6706184131", "RdFariz5"));

        System.out.println("Kode Jurusan: " + jrsInput.getKodeJurusan());
        System.out.println("Nama Jurusan: " + jrsInput.getNamaJurusan());
        System.out.println("\nDaftar Mahasiswa: ("+jrs.getJumlahMhs()+" Orang)");
        jrs.displayMahasiswa();
    }

}
