/**
 * @author Santosh Zirpe
 */

// Inoking Lamabda Expression by Using Functional Interface -> Without Lambda Expression

package functionInterface;

public class Demo3 {
	public static void main(String[] args) {
		Test t = new DemoLambdaExpression();
		t.m1();
	}
}

interface Test{
	public void m1();
}
class DemoLambdaExpression implements Test{

	@Override
	public void m1() {
		System.out.println(" Implement Method...");
	}	
}
