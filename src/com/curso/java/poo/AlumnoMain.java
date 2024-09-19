package com.curso.java.poo;

public class AlumnoMain {

	public static void main(String[] args) {
		//4 objetos de tipo alumno
		Alumno alumno1 = new Alumno();
        alumno1.setDni("8A");
        alumno1.setNombre("Juan");
        alumno1.setApellidos("Perez");
        alumno1.setNota(7.5);
        alumno1.setMedad(19);

        Alumno alumno2 = new Alumno("9B", "Maria", "Garcia");
        Alumno alumno3 = new Alumno("0C", "Pedro", "Lopez", 8.5);
        Alumno alumno4 = new Alumno("1D", "Ana", "Martinez", 10, 21);
		
     
        System.out.println("Versión sencilla:");
        alumno1.verNota();
        alumno2.verNota();
        alumno3.verNota();
        alumno4.verNota();
        
        
        Alumno[] alumnos = {alumno1, alumno2, alumno3, alumno4};
        mostrarAlumnosAprobados(alumnos);
        
}

	private static void mostrarAlumnosAprobados(Alumno[] alumnos) {
		
		for (Alumno alumno : alumnos) {
            if (alumno.getNota() >= 5) {
                System.out.println(alumno.getNombre() + " " + alumno.getApellidos() + " - Nota: " + alumno.getNota());
            }
        }
	}
}