package fr.jean.forme;

public class Rectangle extends Forme implements ICalcul {
	
	/**
	 * Les attributs de notre classe rectangle, sa longueur et sa largeur.
	 */
	protected double longueur = 0 ;
	protected double largeur = 0 ;
	
	/**
	 * Constructeur par defaut
	 */
	public Rectangle ( ) {}
	
	/**
	 * Constructeur d'objet Rectangle on donne deux parametres, la longueur et la largeur.
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle ( double longueur, double largeur )
	{
		this.setLongueur( longueur ) ;
		this.setLargeur( largeur );
		
	}
	
	/**
	 * Methode d'un objet rectangle pour calculer son perimetre.
	 * @return Retourne un double
	 */
	public double perimetre( )
	{
		double res = 0 ;
		res = 2*( this.getLargeur() + this.getLongueur() );
		System.out.println("Le perimetre du rectangle est de : "+res);
		return res;
	}
	
	/**
	 * Methode d'un objet rectangle pour calculer son aire. 
	 * @return Retourne un double.
	 */
	public double aire ()
	{
		double res = 0;
		res = this.getLargeur()*this.getLongueur();
		System.out.println("L'aire du rectangle est de : "+ res);
		return res ;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur( double largeur) {
		this.largeur = largeur;
	}

}
