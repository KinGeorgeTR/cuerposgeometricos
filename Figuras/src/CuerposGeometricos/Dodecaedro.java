package CuerposGeometricos;

public class Dodecaedro {
public  static  void  main ( String [] args ) {
		
		double Areadoble  , Areapentagonal , aristas , caras , vértices , apotema , Volumen ;
		
		caras = 12 ;
		vértices = 20 ;
		apotema = 1 ;
		
		aristas = caras + vértices ;
		Area =( 3 * Math . pow ( aristas , 2 ))* Math . sqrt ( 25 + 10 * Math . sqrt ( 5 ));
		Areapentagonal = 5 *( aristas * apotema );
		Volumen = 1 *( 15 +( 7 * Math . sqrt ( 5 )))* Math . pow ( aristas , 3 )/ 4 ;
		
		System.out.println("El Dodecaedro tiene " + caras + " caras");
		System.out.println("El Dodecaedro tiene" + caras + "caras");
		System.out.println("El Dodecaedro tiene " + ( aristas - 2 )+ " Aristas");
		System.out.println("EL Apotema del Dodecaedro es de: " + String . format ( "%.2f" , apotema ));
		System.out.printIn("El Area del Dodecaedro es de: " + String . format ( "%.2f" , Area ));
		System.out.println("El Area Pentagonal del Dodecaedro es de: " + String . format ( "%.2f" , Areapentagonal ));
		System.out.println("El Volumen del Dodecaedro es de: " + String . format ( "%.2f" , Volumen ));
	}

}
