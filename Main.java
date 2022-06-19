package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		int baseRettangolo;
		int altezzaRettangolo;
		

		System.out.println("CALCOLATORE AREA DEL RETTANGOLO");
		System.out.print("INSERISCI IL VALORE DELLE BASE: ");
		baseRettangolo = scan.nextInt();
		System.out.print("INSERISCI IL VALORE DELL'ALTEZZA: ");
		altezzaRettangolo = scan.nextInt();
		
		Rettangolo rettangolo = new Rettangolo(baseRettangolo,altezzaRettangolo);
		
		System.out.println("LA TUA AREA HA UN VALORE DI: "+ rettangolo.calcoloArea());
		System.out.println("IL TUO PERIMETRO INVECE HA UN VALORE DI: "+ rettangolo.calcolaPerimetro());
		
		
				
	
	}
	
}


