package _06_How_Many_Are_Smaller_Than_Me;

import java.util.Iterator;

import _03_Intro_to_Binary_Trees.Node;
import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanMe {

    /*
     * Given an AVLTree filled with the random numbers from 1 to 20, and a
     * single number within the AVL Tree, figure out how many numbers in the
     * AVLTree are smaller than the provided number and return the result.
     * 
     * You may want to create a helper method to search through the AVLTree and
     * count iteratively or recursively.
     */

    public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
    	System.out.println("Top is " + me);
    	int total=0;
    	for (int i = me-1; i > 0; i--) {
    		Node<Integer> search = avlTree.search(i);
    		if (search!=null) {
				total++;
			}
		}
    	//recursively searching through all values less than me, probably not search or will need to delete when found.
        return total;

    }

}
