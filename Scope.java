//Demonstrate block scope.
class Scope{
	public static void main(String args[]){
		int x;//this is known to all within main.
		x=10;
		if(x==10){//start a new scope.
			int y=20;
			//x and y both known here.
			System.out.println("x and y: " +x+"and" +y);
			x=y*2;
				}
		//y =100; //Error y is not knpwn here.
		//x still known here.
		System.out.println("x is " +x);
		}
	}
			