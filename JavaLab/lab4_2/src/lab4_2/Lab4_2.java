package lab4_2;

class ComplexNumber{

	private double realPart, imagePart;

	void setReal(double realPart) {this.realPart = realPart;}
	void setImage(double imagePart) {this.imagePart = imagePart;}
	double getReal()
	{
		return realPart;
	}
	double getImage()
	{
		return imagePart;
	}
	double magnitude()
	{
		return Math.sqrt((realPart*realPart)+(imagePart*imagePart));
	}
	ComplexNumber add(ComplexNumber n)
	{
		ComplexNumber n1 = new ComplexNumber();
		n1.realPart = realPart + n.realPart;
		n1.imagePart = imagePart + n.imagePart;

		return n1;
	}
	ComplexNumber subtract(ComplexNumber n)
	{
		ComplexNumber n1 = new ComplexNumber();

		n1.realPart = realPart - n.realPart;
		n1.imagePart = imagePart  - n.imagePart;

		return n1;
	}
	void printNumber()
	{
		System.out.println(realPart + " + " + imagePart + "i");
		System.out.println("Magnitude: " + this.magnitude());
	}
}
public class Lab4_2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ComplexNumber n1 = new ComplexNumber();
		ComplexNumber n2 = new ComplexNumber();

		n1.setReal(5);
		n1.setImage(7.2);
		n2.setReal(-3.1);
		n2.setImage(5.7);

		System.out.print("n1 is -> ");
		n1.printNumber();
		System.out.print("n2 is -> ");
		n2.printNumber();

		ComplexNumber n3 = n1.add(n2);
		System.out.print("n1 + n2(n3): is -> ");
		n3.printNumber();

		System.out.print("n1 - n2 -> ");
		n1.subtract(n2).printNumber();

	}

}
