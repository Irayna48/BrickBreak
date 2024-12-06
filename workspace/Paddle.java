import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int height;
	private int width;
	private int velocity=0;
	
	//constructor(s):
	public Paddle ( int x , int y , int width ,int height) {
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
		
		
	}
	
	// setters and getters 
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	//methods:
	
	//precondition: g is not null 
	//postcondition: draw the paddle
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x,y,width,height); 
	}

	//precondition: none
	//postcondition: make the paddle move 
	public void move() 
	{
		x+=velocity;
		
		if (velocity > 0){
			velocity--;
		}
		else if  ( velocity <0 )
		{
			velocity++;
		}
	}
		

	//precondition: velocity is not null
	//postcondition: add velocity to the paddle
	public int addVelocity( int velocity)
	{
		this.velocity+=velocity;
		return velocity;
	}
}
