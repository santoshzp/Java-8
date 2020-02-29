package functionInterface;
/**
 *  Addition Tow number using Simple way
 */
public class Demo6 {
	public static void main(String[] args) {
		Addtion a = new AddtionImpl();
		a.add(10, 20);
	}
}
interface Addtion{
	
	public  void add(int firstNumber,int secondNumber);
}

class AddtionImpl implements Addtion{
	@Override
	public void add(int firstNumber, int secondNumber) {
		System.out.println(firstNumber + secondNumber);
	}
}
