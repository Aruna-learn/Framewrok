package javabasics;


class A{
	int i=10;
}
class B extends A{
	int i=20;
}
public class InheritanceEx {

	public static void main(String[] args) {
		A a=new B();//object of class b but explicitly select the properties of class A
		System.out.println(a.i);

	}

}
