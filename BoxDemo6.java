// This Program includes a constructor

class Box{
	double width;
	double height;
	double depth;

	Box(){
		System.out.println("Constructor box");
		width = 10;
		height = 10;
		depth = 10;
		}

	// Display volume of a box
	double volume(){
		return width * height * depth;
		}
	}
class BoxDemo6{
	public static void main(String args[]){
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		//assign values to mybox1 variables.
		
		/*assign different 
			value to box 2*/
		
		// display vol of !st box.
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		//display vol of 2nd box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		}
	}