package oops;



//PolyMorphism
public class Multiply {

	static int Mul(int a, int b) {

		return a * b;
	}

	static int Mul(int a, int b, int c) {

		return a * b * c;
	}

	public static void main(String[] args) {

		System.out.println(Multiply.Mul(2, 7));
		System.out.println(Multiply.Mul(2, 7, 3));
	}
}


	




