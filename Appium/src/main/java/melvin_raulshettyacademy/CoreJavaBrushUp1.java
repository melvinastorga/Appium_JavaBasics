package melvin_raulshettyacademy;

import java.util.ArrayList;
import java.util.Iterator;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 5;
		
		String name = "Melvin Astorga Guevara";
		
		char letter = 'M';
		
		float dec = 5.99f;
		
		double dec2 = 5.99;
		
		boolean isStudy = true;
		
		System.out.println("My name is: " + name);
		
		//Arrays
		//Forma 1
		int [] array = new int[3];  //Crea un array int de tamano 3
		array[0] = 72;
		array[1] = 75;
		array[2] = 88;
		//array[3] = 100;
		//array[4] = 99;
		
		for (int i: array) {
			if( i%2 == 0) {
				//System.out.println(i);
				break;
				// Debe imprimir pares: 90,88,100
			}else {
				//System.out.println(i+" No es multiplo de 2 o par");
			}
			
		}
		
		//Forma 2
		int[] qualifications = {90,88,97,100,99};
		
		for (int i : qualifications) {
			if( i%2 == 0) {
				//System.out.println(i);
				// Debe imprimir pares: 90,88,100
			}else {
				//System.out.println(i+" No es multiplo de 2 o par");
			}
			
		}
		
		
		
		//for (int i = 0; i < names.length; i++) {
		//	System.out.println(names[i]);
		//}
		
		String[] names = {"Melvin", "Olga", "Rafael"};
		
		//For each
		for(String s : names){
			//System.out.println(s);
		}
		
		
		//Los Arrays son estáticos, los ArrayList son dinámicos
		//ArrayList
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		
		for(Integer i : a) {
			System.out.println(i);
		}
		
		System.out.println("//////////");
	
		for(int i=0; i < a.size(); i++) {
			if(a.get(i) %2 == 0) {
				System.out.println(a.get(i));
			}
		}
		
		//String name = Melvin;
		
		 String completeName = new String("Melvin Astorga GUEVARA");
		
		 // SPlit o separar un String
		 String[] splittedString = completeName.split(" ");
		 //El Sprint separa el String en diferentes partes separadas
		 //En este caso por espacios " ". Dejando un array de 3 posiciones
		 //0 = Melvin ; 1 = Astorga ; 3 = GUEVARA
		 System.out.println(splittedString[2]);
		 
		 //Metodo lowerCase = pasa todo a minusculas
		 System.out.println(splittedString[2].toLowerCase());
		 
		 String space = " Space ";
		 
		 System.out.println(space);
		 System.out.println(space.trim());
		 
		 String inverseString = "";
		 
		 for(int i = completeName.length()-1; i >= 0; i--) {
			 inverseString += completeName.charAt(i);
		 }
		 
		 System.out.println(inverseString);
		 
		 System.out.println(completeName.substring(3, 6));
		 
	}

}



