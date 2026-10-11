package com.uped.proyecto.demo;

import com.uped.proyecto.modelo.Gerente;

// Ejercicio 8.2 (Semana 10): sobrescritura + sobrecarga en Gerente
public class Ejercicio82 {
    public static void main(String[] args) {
        Gerente g = new Gerente("Marta Díaz", "05123456-7", 1200.0, 5);

        // Versión sobrescrita (sin parámetros)
        System.out.println("Sin bono extra: " + g.calcularBeneficioAnual());

        // Versión sobrecargada (con un double)
        System.out.println("Con bono extra de 100: " + g.calcularBeneficioAnual(100.0));
    }
}

