package boletinArrays;

public class Ej03Array20posiciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicios Unidad 2 Arrays
		/*3.	Crear un array de enteros unidimensional de 20 posiciones. Rellenarlo con
				los primeros números impares (sin hacerlo directamente sino que los calcule el
				programa) y mostrarlo en pantalla.*/
		
		int [] enteros = new int [20];
		int impar=0, j=0, tamimpar=20;
		
		for(int i=0;j<tamimpar;i++){
			
			if(impar%2!=0){
			enteros[j]=impar;	
			j++;
			}
			
		  impar++;
		  
		}
						
		for(int i=0;i<enteros.length;i++){
			System.out.print(enteros[i]+"   ");
		}
		
	}

}
