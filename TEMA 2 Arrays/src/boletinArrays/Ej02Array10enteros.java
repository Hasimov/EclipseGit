package boletinArrays;

public class Ej02Array10enteros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicios Unidad 2 Arrays
		/*2. Implementar un programa que rellene automáticamente un array de enteros
			 con 10 posiciones, cada elemento debe contener el valor del doble de su
			 índice. Mostrar el resultado por pantalla.*/
		
		int [] enteros = new int [10];
		
		for(int i=0;i<enteros.length;i++){
			enteros [i]=i*2;
			
		}
		for(int i=0;i<enteros.length;i++){
			System.out.print(enteros [i]+"\t");
		}
		
	}

}
