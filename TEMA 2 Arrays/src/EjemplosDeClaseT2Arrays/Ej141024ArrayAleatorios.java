package EjemplosDeClaseT2Arrays;

public class Ej141024ArrayAleatorios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Si quiero mostrar el num de lista puedo poner un Syso con (i+1) para que no salga el 0 al ppio
				int tamanyo=48;				//la ñ no está en todos los paises, intentar evitarlo
				int num1=0;
				int num2=49;
				System.out.println("El sorteo de la primitiva es");
			
						
				int[ ] numeros = new int[tamanyo];
				
				
				for(int i=0;i<numeros.length;i++){  
			/*Con la función Math.random cargo en el array valores aleatorios entre num1 y num2*/
					numeros[i]=(int)Math.floor(Math.random()*(num2-num1)+1);
					// tb se podria coger el nanosegundo con la función system.currentime a system.nanotime
							}
				
				 
				for(int i=0;i<numeros.length;i++){
					
					System.out.print("  " +numeros [i]);
							
				}
				
		      }
		}
