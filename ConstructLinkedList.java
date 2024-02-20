import java.util.ArrayList;

public class ConstructLinkedList {

    public static Node insertNode(Node head, Node newNode) {
        Node temp = null;
        if (head == null) {
            head = newNode;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        if (temp.next == null) {
            System.out.println(temp.data);
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertNode(head, new Node(1));
        head = insertNode(head, new Node(2));
        head = insertNode(head, new Node(5));
        head = insertNode(head, new Node(3));
        head = insertNode(head, new Node(4));
        printList(head);
    }
}

class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}