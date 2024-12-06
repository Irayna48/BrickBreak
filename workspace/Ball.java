import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables
	private int x;
	private int y;
	private int size;
	private int xVelocity=1;
	private int yVelocity=1;
	
	//constructor(s):
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

	public void reverseX() {
		xVelocity=xVelocity*-1;
	}
	public void reverseY() {
		yVelocity=yVelocity*-1;
	}



}
