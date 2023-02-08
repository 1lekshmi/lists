public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.add(list,"Enna");
        LinkedList.add(list,"Scarle");
        LinkedList.add(list,"Amber");
        LinkedList.add(list,"Aia");
        LinkedList.add(list,"Selen");

        LinkedList.remove(list, "Amber");
        LinkedList.printList(list);

        LinkedList.remove(list, "Vox");
        LinkedList.printList(list);


        LinkedList.remove(list, "Enna");
        LinkedList.printList(list);
    }
}