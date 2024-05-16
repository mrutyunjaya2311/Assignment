import java.util.Scanner;

class Point {
	double X;
	double Y;

	Point(double X, double Y) {
		this.X = X;
		this.Y = Y;
	}

	Point(Point a) {
		this.X = a.X;
		this.Y = a.Y;
	}

	double getX() {
		return this.X;
	}

	double getY() {
		return this.Y;
	}

	void setX(double X) {
		this.X = X;
	}

	void setY(double Y) {
		this.Y = Y;
	}

}

class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X: ");
		double X = sc.nextDouble();
		System.out.print("Enter Y: ");
		double Y = sc.nextDouble();
		Point obj1 = new Point(X, Y);
		System.out.println("Obj1 data: X=" + obj1.getX() + ",Y=" + obj1.getY());
		Point obj2 = new Point(obj1);
		System.out.println("Obj2 data: X=" + obj2.getX() + ",Y=" + obj2.getY());
	}
}

