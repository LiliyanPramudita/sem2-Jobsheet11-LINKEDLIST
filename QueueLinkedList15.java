public class QueueLinkedList15 {
    Node15 front, rear;
    int size;

    public QueueLinkedList15() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; // karena berbasis linked list, tidak terbatas kapasitasnya
    }

    public void enqueue(Mahasiswa15 mhs) {
        Node15 newNode = new Node15(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(">> Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dipanggil.");
        } else {
            System.out.print(">> Mahasiswa yang dipanggil: ");
            front.data.tampil();
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print(">> Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print(">> Antrian paling akhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println(">> Antrian telah dikosongkan.");
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi Antrian:");
            Node15 current = front;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }
}
