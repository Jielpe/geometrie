package fr.jean.forme;

public class Cercle extends Forme implements ICalcul {

	protected double rayon = 0;
	
	
	public Cercle( double rayon ) {
		this.setRayon(rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		double res = 2*Math.PI*this.rayon;
		System.out.println("La circonference du cercle est de : "+ res);
		return res;
	}

	@Override
	public double aire() {
		double res = Math.PI*this.rayon*this.rayon;
		System.out.println("L'aire du disque est de : "+res);
		return res;
	}

}
