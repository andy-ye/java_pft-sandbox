package tk.andy.sandbox;

public class helloworld {
	public static void main(String[] args){
		hello("user");

		double l = 5;

		Square s = new Square();
		s.l = 5.0;

		Rectangle r = new Rectangle();
		r.a = 4;
		r.b = 6;
        System.out.println("Площадь квадрата равна " + area(s));
        System.out.println("Площадь прямоугольника равна " + areaR(r));
        
        System.out.println('H'+'a'); //169

	}

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody);
    }

    public static double area(Square s){
	    return s.l * s.l;
    }

    public static double areaR(Rectangle r){
	    return r.a * r.b;
    }
}
