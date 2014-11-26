package boletinArrays;

import EjemplosDeClaseT2Arrays.Leer;

public class Ej01Nombres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicios Unidad 2 Arrays
		/*1. 	Crear un array de tipo Strings, inicializarlo en la propia definición con el
				nombre de 5 personas y mostrarlo por la pantalla mediante un bucle for.*/

				
		
		String [] nombres = {"Juan","Ale","Bea","Sara","Óscar"}; //inicializar el array
				
			
		for(int i=0;i<nombres.length-1;i++){
			
			System.out.print(nombres[i]+", ");
					
		}
		
		System.out.print("y " +nombres[nombres.length-1]); //para que no salga la , final ...tb puedo poner tabuladores más sencillo
		
	}

}
