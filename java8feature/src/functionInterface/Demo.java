package functionInterface;

public class Demo {
	public static void main(String args []) {
		System.out.println("==========Funcational Interface Example===========");
		
		Interf i = ()->{	
						System.out.println("Functional Interface with Lambda Expression");
						};
				i.m1();
		
		System.out.println("=================End====================");
	}
}

interface Interf{
	public void m1();
}
