package boletinArrays;

public class Ej05Arraymayormenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5. En el ejercicio anterior, encontrar el mayor y menor números guardados en
		el array. Mostrarlos por pantalla.*/

		int num=0,mayor=0, menor=0,salida=0;
		
		System.out.println("Bienvenido, el siguietne programa le calculará el mayor y el menor de los datos introducidos");
	do{	
		System.out.println("¿Cuántos números enteros desea introducir?");
		num=Leer.datoInt();
		int [] tabla= new int [num];
		
		for (int i=0;i<tabla.length;i++){
			System.out.println("Introduce un entero");
			tabla [i]=Leer.datoInt();
			 if(i==0){menor=tabla[i];}
			 if(tabla[i]>mayor){
				 mayor=tabla[i];
			 }
			 if(tabla[i]<menor){
				 menor=tabla[i];
			 }
		}
		
		System.out.println("El número introducido mayor es: " +mayor);
		System.out.println("El número introducido menor es: " +menor);
		
		System.out.println("¿Desea repetir? \n 1.Si 2.No");
		salida=Leer.datoInt();
	
	}while(salida==1);		
	System.out.println("Gracias por su visita");
	}

}
