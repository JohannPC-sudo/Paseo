/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paseo;

/**
 *
 * @Johann Lopez
 */
public class Paseo {   

    /**
     * @param args the command line arguments
     */
    
    private final int numSillasPorBus;
    private final int numEstudiantesGordos;
    private final int numEstudiantesFlacos;

    // Constructor
    public Paseo(int numSillasPorBus, int numEstudiantesGordos, int numEstudiantesFlacos) {
        this.numSillasPorBus = numSillasPorBus;
        this.numEstudiantesGordos = numEstudiantesGordos;
        this.numEstudiantesFlacos = numEstudiantesFlacos;
    }

    // Método para calcular el número de buses necesarios
    public int calcularNumeroDeBuses() {
        int sillasNecesarias = (numEstudiantesGordos * 2) + numEstudiantesFlacos;
        return (int) Math.ceil((double) sillasNecesarias / numSillasPorBus);
    }

    public static void main(String[] args) {
        // TODO code application logic here
                // Crear una instancia de Paseo con datos de ejemplo
        Paseo paseo = new Paseo(50, 20, 30);
        // Imprimir el número de buses necesarios
        System.out.println("Numero de buses necesarios: " + paseo.calcularNumeroDeBuses());
    }
}

    
    

