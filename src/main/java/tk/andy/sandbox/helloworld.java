package tk.andy.sandbox;

public class helloworld {
	public static void main(String[] args){
		hello("user");

		double l = 5;

		Square s = new Square(5);

		Rectangle r = new Rectangle(4, 6);

        System.out.println("Площадь квадрата равна " + s.area());
        System.out.println("Площадь прямоугольника равна " + r.area());

        System.out.println('H'+'a'); //169

	}

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody);
    }

}
