package apsca;
import java.util.Scanner;
public class hispanicHeritage {
	


	    public static void main(String[] args) {
	        Scanner myInput = new Scanner(System.in);
	        System.out.println("Enter a number between 1 and 100: ");
	        int number = myInput.nextInt();

	        if (number >= 1 && number <= 100) {
	            System.out.println(number + " in Spanish is: " + translator(number));
	        } else {
	            System.out.println("Number out of range");
	        }
	    }

	    public static String translator(int number) {
	        if (number < 1 || number >= 101) {
	            return "idk fr";
	        }
	        if (number == 100) {
	            return "cien";
	        }

	        String[] units = {
	            "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"
	        };

	        String[] teens = {
	            "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
	        };

	        String[] tens = {
	            "", "", "veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
	        };

	        if (number < 10) {
	            return units[number];
	        } else if (number < 20) {
	            return teens[number - 10];
	        } else {
	            int tensDigit = number / 10;
	            int unitsDigit = number % 10;
	            if (unitsDigit == 0) {
	                return tens[tensDigit];
	            } else {
	                return tens[tensDigit] + " y " + units[unitsDigit];
	            }
	        }
	    }
	}

