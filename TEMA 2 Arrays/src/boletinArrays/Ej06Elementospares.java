package boletinArrays;

public class Ej06Elementospares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicios Unidad 2 Arrays
		/*6. Mostrar por pantalla solo los elementos pares (ojo, no los de �ndice par) de
		un array cargado por el usuario desde el teclado.*/
		
		
int num=0,par=0,salida=0;
		
		System.out.println("Bienvenido, el siguietne programa le calcular� los n�meros pares de los datos introducidos");
	do{	
		System.out.println("�Cu�ntos n�meros enteros desea introducir?");
		num=Leer.datoInt();
		int [] tabla= new int [num];
		
		for (int i=0;i<tabla.length;i++){
			System.out.println("Introduce un entero");
			tabla [i]=Leer.datoInt();
			 			 
		}
		
		System.out.println("Los n�meros pares son");
		for (int i=0;i<tabla.length;i++){
			if(tabla[i]%2==0){
			System.out.print(tabla [i]+ " ");
			}
		    
		
		}
		
		
		System.out.println("\n\n�Desea repetir? \n 1.Si 2.No");
		salida=Leer.datoInt();
	
	}while(salida==1);		
	System.out.println("Gracias por su visita");
	
	}

}

		
		
