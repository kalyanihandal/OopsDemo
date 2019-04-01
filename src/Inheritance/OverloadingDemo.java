package Inheritance;

public class OverloadingDemo {
	public void m1(){
		System.out.println("no-arg");
	}
	public void m1(int i){
		System.out.println("int-arg");
	}
	public void m1(double d){
		System.out.println("double-arg");
	}

	public static void main(String[] args) {
		OverloadingDemo d= new OverloadingDemo();
		d.m1();
		d.m1(10);
        d.m1(10.5);
	}

}
