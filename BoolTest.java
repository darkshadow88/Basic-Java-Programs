//demonstrate of boolean
class BoolTest{
	public static void main(String args[]){
		boolean b;
		b=false;
		System.out.println("b is : " +b);
		b=true;
		System.out.println("b is : " +b);
		//a boolean can control a if statement.
		if(b) System.out.println("This is executed");
		b=false;
		//outcome of a relatio0nal operater is a boolean value.
		if(b) System.out.println("This is not executed");
		System.out.println("10 > 9 is " +(10 > 9));
		}
	}