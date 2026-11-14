interface Moveable 
{
 	int AVG_SPEED=0;
	void move();
}
class Move implements Moveable
{
	 public void move(){
		  System .out. println ("Average speed is:  "+AVG_SPEED  );
	 }
}
class Vehicle  
{
	 public static void main (String[] arg)
	 {
		  Move m = new Move();
		  m.move();
	 }
}
