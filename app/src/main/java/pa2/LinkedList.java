package pa2;

/**
 * A sorted singly linked list of integers
 */
public class LinkedList {

    public class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    /**
     * A node in the linked list
     */
    public Node head;

    /**
     * Constructor
     * Initialize the linked list with a null head
     */
    public LinkedList() {
        this.head = null;
    }

    /** 
     * Add a new node to the linked list 
     * so that the list remains sorted
     * @param value The value to add
     * @return void
     */
    public void add(int value) {
        Node newNode = new Node(value);
        if (this.head == null || this.head.value >= value) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = this.head;
            // Traverse the list to find the correct position
            while (current.next != null && current.next.value < value) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    

    /**
     * Remove the first node with the given value
     * If the value is not found, do nothing
     * @param value The value to remove
     * @return void
     */
    public void remove(int value) {
        if (this.head == null) {
            return;
        }
        if (this.head.value == value) {
            head = head.next;
            return;
        }
        Node current = this.head;
        while (current.next != null && current.next.value != value) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    /**
     * Traverse the linked list RECURSIVELY and returns a string representation of the list
     * @param current
     * @return String
     */
    private String traverse(Node current){
        if (current == null) {
            return "";
        }
        return current.value + " " + traverse(current.next);
    }
    

    /**
     * Traverse the linked list and returns a string representation of the list
     * @return String
     */
    public String traverse(){
        return traverse(head);
    
    }
    public String reverse(){
        return reverse(head).trim();
    }

    /**
     * Traverse the linked list RECURSIVELY and 
     * returns a string representation of the list
     * @return String
     */
    private String reverse(Node current){
        if (current == null) {
            return "";
        }
        return reverse(current.next) + current.value + " ";
    }
    /**
     * Merges two sorted linked list and returns the 
     * merged linked list that is also sorted
     * @param list1 The first sorted linked list
     * @param list2 The second sorted linked list 
     * @return LinkedLists
     */
    public static LinkedList merge(LinkedList list1, LinkedList list2){
            LinkedList result = new LinkedList();
            Node node1 = list1.head;
            Node node2 = list2.head;
    
            while (node1 != null && node2 != null) {
                if (node1.value <= node2.value) {
                    result.add(node1.value);
                    node1 = node1.next;
                } else {
                    result.add(node2.value);
                    node2 = node2.next;
                }
            }
    
            while (node1 != null) {
                result.add(node1.value);
                node1 = node1.next;
            }
    
            while (node2 != null) {
                result.add(node2.value);
                node2 = node2.next;
            }
    
            return result;
        }
    


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.traverse());
        list.remove(3);
        System.out.println(list.traverse());
    }
}