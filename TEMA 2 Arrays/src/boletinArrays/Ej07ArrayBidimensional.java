package boletinArrays;

public class Ej07ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicios Unidad 2 Arrays
		/*7. Implementar un programa con un array bidimensional de enteros que
		guarde los números del 1 al 64 en 8 filas y 8 columnas. Mostrarlo por pantalla.*/
		
		
				int num [][]= new int [8][8];
				int num1=0,num2=64;
				
				for (int i=0;i<num.length;i++){
					for(int j=0;j<num[i].length;j++){
						num[i][j]=(int)Math.floor(Math.random()*(num2-num1)+1);
									
					}
					
					
				}				

				for (int i=0;i<num.length;i++){
					for(int j=0;j<num[i].length;j++){
						System.out.print(num[i][j]+"\t");
					}
					System.out.println("");
		}
	}
		

}


