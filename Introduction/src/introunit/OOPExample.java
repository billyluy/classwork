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
		Student jillian = new Senior("Jillian", "chef");//from class file student, Senior needs two parameters
		Student jordan = new Sophomore("Jordan");
		Student jason = new Freshman("Jason");
		jillian.talk();
		jordan.talk();
		jason.talk();
		}

}
