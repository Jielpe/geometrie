package fr.jean.exec;

import fr.jean.forme.Carre;
import fr.jean.forme.Cercle;
import fr.jean.forme.Rectangle;
import fr.jean.forme.Triangle;

public class Exec {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle( 2.0, 3.0 );
		rect.aire();
		rect.perimetre();
		
		Carre c = new Carre(4);
		c.aire();
		c.perimetre();
		
		Cercle ce1 = new Cercle(3);
		ce1.aire()  ;
		c.perimetre();
		
		Triangle t = new Triangle();
		System.out.println(t);
	}

}
