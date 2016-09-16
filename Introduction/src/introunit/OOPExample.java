/**
 * 
 */
package introunit;

/**
 * @author Student6
 *This class is used to contrast with the procedural example.It embodies and Object-Oriented approach
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//constructing a new student
		Student jillian = new Senior("Jillian");//from class file student
		Student jordan = new Student("Jordan");
		Student jason = new Student("Jason");
		jillian.talk();
		jordan.talk();
		jason.talk();
		}

}
