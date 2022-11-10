package fikt.oop.vezba1;

public class MainClass {

	public static void main (String[] args) {
		Avtomobil av = new Avtomobil("Porsche", "Macan", "Crna", 95000, 2019, "BT8888DG");
		av.prvMetod();
		System.out.println(av.vtorMetod());
	}
}
