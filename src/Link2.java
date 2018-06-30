import java.util.Scanner;

public class Link2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Node4 first = new Node4();
        Node4 ptr = first;
        for (int i = 0; i < str.length(); i++) {
            ptr.value = str.charAt(i);
            ptr.next = new Node4();
            ptr = ptr.next;
        }
        ptr.value = '\0';
        remove(first);
        duplicate(first);
    }

    static void print(Node4 n) {
        Node4 ptr = n;
        while (ptr != null) {
            System.out.print(ptr.value);
            ptr = ptr.next;
        }
    }

    static int len(Node4 l) {
        Node4 ptr = l;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    static void remove(Node4 name) {
        Node4 ptr = name;
            while (ptr != null && ptr.next != null) {
                if (ptr.value == 'a') {
                    ptr.next = ptr.next.next;
                }
                else {
                    ptr = ptr.next;
                }
            }
    }

    static void duplicate(Node4 head) {
        Node4 current = head;
        while (current != null) {
            while (current.next != null) {
                if (current.next.value == current.value) {
                    current.next = current.next.next;
                }
                else {
                    current = current.next;
                }
            }
            current = current.next;
        }
    }

    static void reverse (Node4 l) {
        Node4 ptr = l;


    }
}


class Node4 {
    char value;
    Node4 next;
    Node4(char v) {
        value = v;
    }
    Node4() {
    }
}


