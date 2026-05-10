package solution;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    Node head;

    // 1. Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 2. Delete the first node with given value
    public void deleteByValue(int data) {
        if (head == null) return;

        // If the head itself needs to be deleted
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next; // "Skip" the deleted node
        }
    }

    // 3. Reverse the list in-place
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev forward
            current = next;      // Move current forward
        }
        head = prev;
    }

    // 4. Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        // Step 1: Insert 1, 2, 3, 4, 5
        int[] vals = {1, 2, 3, 4, 5};
        for (int v : vals) list.insertAtEnd(v);
        System.out.print("After insert: ");
        list.printList();

        // Step 2: Delete 3
        list.deleteByValue(3);
        System.out.print("After delete 3: ");
        list.printList();

        // Step 3: Reverse
        list.reverse();
        System.out.print("After reverse: ");
        list.printList();
    }
}