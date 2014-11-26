package EjemplosDeClaseT2Arrays;

import EjemplosDeClaseT2Arrays.Leer;

public class Ej141028arraysnombres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//array de string cargado con nombres de personas leido por teclado y el otro directamente cuando se declara, inicializar {1,1}
		
		
		String [] nombres1 = {"Ángel","Luismi","Miguel","Rafa"}; //inicializar
		String [][] nombres2D = {{"Ángel","Luismi"},{"Miguel","Rafa"}}; // dos filas al haber dos bloques de llaves
		
		
		String nombre = ""; //inicializar
		
		String [] nombres = new String [5];
		
		for(int i=0;i<nombres.length;i++){   //no se empiezan los for con 1!!
	
			System.out.println("Introduce el " +(i+1)+ "º nombre");
			nombres [i]= Leer.dato();
				          }
		for(int i=0;i<nombres.length-1;i++){
			
			System.out.print(nombres[i]+", ");
					
		            }
		
		System.out.print("y " +nombres[nombres.length-1]); //para que no salga la , final ...tb puedo poner tabuladores más sencillo
		
	}

}
