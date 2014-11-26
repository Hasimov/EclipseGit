package EjemplosDeClaseT2Arrays;

public class Ej07Ej141031ArrayBidimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//mejro cargarlo primero y luego imprimirlo
		int num [][]= new int [8][8];
		int cuenta=1;
		
		for (int i=0;i<num.length;i++){
			for (int j=0;i<num[i].length;i++){  //num[i] representa el tamaño max de columnas de esa fila
				if(j==0&&i==0){
					
					System.out.print("\tj=0");
					
				}
			if (j==0){
				System.out.print("i="+i);
			}
			
			num[i][j]=cuenta;
			System.out.print("i="+i);
			
			}
			
		}
	}

}
