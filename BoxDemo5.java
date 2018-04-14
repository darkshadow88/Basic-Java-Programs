// This Program includes a method inside the box class

class Box{
	double width;
	double height;
	double depth;

	// Display volume of a box
	double volume(){
		return width * height * depth;
		}
	//Setting the dimensions.
	 void setDim(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
		}
}

class BoxDemo5{
	public static void main(String args[]){
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		//assign values to mybox1 variables.
		mybox1.setDim(10,20,15);
		
		/*assign different 
			value to box 2*/
		mybox2.setDim(3,6,9);

		// display vol of !st box.
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		//display vol of 2nd box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		}
	}