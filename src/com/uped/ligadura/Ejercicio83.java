package com.uped.ligadura;

// Ejercicio 8.3 (Semana 9): trazado integral de ligadura estática y dinámica
class Instrumento {
    String tipo = "generico";

    Instrumento() {
        System.out.println("Construyendo: " + resumen());
    }

    final String resumen() {
        return "tipo=" + tipo;
    }

    static String catalogo() {
        return "Catalogo base";
    }

    void tocar() {
        System.out.println("...genérico...");
    }
}

class Violin extends Instrumento {
    String tipo = "cuerda frotada";

    static String catalogo() {
        return "Catalogo cuerdas";
    }

    @Override
    void tocar() {
        System.out.println("Nota sostenida");
    }
}

public class Ejercicio83 {
    public static void main(String[] args) {
        Instrumento v = new Violin();
        System.out.println(v.tipo);
        System.out.println(v.catalogo());
        v.tocar();
    }
}

