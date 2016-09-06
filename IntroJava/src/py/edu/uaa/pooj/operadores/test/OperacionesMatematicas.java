package py.edu.uaa.pooj.operadores.test;

public class OperacionesMatematicas {

	// PRACTICA
	public static int encontrarMinimo(int [] minimo) {
		
		int resultado = 0;
		
		for (int i = 0; i < minimo.length; i++){
			
			
			int auxiliar;
			
			auxiliar=(minimo[0]);
			if (minimo[i]< auxiliar){
				auxiliar = minimo[i];
			}
			resultado = auxiliar;	
			
			 
		}
		// TODO "Encontrar el valor minimo de un array de enteros"
		return resultado;
	}
	
	
	
	// PRACTICA
	public int encontrarMaximo(int maximo[]) {
			int resultado = 0;
		
				for (int i = 0; i < maximo.length; i++){
					int auxiliar;
			
					auxiliar=(maximo[0]);
						if (maximo[i]> auxiliar){
							auxiliar = maximo[i];
						}
					resultado = auxiliar;	
			
			 
				}
		return resultado;
		// TODO "Encontrar el valor maximo de un array de enteros"
	}

	// PRACTICA
	public int filtrarImpares(int impares[]) {
		
		for (int i= 0; i<impares.length;i++){
			int CON_AUX;
		CON_AUX=impares[i];
			if (CON_AUX%2==0){
				int auxiliar[] = new int[5];
				for(int j=0; j<auxiliar.length; j++){
					auxiliar[j]=CON_AUX;
				}
			
			}
		}
		
		return auxiliar;
	}
	
	public static void main(String[] args) {
		//Se crea un objeto de la clase TestOperadoresIteradores, llamado testOpIt
		OperacionesMatematicas testOpMt = new OperacionesMatematicas();
		
		//Se crea un array de enteros a ser sumados
		int[] numeros = { 10, 20, 30, 40, 49 };
		
		/*Se imprime el resultado de la invocacion al metodo sumar de testOpIt habiendole
		 * pasado como parametro el array numerosASumar
		 */

		System.out.println("El minimo es:" + testOpMt.encontrarMinimo(numeros));
		System.out.println("El maximo es:" + testOpMt.encontrarMaximo(numeros));
		System.out.println("Los numeros impares son:" + testOpMt.filtrarImpares(numeros));
		}
}
