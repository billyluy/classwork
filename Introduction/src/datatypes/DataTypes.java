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
	}

}
