//compute the distancecovered by light//
class Light{
	public static void main(String args[]){
		int lightspeed;
		long days,seconds,distance;
		lightspeed=186000;//in miles per second//
		days=1000;
		seconds=days*24*60*60;
		distance=lightspeed*seconds;
		System.out.print("In " +days);
		System.out.print("days light will travel about ");
		System.out.println( distance +" miles" );
		}
	}