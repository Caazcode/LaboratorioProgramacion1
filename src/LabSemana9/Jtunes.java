/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSemana9;

import javax.swing.ImageIcon;

/**
 *
 * @author adrianaguilar
 */
public class Jtunes {
    
    private Song[] canciones;

    public Jtunes(int size) {
        canciones = new Song[size];
    }

    public boolean addSong(int codigo, String nombre, double precio, ImageIcon imagenDisco) {
        if (searchSong(codigo) != null) return false;

        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] == null) {
                canciones[i] = new Song(codigo, nombre, precio, imagenDisco);
                return true;
            }
        }
        return false;
    }

    public Song searchSong(int codigo) {
        for (Song s : canciones) {
            if (s != null && s.getCodigo() == codigo) {
                return s;
            }
        }
        return null;
    }

    public void rateSong(int codigo, int stars) {
        Song s = searchSong(codigo);
        if (s != null) {
            s.addStars(stars);
        }
    }

    public Song[] getAllSongs() {
        return canciones;
    }
    
    public Song[] getCanciones() {
    return canciones;
    }
    
    public int getCancionesAgregadas() {
    int contador = 0;
    for (Song s : canciones) {
        if (s != null) {
            contador++;
        }
    }
    return contador;
}
    
    
}
