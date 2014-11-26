package EjemplosDeClaseT2Arrays;

public class Ej141027Array2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sólo se pueden rellenar con un valor del mismo tipo, no mezclar
		//tabla de 3x3 
		
		int [][] tabla2D = new int [3] [3]; // indica el tamaño de i y de j 
	
		for (int i=0;i<tabla2D.length;i++){
		
		   for (int j=0;j<tabla2D[i].length;j++){   // aquí se añade al length [i], para decirle el tamaño max de fila en la columna
			   tabla2D [i] [j] = (int)Math.floor(Math.random()*(6-0)+1);
					
		            }
		
		 }
		System.out.print("    Resultados\n");
		//mostrar por pantalla, CUIDADO, porque los for imprimirá todo seguido si no pongo saltos de líneas
		
		for (int i=0;i<tabla2D.length;i++){
			//tb se puede poner aquí el salto de línea para que empiece la tabla con uno
			for (int j=0;j<tabla2D[i].length;j++){
			 System.out.print(tabla2D[i][j]+"\t"); //en línea y con una tabulación
			
		}
		
			System.out.println(" "); //para que se salte de línea y se ponga como una matriz
		}
	}

}
