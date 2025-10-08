class A {
	int i, j;
	A(int a, int b){
		i=a;
		j=b;
	}
	A(){}
	void showIJ(){
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
}

class B extends A {
	int i,j,k;   //here i, j are hiding....
	B(int a, int b, int c){
		i=a;
		j=b;
		k = c;
	}
	void show(){
		System.out.println("i = " + i);   //super.i   
		System.out.println("j = " + j);
		//super.showIJ();
		System.out.println("k = " + k);
	}
}
class SuperDemo {
	public static void main(String args[]){
		A a = new A(4,5);
		B b = new B(1,2,3);
		a.showIJ();
		b.show();
	}
}
