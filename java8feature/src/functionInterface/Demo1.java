
/**
 * 
 * @author : Santosh Zirpe
 */


package functionInterface;

public class Demo1 {
	public static void main(String[] args) {
		Child c= () -> {
			System.out.println("Functional Expression with Overloading");
		};
		c.m1();
	}

}
@FunctionalInterface
interface Parent{
	public void m1();
}
interface Child extends Parent{
	
}