package boletinArrays;

public class Ej04arrayteclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicios Unidad 2 Arrays
		/*4. Crear un programa que realice lo siguiente:
			· Solicitar al usuario que introduzca por teclado el tamaño del array.
			· Declarar y definir el array de enteros.
			· Rellenar el array mediante datos introducidos por el teclado.
			· Mostrar por pantalla la suma de todos los elementos.*/
		
		int num=0,suma=0,salida=0;
		
		System.out.println("Bienvenido, el siguietne programa le calculará la suma de los datos introducidos");
	do{	
		System.out.println("¿Cuántos números enteros desea introducir para su suma?");
		num=Leer.datoInt();
		int [] tabla= new int [num];
		
		for (int i=0;i<tabla.length;i++){
			System.out.println("Introduce un entero");
			tabla [i]=Leer.datoInt();
			suma=suma+tabla[i];
		}
		
		System.out.println("La suma de los número es: " +suma);
		
		System.out.println("¿Desea repetir? \n 1.Si 2.No");
		salida=Leer.datoInt();
	
	}while(salida==1);		
	System.out.println("Gracias por su visita");
	}

}
