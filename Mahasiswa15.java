public class Mahasiswa15 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa15() {
    }

    public Mahasiswa15(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-4s %.1f\n", nama, nim, kelas, ipk);
    }
}
