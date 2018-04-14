/*	A program that uses Box class
	call this file BoxDemo.java
*/
class Box{
	double width;
	double height;
	double depth;
	}

class BoxDemo{
	public static void main(String args[]){
		Box mybox = new Box();
		double vol;
		
		//assign values to mybox's instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;

		//compute volume of the box
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume is " + vol);
		}
	}