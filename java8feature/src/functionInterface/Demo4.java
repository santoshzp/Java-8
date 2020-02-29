package functionInterface;
//With Lambda Expression for Functional Interfaces...");
public class Demo4 {
	public static void main(String[] args) {
		Interfer f=()-> System.out.println(" With Lambda Expression for Functional Interfaces...");
		f.m1();
	}
}
interface Interfer{
	public void m1();
}