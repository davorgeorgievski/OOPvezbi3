package fikt.oop.vezba2;

public class MainClass {

	public static void main(String[] args) {
		
		Fakultet f1 = new Fakultet();
		f1.nazivNaFakultet = "FIKT";
		f1.brojNaSmerovi = 5;
		f1.brojNaStudenti = 250;
		f1.dekan = "Pece Mitrevski";
		f1.sediste = "Bitola";
		
		f1.prvMetod();
		System.out.println("Namalen broj na studenti: " + f1.vtorMetod(21));
		f1.tretMetod();
		
		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "TFB";
		f2.brojNaSmerovi = 8;
		f2.brojNaStudenti = 190;
		f2.dekan = "Stojance Nusev";
		f2.sediste = "Bitola";
		
		f2.prvMetod();
		System.out.println("Namalen broj na studenti: " + f1.vtorMetod(18));
		f2.tretMetod();
		
	}
}
