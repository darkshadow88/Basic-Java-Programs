//demonstrate dynamic initialization.
class DynInt{
	public static void main(String args[]){
		double a=3.0,b=2.0;
		//c is dynamically initialized.
		double c= Math.sqrt(a*a+b*b);
		System.out.println("Hypotenuse is " +c);
		}
	}