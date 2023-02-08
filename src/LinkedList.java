import java.util.Objects;

public class LinkedList {

    Node head;

    static class Node{
        String data;
        Node next_node;
        Node(String s){
            data = s;
            next_node = null;
        }
    }

//    adding a new node
    public static void add(LinkedList list, String string) {
        Node new_node = new Node(string);

//        if the list is empty add the new node as the head
        if (list.head == null) {
            list.head = new_node;
        }
//        else find the last node and add the new node to the end of the list
        else {
            Node last_node = list.head;
            while (last_node.next_node != null){
                last_node = last_node.next_node;
            }
            last_node.next_node = new_node;
        }
    }

//    printing the list
    public static void printList(LinkedList list) {
        Node current_node = list.head;
        while(current_node != null){
            System.out.println(current_node.data + " ");
            current_node = current_node.next_node;
        }
        System.out.println();
    }

//    removing a node (1- at the head,  2- anywhere else, 3- value not in the list)
    public static void remove(LinkedList list, String value){

        Node current_node = list.head;
        Node prev = null;

//        1 - at the head
        if (current_node != null && current_node.data.equals(value)){
//            replacing the head node with the next node
            list.head = current_node.next_node;
            System.out.println(value + " found and removed");
        }

//        2- anywhere else
        while (current_node != null && !Objects.equals(value, current_node.data)){
            prev = current_node;
            current_node = current_node.next_node;

        }

        if (current_node != null && prev != null){
            prev.next_node = current_node.next_node;
            System.out.println(value + " found and removed");
        }

//        value not in the list
        if (current_node == null){
            System.out.println(value + " not in the list");
        }

    }

}
