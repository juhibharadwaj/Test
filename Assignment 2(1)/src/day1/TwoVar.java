package day1;

public class TwoVar {

	public void swap() {
		int a = 1;
		int b = 2;

		// display of 2 numbers before swapping
		System.out.println("The two numbers before swapping are a = " + a + " and b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;

		// display of 2 numbers after swapping
		System.out.println("The two numbers after swapping are a = " + a + " and b = " + b);

	}

	public static void main(String[] args) {
		TwoVar t = new TwoVar();
		t.swap();
	}
}
