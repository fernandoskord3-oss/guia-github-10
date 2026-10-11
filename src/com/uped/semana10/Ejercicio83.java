package com.uped.semana10;

// Ejercicio 8.3 (Semana 10): sobrecarga y sobrescritura combinadas
public class Ejercicio83 {
    public static void main(String[] args) {
        Notificacion push = new NotificacionPush(
                "dispositivo-9", "Recordatorio:4", 4);
        push.enviar(2);
    }
}


