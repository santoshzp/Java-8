package functionInterface;
/**
 * 
 * @author Santosh Zirpe
 * 
 * Addition using Lambda Expression
 */
public class Demo7 {
	public static void main(String[] args) {
//		ArithmaticOperation ob = new ArithmaticOperation();
//		ob.addition();
//		ob.subStration();
		ArithmaticOperation.addition();
		ArithmaticOperation.subStration();
	}
}
interface AddtionWithLambda{
	public void arithmatic(int fisrtNumber,int secondNumber);
}
class ArithmaticOperation{
	
	public static void addition() {
		AddtionWithLambda obj =(a,b)-> System.out.println(a + b);
		obj.arithmatic(25, 40);
	}
	public static void subStration() {
		AddtionWithLambda obj =(a,b)-> System.out.println(a - b);
		obj.arithmatic(50, 40);

	}
}
