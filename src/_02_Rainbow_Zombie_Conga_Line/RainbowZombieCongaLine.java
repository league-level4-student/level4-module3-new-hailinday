package _02_Rainbow_Zombie_Conga_Line;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class RainbowZombieCongaLine {
    
    /*
     * You are hosting a rainbow zombie conga dance party! Zombies are not very
     * smart(maybe that's why they crave brains) and need your help to direct
     * them through the choreography.
     * 
     * Each method is a dance move you will need to implement.
     * 
     * When you think you've gotten your zombies trained well enough you can
     * start the party by running the main method in RainbowZombieDanceParty and
     * typing how many rounds you want in the console to see if they followed
     * your choreography correctly.
     * 
     * Note: The party will always start with a rainbow brains and every 5
     * rounds the head and tail of the dance line will be removed.
     */

    private LinkedList<Zombie> congaLine;
    private ZombieHatColor[] zombieHats;

    public RainbowZombieCongaLine() {

        congaLine = new LinkedList<Zombie>();
        zombieHats = ZombieHatColor.values();

    }

    // Make the passed in zombie the first Zombie in the conga line!
    public void engine(Zombie dancer) {
    	Node<Zombie> head = new Node<Zombie>(dancer);
    	congaLine.setHead(head);
    }

    // Make the passed in zombie the last Zombie in the conga line!
    public void caboose(Zombie dancer) {
    	Node<Zombie> tail = new Node<Zombie>(dancer);
    	congaLine.setTail(tail);
    }

    // Place the zombie at the designated position in the conga line!
    public void jumpInTheLine(Zombie dancer, int position) {
    	Node<Zombie> zomb = new Node<Zombie>(dancer);
    	Node<Zombie> current = congaLine.getHead();
    	for (int i = 0; i < position; i++) {
			current = current.getNext();
			
			
		}
    	//NEED TO COME BACK TO THIS. NEED TO BREAK THE TWO SIDES OF THE POSITION AND INSERT THE NEW ONE
    	//a.next.prev
    	//c.next
    	//a.next
    	//c.prev
    }

    /*
     * Remove all zombies with the same hat color as the passed in zombie from
     * the conga line!
     */
    public void everyoneOut(Zombie dancer) {
    	Node<Zombie> current = congaLine.getHead();
    	int position = 0;
    	while(!(current==null)) {
			if (dancer.getZombieHatColor().equals(current.getValue().getZombieHatColor())) {
				System.out.println("remove");
				congaLine.remove(position);
			}
			position += 1;
			current.getNext();
    	}
    }

    /*
     * Remove the first zombie with the same hat color as the passed in zombie
     * from the conga line!
     */
    public void youAreDone(Zombie dancer) {
    	Node<Zombie> current = congaLine.getHead();
    	int position = 0;
    	while(!(current==null)) {
			if (dancer.getZombieHatColor().equals(current.getValue().getZombieHatColor())) {
				congaLine.remove(position);
				break;
			}
			position += 1;
			current.getNext();
    	}
    }

    /*
     * Make two more zombies with the same hat color as the passed in zombie and
     * add one to the front, one to the end and one in the middle.
     */
    public void brains(Zombie dancer) {
    	Node<Zombie> three = new Node<Zombie>(dancer);
    	congaLine.setHead(three);
    	congaLine.setTail(three);
    	int position = congaLine.size()/2;
    }

    /*
     * Add the passed in zombie to the front and then add one zombie of each hat
     * color to the end of the line.
     */
    public void rainbowBrains(Zombie dancer) {
    	Node<Zombie> head = new Node<Zombie>(dancer);
    	congaLine.setHead(head);
    	for (ZombieHatColor c : zombieHats) {
			congaLine.add(new Zombie(c));
			
		}
    	
    }

    public LinkedList<Zombie> getCongaLine() {
        return congaLine;
    }
}
