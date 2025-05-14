public class SLLMain15 {
    public static void main(String[] args) {
        SingleLinkedList15 data = new SingleLinkedList15();

        Mahasiswa15 mhs1 = new Mahasiswa15("21212203", "Dirga", "4D", 3.6);
        Mahasiswa15 mhs2 = new Mahasiswa15("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa15 mhs3 = new Mahasiswa15("22212202", "Cintia", "3C", 3.5);
        Mahasiswa15 mhs4 = new Mahasiswa15("23212201", "Bimon", "2B", 3.8);

        data.print(); // Tampilkan kondisi awal (Linked list kosong)
        data.addFirst(mhs1);        // Dirga
        data.addLast(mhs2);         // Alvaro
        data.insertAt(1, mhs3);     // Cintia di index 1
        data.insertAfter("22212202", mhs4); // Bimon setelah Cintia
    }
}