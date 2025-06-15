package DSA.program;

import LinkedList.DoublyLinkedList;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Data structure tutorial Begins");
        

//        LinkedListExcecise1<Integer> list = new LinkedListExcecise1<Integer>();  
//        list.insertNode(1);
//        list.insertNode(2);
//        list.insertNode(3);
//        list.insertNode(4);
//        list.display();
//        list.reverse();
//        list.display();
        
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtBegining(1);
        dl.insertAtBegining(2);
        dl.insertAtEnd(3);
        dl.display();
        dl.displayRev();
        System.out.println(" ");
        dl.deleteHeadNode();
        dl.deleteTailNode();
        dl.display();
        System.out.println(" ");
        dl.displayRev();

    }
}
