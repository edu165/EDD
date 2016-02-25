package fp;



import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


	private static int resultado;

	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		
		return x.getClass();
		//throw  new NotImplementedException();
	}


	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		List<Integer> list = new ArrayList<Integer>();
	
		int anterior = 1;
        int actual = 1;
        list.add(actual);
        int siguiente = 1;
        for (int i = 1; i < n ; i++) {
        	list.add(actual);
        	siguiente = actual + anterior;
            anterior = actual;
            actual = siguiente;
	  }
        System.out.println(list);
	    return list;
	}
	

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		int[] lista;
		//int resultado = 0;
		int cont= 0;
		String nueva="";
		//step=-i
		for(int i=number-step;i>0; i-=step){
		//resultado=number-step;
		nueva+=i;
		 //number= resultado;
		 cont++;
		 //numero = Integer.parseInt(cadena) cadena= Integer.toString(numero);int i = Integer.parseInt(s);
       }
		lista=new int[cont];
		for(int n=0;n<cont; n++){
			lista[n]=(nueva.charAt(n)-'0');
			
			
		}
		
	return lista  ;
}
	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 palindrmo son las frases que se leen igual del dercho que del reves */
	public static boolean checkIsPalindrome(String cadena) {
		throw  new NotImplementedException();
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy es a�o bisieto que sea divisble entre 400 y divisible entre 4 y no entre 100
	 */
	public static boolean isLeapYear(String fecha) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida 
	 */
	public static boolean isValidDate(String date) {
		throw  new NotImplementedException();
	}
}
