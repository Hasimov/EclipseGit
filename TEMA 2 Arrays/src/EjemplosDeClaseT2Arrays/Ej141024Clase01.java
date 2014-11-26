package EjemplosDeClaseT2Arrays;

public class Ej141024Clase01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamanyo=6;				
		int[ ] numeros = new int[tamanyo];

//para cargar el array
for(int i=0;i<numeros.length;i++){  

	System.out.println("pon un número entero");
	numeros [i]=Leer.datoInt(); 	}

//Para imprimir el array
//vamos a imprimir sólo los que sean pares
for(int i=0;i<numeros.length;i++){
 if(numeros [i]%2==0){	
	System.out.print("\t" +numeros [i]);}

			
}

	}
}
