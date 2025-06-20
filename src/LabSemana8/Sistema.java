/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSemana8;

/**
 *
 * @author adrianaguilar
 */
public class Sistema {
    public static Jugador[] jugadores = new Jugador[100];
    public static int contador = 0;
    public static Jugador jugadorLogueado = null;

    public static boolean registrar(String nombre, String username, String password) {
    if (nombre == null || username == null || password == null) return false;

    username = username.trim();
    password = password.trim();

    
    if (password.length() != 5) return false;

    jugadores[contador++] = new Jugador(nombre, username, password);
    return true;
}



    public static boolean login(String username, String password) {
        if (username == null || password == null) return false;

        username = username.trim().toLowerCase();
        password = password.trim();

        for (int i = 0; i < contador; i++) {
            if (jugadores[i].getUsername().equalsIgnoreCase(username) &&
                jugadores[i].getPassword().equals(password)) {
                jugadorLogueado = jugadores[i];
                return true;
            }
        }

        return false;
    }

    public static Jugador buscarJugador(String username) {
    if (username == null) return null;

    username = username.trim().toLowerCase();

    for (int i = 0; i < contador; i++) {
        if (jugadores[i].getUsername().equalsIgnoreCase(username)) {
            return jugadores[i];
        }
    }

    
    
    return null;
}
    
    public static Jugador[] getJugadores() {
    return jugadores;
}

    public static int getContador() {
    return contador;
}

    
    
}
