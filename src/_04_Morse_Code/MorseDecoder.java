package _04_Morse_Code;

import _03_Intro_to_Binary_Trees.BinaryTree;
import _03_Intro_to_Binary_Trees.Node;

import java.util.Iterator;
import java.util.Scanner;

public class MorseDecoder {

    BinaryTree<MorseCode> mcTree = new BinaryTree<MorseCode>();

    public static void main(String[] args) {
    	
        MorseDecoder md = new MorseDecoder();
        md.initialize();
        md.decode();
    }
    
    public String recursiveSearch(String value) {
    	Node<MorseCode> morser = mcTree.search(new MorseCode("blah",value));
    	System.out.println("Working?");
    	return morser.getValue().getDecoded();
    }

    public void initialize() {

        mcTree.insert(new MorseCode("start", ""));
        mcTree.insert(new MorseCode("e", "."));
        mcTree.insert(new MorseCode("t", "-"));

        mcTree.insert(new MorseCode("i", ".."));
        mcTree.insert(new MorseCode("a", ".-"));
        mcTree.insert(new MorseCode("n", "-."));
        mcTree.insert(new MorseCode("m", "--"));

        mcTree.insert(new MorseCode("s", "..."));
        mcTree.insert(new MorseCode("u", "..-"));
        mcTree.insert(new MorseCode("r", ".-."));
        mcTree.insert(new MorseCode("w", ".--"));
        mcTree.insert(new MorseCode("d", "-.."));
        mcTree.insert(new MorseCode("k", "-.-"));
        mcTree.insert(new MorseCode("g", "--."));
        mcTree.insert(new MorseCode("o", "---"));

        mcTree.insert(new MorseCode("h", "...."));
        mcTree.insert(new MorseCode("v", "...-"));
        mcTree.insert(new MorseCode("f", "..-."));
        mcTree.insert(new MorseCode("l", ".-.."));
        mcTree.insert(new MorseCode("p", ".--."));
        mcTree.insert(new MorseCode("j", ".---"));
        mcTree.insert(new MorseCode("b", "-..."));
        mcTree.insert(new MorseCode("x", "-..-"));
        mcTree.insert(new MorseCode("c", "-.-."));
        mcTree.insert(new MorseCode("y", "-.--"));
        mcTree.insert(new MorseCode("z", "--.."));
        mcTree.insert(new MorseCode("q", "--.-"));

        mcTree.printVertical();

    }

    /*
     * 1.) See if you can decode the following message using the binary tree and
     * print it to the console:
     * 
     * -.-- --- ..- .- .-. . .- -- .- --.. .. -. --.
     * y      o  u   a  r  e  a m  a   z    i n  g
     * 2.) Then use the binary tree and the scanner class to create a morse code
     * translator. The user should be able to type multiple letters in morse
     * code on a single line and have it repeated back to them, decoded into the
     * english alphabet.
     * 
     */
    void decode() {
    	String decoder = "";
    	String morseCode = "-.-- --- ..- .- .-. . .- -- .- --.. .. -. --.";
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a sentence in morse code: ");
        String morse = morseCode;
        int set = 0;
        for (int i = 0; i < morse.length(); i++) {
			if (morse.charAt(i)==' ' || i==morse.length()-1) {
				decoder = decoder + recursiveSearch(morse.substring(set,i));
				set = i+1;
			} //NEED TO CREATE AN ELSE IF FOR THE SUBSTRING INSTEAD OF THE OR STATEMENT
		
        }
        System.out.println("Working???");
        System.out.println(decoder);

    }
}