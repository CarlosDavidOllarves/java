package array;

public class EjercicioArray6 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		System.out.println("Bienvenidos a el juego Barcos hundidos");
		System.out.println("  A B C D E");
        matriz[0][4] = 2;
        matriz[1][1] = 1;
        matriz[1][2] = 1;
        matriz[3][0] = 2;
        matriz[3][4] = 3;    
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

	}

}
