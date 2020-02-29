package functionInterface;

public class Demo2 {
	public static void main(String[] args) {
		Child1 c=()->{
			System.out.println("Funcational Interface with Respact Overloading");
		};
		c.m1();
	}

}
@FunctionalInterface
interface Parent1{
	public void m1();
}
@FunctionalInterface
interface Child1 extends Parent1{
	public void m1();
}
