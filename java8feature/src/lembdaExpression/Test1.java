package lembdaExpression;

import java.util.Date;

public class Test1 {
	public static void main(String args []) {
		System.out.println("Lambda Express=");
		Interf i = () -> System.out.println("Hellow");
		i.m1();
		System.out.println("=========Current Date==========");
		Date d =Interf.getCurrentDate();
		System.out.println("Date =" + d);
	}
}
@FunctionalInterface
interface Interf{
	public void m1();
//	public void m2();
	public static Date getCurrentDate() {
		System.out.println("Static Method In Functional Interface");
		return new Date();
	}
}