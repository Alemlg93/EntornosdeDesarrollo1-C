package app;

public class Main {

	public static void main(String[] args) {
		

		Rectangulo r1 = new Rectángulo();
		Rectangulo r2 = new Rectangulo(2,3);
		
		int area1= r1.getArea();
		int perimetro2= r2.getPrimetro();
		
		System.out.println("El area del rectángulo es " + area1);
		System.out.println("El perimetro del rectángulo es " + perimetro2);
		
	}

}
