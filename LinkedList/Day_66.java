
public class Day_66 {

    static class Node {

        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    static Node rotate(Node head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int len = 1;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }

        curr.next = head;
        curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        head = curr.next;
        curr.next = null;
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head = rotate(head, 3);
        printList(head);
    }
}
