package array;

public class IntroArays {

	public static void main(String[] args) {
		int[] numeros = {10, 20, 30};
		
		for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

            
            
            
//    		double notaAlumno1 = 7.5;
//    		double notaAlumno2 = 5.5;
//    		double notaAlumno3 = 8.5;
//    		double notaAlumno4 = 3.5;
            
//            
//            double [] notaAlumnos = new double[4]; 
//    		notaAlumnos[1] = 5.5;
//    		System.out.println(notaAlumnos[3]);
//    		
//    		System.out.println("=========================");
    		
    		//bucle foreach
    		double suma = 0;
    		for (int num :numeros) {
    			suma += num;				
			}
    		System.out.println(suma/numeros.length);
    		
	}
	}

}
