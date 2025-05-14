public class SingleLinkedList15 {
    Node15 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node15 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
        System.out.println();
    }

    public void addFirst(Mahasiswa15 input) {
        Node15 ndInput = new Node15(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
        print();
    }

    public void addLast(Mahasiswa15 input) {
        Node15 ndInput = new Node15(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        print();
    }

    public void insertAfter(String key, Mahasiswa15 input) {
        Node15 temp = head;
        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                Node15 ndInput = new Node15(input, temp.next);
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
        print();
    }

    public void insertAt(int index, Mahasiswa15 input) {
        if (index == 0) {
            addFirst(input);
        } else {
            Node15 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node15(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
            print();
        }
    }
}
