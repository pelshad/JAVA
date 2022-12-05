package sec03.exam04_outterclass_ref;

public class OutterExample {

	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Nested nest = out.new Nested();
		nest.print();
	}

}
