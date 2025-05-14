public class SingleLinkedList15 {
    Node15 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node15 tmp = head;
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
    public Mahasiswa15 getData(int index) {
        Node15 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    
    public int indexOf(String key) {
        Node15 temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak bisa dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        print();
    }
    
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak bisa dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node15 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        print();
    }
    
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak bisa dihapus");
        } else {
            Node15 temp = head;
            while (temp != null) {
                if ((temp.next != null) && temp.next.data.nim.equals(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
        print();
    }
    
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node15 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
            print();
        }
    }
    
}
