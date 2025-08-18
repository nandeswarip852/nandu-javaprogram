public class LinkedList {
    Node head; // head of list

    // Linked list node
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insert a new node at the end
    public void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
    }

    // Delete node by key (first occurrence)
    public void deleteNode(int key) {
        Node temp = head, prev = null;

        // If head node itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " -> ");
            tnode = tnode.next;
        }
        System.out.println("null");
    }

    // Driver code
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("Created Linked list:");
        list.printList();

        list.deleteNode(3);
        System.out.println("Linked list after deleting node with data 3:");
        list.printList();
    }
}
