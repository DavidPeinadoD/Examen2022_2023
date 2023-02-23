package org.example;

public class Matematicas {

    public static double generarNumeroPi(int pasos) {
        int dentroCirculo = 0;
        for (int i = 0; i < pasos; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                dentroCirculo++;
            }
        }
        return 4.0 * dentroCirculo / pasos;
    }
}
