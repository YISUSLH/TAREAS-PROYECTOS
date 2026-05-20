package promedioalumnojava;

public class Alumno {

    // Atributos
    private String nombre;
    private double[] calificaciones;

    // Constructor
    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Metodo que calcula el promedio de las cinco calificacienes
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    // Metodo que obtiene la calificacion final según el promedio
    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método que imprime los resultados del programa
    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + calificaciones[i]);
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion: " + calificacion);
    }

    // Metodo main para ejecutar el programa
    public static void main(String[] args) {
        double[] calificacionesAlumno = {95, 88, 91, 84, 90};

        Alumno alumno = new Alumno("Jesus Gabriel", calificacionesAlumno);

        double promedio = alumno.calcularPromedio(calificacionesAlumno);
        char calificacionFinal = alumno.obtenerCalificacion(promedio);

        alumno.imprimirResultados(alumno.nombre, promedio, calificacionFinal);
    }
}
