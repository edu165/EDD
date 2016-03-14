package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	private static int resultado;

	public static Class classTypeOf(Object x) {

		return x.getClass();
		// throw new NotImplementedException();
	}

	
	public static List<Integer> fibonacci(int n) {
		List<Integer> list = new ArrayList<Integer>();

		int anterior = 1;
		int actual = 1;
		list.add(actual);
		int siguiente = 1;
		for (int i = 1; i < n; i++) {
			list.add(actual);
			siguiente = actual + anterior;
			anterior = actual;
			actual = siguiente;
		}
		System.out.println(list);
		return list;
	}

	public static int[] stepThisNumber(int number, int step) {

		int[] lista;
		int cont = 0;
		String nueva = "";
		for (int i = number - step; i > 0; i -= step) {
			nueva += i;
			cont++;
			
		}
		lista = new int[cont];
		for (int n = 0; n < cont; n++) {
			lista[n] = (nueva.charAt(n) - '0');

		}

		return lista;
	}

	
	public static int[] divisors(int n) {
		if (n < 1) {
			return null;
		}
		int cont = 0;

		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				cont++;

			}

		}
		int[] divisores = new int[cont];
		for (int i = 1; i <= n; i++)
			if (n % i == 0) {
				cont--;
				divisores[cont] = i;
			}

		return divisores;

	}

	
	public static boolean checkIsPalindrome(String cadena) {
		if (cadena == null) {
			return false;

		}
		cadena = cadena.toLowerCase();
		String cadena2 = "";
		String acentos = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
		String sinacentos = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isLetter(cadena.charAt(i))) {
				if (acentos.indexOf(cadena.charAt(i)) != -1)
					cadena2 += sinacentos.charAt(acentos.indexOf(cadena.charAt(i)));
				else
					cadena2 += cadena.charAt(i);
			}

		}

		for (int i = 0, j = cadena2.length() - 1; i < cadena2.length() / 2; i++, j--) {
			if (cadena2.charAt(i) != cadena2.charAt(j))

				return false;

		}
		return true;
	}

	
	public static String speakToMe(int n) {
		String cadena = "";
		String[] unidades = { "Cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "Diez",
				"Once", "Doce", "Trece", "Catorce", "Quince", "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve" };
		String[] decenas = { "Cero", "Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta",
				"Ochenta", "Noventa" };
		if (n == 0) {
			cadena = "";
			cadena = unidades[0];
		}
		if (n < 20) {
			cadena = "";
			cadena = unidades[n];
		}
		if (n % 10== 0) {
			cadena = "";
			cadena = decenas[n / 10];

		} {
			cadena = "";
			cadena = decenas[n / 10] + " y " + unidades[n % 10];

		}
		return cadena;
	}

	
	public static boolean isLeapYear(String fecha) {
		int año;
		try {
			año = Integer.parseInt(fecha.substring(6));
		} catch (NumberFormatException e) {
			return false;
		} catch (IndexOutOfBoundsException i) {
			return false;
		}
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
			return true;
		}

		else {
			return false;
		}
	}

	
	public static boolean isValidDate(String date) {

		int dia;
		int mes;
		int año;
		int[] diasCadaMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		try {
			dia = Integer.parseInt(date.substring(0, 2));
			mes = Integer.parseInt(date.substring(3, 5));
			año = Integer.parseInt(date.substring(6));
		} catch (NumberFormatException e) {
			return false;
		} catch (StringIndexOutOfBoundsException e) {
			return false;
		}

		if (mes > 0 && mes < 13)
			if (dia > 0 && dia <= diasCadaMes[mes])
				if (año > 0)
					return true;
		return false;

	}
}
