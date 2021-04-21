package Inheritance;

public class Box extends Rectangle {

	private double height;
	   
    public Box(double L, double W, Double H){
    	
       super(L,W); //super=parent(Rectangle)
    	
       height = H;
    	
    }
    
    public double getHeight(){
       return height;
    }
    
    public double area() {
       return  2  * (getLength() * getWidth() + getLength() * height 
	+ getWidth() * height);
    } 
    
    public double volume() {
       return super.area() * height;
    }
    
    public String toString() {
       return super.toString() + "height = " + height;
    }
}
