package py.edu.uaa.pooj.operadores.test;

public class TestCadenasIteradores {
	private static String [] arrayString;
	/*
	 * metodo que concatena todas las palabras almacenadas en el array de String recibido
	 * como parametro, agregando un espacio en blanco despues de cada palabra
	 */
	
	public static String concat(String[] arrayString){
		String cadena = "";
		for ( int i1 = 0; i1 < arrayString.length; i1++) {
			cadena = cadena + arrayString [i1] + " ";
		}
		return cadena;
	}

	public static void main(String[] args) {
		arrayString = new String[] { "HOLA", "MUNDO" };
		System.out.println(concat (arrayString));
	}
}
