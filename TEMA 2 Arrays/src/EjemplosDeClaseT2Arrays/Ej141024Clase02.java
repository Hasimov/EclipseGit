package EjemplosDeClaseT2Arrays;

public class Ej141024Clase02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            int posicion=0;
			int tamanyo=6;				
			int[ ] numeros = new int[tamanyo];

	//para cargar el array
	for(int i=0;i<numeros.length;i++){  

		System.out.println("pon un número entero");
		numeros [i]=Leer.datoInt(); 	}

	System.out.println("¿Que posición de la tabla quieres imprimir?");
	 posicion=Leer.datoInt();
	 
	 
	 /* hay que tener claro que al movernos por el array on la i y la posicion primera hay un 0, 
	  * para que el usuario diga que su primer valor es el nuestro en la posicion 0, siempre pondremos la loc-1*/
		System.out.println("En la posición " +posicion+ " hay un " +numeros );
	

	} 
	}
