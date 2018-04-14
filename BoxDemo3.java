// This Program includes a method inside the box class

class Box{
	double width;
	double height;
	double depth;

	// Display volume of a box
	void volume(){
		System.out.print("Volume is ");
		System.out.println(width * height * depth);
		}
	}
class BoxDemo3{
	public static void main(String args[]){
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		//assign values to mybox1 variables.
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		/*assign different 
			value to box 2*/
		mybox2.width= 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		// display vol of !st box.
		mybox1.volume();
		
		//display vol of 2nd box
		mybox2.volume();
		
		}
	}