import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setSize(15, 15);
    World.setDelay(3);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(8,8,East,1000);
		
    // examples of commands you can invoke on a Robot
    r.move();// move one step in the direction it is facing
    r.turnLeft();
    r.putBeeper();
    r.move();
	r.putBeeper();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.putBeeper();
    r.putBeeper();
    r.putBeeper();
    r.putBeeper();
    r.putBeeper();
    r.putBeeper();
    r.putBeeper();


  }
}