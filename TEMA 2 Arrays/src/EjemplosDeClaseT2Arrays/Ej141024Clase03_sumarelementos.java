package EjemplosDeClaseT2Arrays;

public class Ej141024Clase03_sumarelementos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int suma=0;
		int tamanyo=6;				
		int[ ] numeros = new int[tamanyo];

//para cargar el array
for(int i=0;i<numeros.length;i++){  

	System.out.println("pon un número entero");
	numeros [i]=Leer.datoInt(); 	}

//Quiero sumar todos los numeros del array

for(int i=0;i<numeros.length;i++){
   suma=numeros [i]+suma;    //suma+=numeros [i] tb se puede escribir
 }

System.out.println("La suma de los números es " +suma);

	}
}
