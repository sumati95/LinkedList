public class ReverseLinkedList {
    public static void main(String[] args) {
        Node data = new Node(4);
        data.next = new Node(12);
        data.next.next = new Node(25);
        data.next.next.next = new Node(11);
        data.next.next.next.next = new Node(7);
        print(reverse(data));
    }

    static Node reverse(Node head) {
        Node current = head;
        Node next = null;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static void print(Node n) {
        Node ptr = n;
        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
    }
}

class Node {
    int value;
    Node next;
    Node(int v) {
        value = v;
    }
}