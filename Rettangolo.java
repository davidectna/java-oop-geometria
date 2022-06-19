package jana60.geometria;

public class Rettangolo {

	int base;
	int altezza;
	
	Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	public int calcoloArea(){
		int area;
		area = base*altezza;
		return area;
	}
	public int calcolaPerimetro() {
		int perimetro;
		perimetro = base*2 + altezza*2;
		return perimetro;
	}
	
}
