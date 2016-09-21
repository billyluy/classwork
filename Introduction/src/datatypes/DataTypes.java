package datatypes;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5.0/2);
		System.out.println((double)5/2);//changes the 5 to a 5.0(casting it into a double)
		System.out.println(5/2); //only 2 b/c its a int not a double
		System.out.println(3+5.0/2+5*2);
		System.out.println(3.0+5/2+5*2);
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));//returns 0 b/c 8/12 is a double but since u int it, it turns into 0

		double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;

		System.out.println("d1 : " + d1); 
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));
		
		//if(42 == 42.0) System.out.println("42 equals 42.0");
		
//		String s = 1; //string can't be a int
//		System.out.println(s);
//		String s = (String)1;//string can't be a int & (string) is unknown
//		System.out.println(s);
//		String s = "1";
//		System.out.println(s);
//		String s = ""+1;
//		System.out.println(s);	
//		String s = "Happy "+18+"th birthday!";
//		System.out.println(s);	
//		String s = "Happy 18th birthday!";
//		System.out.println(s);	
//		String s = "Happy "+54/3+"th birthday!";
//		System.out.println(s);
//		String s = "Happy "+(54/3)+"th birthday!";
//		System.out.println(s);
		
//		int m = 22;
//		int n = 7;
//		System.out.println("m/n is "+(m/n));
		int m = 22;
		int n = 7;
		System.out.println("m/n is "+((double)m/n));
		
		String ten = "10";
		String two = "2";
		
		if(ten.compareTo(two)>0)System.out.println("10 is greater than two"); //the 1 in 10 is earlier than the 2 in 2. the 0 is not looked at yet. so 1 is before 2 therefore 10 is before 2
		else System.out.println("ten is not greater than two");
	}

}
