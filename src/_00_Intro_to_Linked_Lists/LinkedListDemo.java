package _00_Intro_to_Linked_Lists;

public class LinkedListDemo {

    public static void main(String[] args) {

        /*
         * A LinkedList is a linear data structure, but unlike an ArrayList or
         * Array the data is not stored in contiguous memory locations.
         * 
         * Instead, each data node contains a reference that says where the next
         * node can be found.
         * 
         * Note: In the Node example provided there is also reference that
         * points back to the previous node. This is a referred to as a
         * doubly-linked list.
         * 
         * 1. Read through the LinkedList and Node classes.
         * 
         * 2. Create a LinkedList of any type you like.
         * 
         * 3. Try using some LinkedList methods to add, remove and print a few
         * elements.
         * 
         * 4. Save the head or tail reference into a Node Object and use
         * references to traverse through the list and perform an operation on
         * every element then print the list to see if it worked.
         * 
         * e.g. Multiply every element by something in a LinkedList containing
         * Integer nodes or make word upper case in a LinkedList containing
         * String nodes.
         * 
         */
    	LinkedList<String> link = new LinkedList<String>();
    	link.add("Something1");
    	link.add("Something2");
    	link.add("Something3");
    	link.add("Something4");
    	link.add("Something5");
    	link.remove(2);
    	link.print();
    	Node<String> head = link.getHead();
    	Node<String> tail = link.getTail();
    	Node<String> current = head;
    	while (!(current == null)) {
			current.setValue(current.getValue() + "123");
			current = current.getNext();
		}
    	link.print();
    }	

}
