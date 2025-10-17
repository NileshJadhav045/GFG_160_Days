
public class Day_65 {

    static class Node {

        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node Next = null;
        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    public static void printList(Node node) {
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
        head = reverseList(head);
        printList(head);
    }
}
