package _10_dsa_list.exercise;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        myList.add(0, 9);
        myList.add(1, 8);
        myList.add(2, 7);
        myList.add(3, 6);
        myList.add(5, 6);
        myList.add(3, 7);
        myList.add(6, 0);

        myList.size();
        myList.addFirst(0);
        myList.remove(4);
        myList.indexOf(6);
        myList.addLast(5);
        myList.contains(3);
        myList.get(5);
        myList.printList();
    }
}