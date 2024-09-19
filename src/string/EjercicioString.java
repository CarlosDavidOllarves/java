package string;

public class EjercicioString {

	public static void main(String[] args) {
		String texto = "    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           ";
		System.out.println(texto.length());
		System.out.println("1. Tamaño del texto sin espacios al inicio y final: " + texto.trim().length());
		
		
		System.out.println("2. Mostrar la segunda frase del quijote: "+ texto.endsWith("."));
		
		
        System.out.println("3. Aparece la palabra Quijote??: "+ texto.toLowerCase().contains("quijote"));
        
        int cantidadComas = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ',') {
                cantidadComas++;
            }
        }
        System.out.println("4. Cantidad de comas: " + cantidadComas);
       
        
       
    
	}

}
