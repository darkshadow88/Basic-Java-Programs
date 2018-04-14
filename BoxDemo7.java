// This Program includes a parametari

class Box{
	double width;
	double height;
	double depth;

	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
		}

	// Display volume of a box
	double volume(){
		return width * height * depth;
		}
	}
class BoxDemo7{
	public static void main(String args[]){
		Box mybox1 = new Box(10,20,15);
		Box mybox2 = new Box(3,6,9);
		double vol;
		
		
		// display vol of 1st box.
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		//display vol of 2nd box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		}
	}