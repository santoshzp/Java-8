package functionInterface;

// Invoking Lambda Expression by using Functional Interface Adding two Number

public class Demo5 {
	public static void main(String[] args) {
		Addition t =(a,b)-> System.out.println(a + b);
		t.add(10,20);
	};

}
interface Addition{
	public void add(int a,int b);
}
