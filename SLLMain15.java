public class SLLMain15 {
    public static void main(String[] args) {
        SingleLinkedList15 data = new SingleLinkedList15();

        Mahasiswa15 mhs1 = new Mahasiswa15("22212202", "Cintia", "3C", 3.5);
        Mahasiswa15 mhs2 = new Mahasiswa15("23212201", "Bimon", "2B", 3.8);

        data.addFirst(mhs1);
        data.addLast(mhs2);

        System.out.println("data index 1 :");
        data.getData(1).tampilInformasi();

        System.out.println("data mahasiswa an Bimon berada pada index : " + data.indexOf("23212201"));
        System.out.println();

        System.out.println("Isi Linked List:");
        data.print();

        System.out.println("Isi Linked List:");
        data.removeFirst();
    }
}
