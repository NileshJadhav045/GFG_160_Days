

public class Day_67 {

    static class Node {

        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    static Node sortedMerge(Node head1, Node head2) {
        // code here
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        if (head1.data > head2.data) {
            Node temp = head1;
            head1 = head2;
            head2 = temp;
        }
        Node ans = head1;
        while (head1 != null && head2 != null) {
            Node temp = null;
            while (head1 != null && head1.data <= head2.data) {
                temp = head1;
                head1 = head1.next;
            }
            temp.next = head2;
            Node t = head1;
            head1 = head2;
            head2 = t;
        }
        return ans;

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
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);
        Node head = sortedMerge(head1, head2);
        printList(head);
    }
}
