package EjemplosDeClaseT2Arrays;

public class Ej141024Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamanyo=0;				//la ñ no está en todos los paises, intentar evitarlo
		System.out.println("¿Cuantas notas quieres poner?");
		tamanyo=Leer.datoInt();
		int[ ] numeros = new int[tamanyo];
		
		//para cargar, meterle valores, con el for recorre todo el array 
		for(int i=0;i<numeros.length;i++){  
	/*el length es un variable oculta que se establece al iniciar el array, asi nunca fallara por intentar salir del tamño max*/
			System.out.println("pon un número entero");
			numeros [i]=Leer.datoInt(); //puedo cargar un num o una secuencia segun lo que ponga a la derecha del igual
					}
		//Para imprimir
		 
		for(int i=0;i<numeros.length;i++){
			
			System.out.print("\t" +numeros [i]);
					
		}
		
      }
}
