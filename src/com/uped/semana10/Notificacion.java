package com.uped.semana10;

public abstract class Notificacion {
    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public abstract void enviar();

    // SOBRECARGA (se resuelve en compilación) que reutiliza el método sobrescrito
    public void enviar(int veces) {
        for (int i = 0; i < veces; i++) {
            enviar();   // llamada sobre this: la JVM elige la versión según el tipo real
        }
    }

    public String getDestinatario() {
        return destinatario;
    }
}
