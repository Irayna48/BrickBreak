import java.awt.*;

public class Ball {
	//your code here!
	// Name : Lee Zoe Randriatahina
	// date : 12/06/2024
	// description : This class set the speed of the ball and change its image 

	// instance variables
	private int x;
	private int y;
	private int size;
	private int xVelocity=1;
	private int yVelocity=1;
	
	//constructor:
	public Ball ( int x , int y , int size) {
		this.x=x;
		this.y=y;
		this.size=size;
		
	}

	//getters and setters
	public int getXpos() {
		return x;
	}
	public int getYpos() {
		return y;
	}
	public int getSize() {
		return size;
	}
	
	public void setXVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	public void setYVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	//methods:
	
	//precondition: g is not null
	//postcondition: draw the ball
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x,y,size,size); 
	}

	//precondition: none
	//postcondition: make the ball move 
	public void move() {
		x+=xVelocity;
		y+=yVelocity;
	}

	//precondition: none
	//postcondition: reverse the x of the ball 
	public void reverseX() {
		xVelocity=xVelocity*-1;
	}
	//precondition: none
	//postcondition: reverse the y of the ball 
	public void reverseY() {
		yVelocity=yVelocity*-1;
	}



}
