package lghlgh;

public class RightTriangle {

	@Override
	public String toString() {
		return "RightTriangle [A=" + A + ", B=" + B + ", Hipotenus()=" + Hipotenus() + ", Perimeter()=" + Perimeter()
				+ ", Area()=" + Area() + "]";
	}

	private int A;
	private int B;

	public RightTriangle(int A, int B) {
		this.A = A;
		this.B = B;
	}

	public int getA() {
		return A;
	}

	public void setA(int a) {
		if (A > 0 && A < 51)
			A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		if (B > 0 && B < 51)
			B = b;
	}

	public int Hipotenus() {
		int C = (int) Math.hypot(A, B);
		return C;
	}

	public int Perimeter() {
		int per = A + B + Hipotenus();
		return per;

	}

	public int Area() {
		int area = A * B / 2;
		return area;
	}

}
