package EjemplosDeClaseT2Arrays;

public class Ej141027Array2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//s�lo se pueden rellenar con un valor del mismo tipo, no mezclar
		//tabla de 3x3 
		
		int [][] tabla2D = new int [3] [3]; // indica el tama�o de i y de j 
	
		for (int i=0;i<tabla2D.length;i++){
		
		   for (int j=0;j<tabla2D[i].length;j++){   // aqu� se a�ade al length [i], para decirle el tama�o max de fila en la columna
			   tabla2D [i] [j] = (int)Math.floor(Math.random()*(6-0)+1);
					
		            }
		
		 }
		System.out.print("    Resultados\n");
		//mostrar por pantalla, CUIDADO, porque los for imprimir� todo seguido si no pongo saltos de l�neas
		
		for (int i=0;i<tabla2D.length;i++){
			//tb se puede poner aqu� el salto de l�nea para que empiece la tabla con uno
			for (int j=0;j<tabla2D[i].length;j++){
			 System.out.print(tabla2D[i][j]+"\t"); //en l�nea y con una tabulaci�n
			
		}
		
			System.out.println(" "); //para que se salte de l�nea y se ponga como una matriz
		}
	}

}
