package fr.jean.forme;

public class Carre extends Rectangle {

	public Carre() {
		// TODO Auto-generated constructor stub
	}

	public Carre(double cote ) {
		super( cote, cote );
		// TODO Auto-generated constructor stub
	}
	
	public void setCote ( double cote )
	{
		super.largeur = cote;
	}
	
	public double getCote ( double cote )
	{
		return super.getLargeur();
	}
	
	/**
	 * Methode d'un objet carre pour calculer son perimetre.
	 * @return Retourne un double
	 */
	public double perimetre( )
	{
		double res = 0 ;
		res = 2*( this.getLargeur() + this.getLongueur() );
		System.out.println("Le perimetre du carre est de : "+res);
		return res;
	}
	
	/**
	 * Methode d'un objet carre pour calculer son aire. 
	 * @return Retourne un double.
	 */
	public double aire ()
	{
		double res = 0;
		res = this.getLargeur()*this.getLongueur();
		System.out.println("L'aire du carre est de : "+ res);
		return res ;
	}

}
