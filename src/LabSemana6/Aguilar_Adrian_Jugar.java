/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSemana6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author adrianaguilar
 */
public class Aguilar_Adrian_Jugar extends JFrame {

    String[] palabrasIniciales = {"CARRO", "ERICK", "LAPTOP", "AHORCADO", "HONDURAS", "PROGRAMACION", "CELULAR", "CODIGO"};
    char[] palabraActual;
    char[] palabraOculta;
    int oportunidades;

    JLabel frase1;
    JLabel palabraMostrada;
    JLabel mensaje;
    JLabel contadorOportunidades;
    JTextField campoLetra;
    JButton botonIntentar;
    JButton botonReiniciar;
    JButton botonCambiar;
    JTextArea verPalabras; 

    public Aguilar_Adrian_Jugar() {
        setTitle("JUGAR");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        frase1 = new JLabel("Adivina la palabra");
        frase1.setFont(new Font("Arial", Font.BOLD, 18));
        add(frase1);

        palabraMostrada = new JLabel();
        palabraMostrada.setFont(new Font("Arial", Font.PLAIN, 24));
        add(palabraMostrada);

        campoLetra = new JTextField(2);
        campoLetra.setFont(new Font("Arial", Font.PLAIN, 18));
        add(campoLetra);

        botonIntentar = new JButton("Intentar");
        add(botonIntentar);

        contadorOportunidades = new JLabel("Oportunidades: 5");
        add(contadorOportunidades);

        mensaje = new JLabel("");
        mensaje.setPreferredSize(new Dimension(400, 30));
        add(mensaje);

        botonReiniciar = new JButton("Reiniciar");
        botonReiniciar.setEnabled(false);
        add(botonReiniciar);

        botonCambiar = new JButton("Cambiar palabras");
        add(botonCambiar);

        verPalabras = new JTextArea(5, 40);
        verPalabras.setEditable(false);
        add(new JScrollPane(verPalabras));

 

        iniciarJuego();

        botonIntentar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String entrada = campoLetra.getText().toUpperCase();
                if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                    verificarLetra(entrada.charAt(0));
                } else {
                    mensaje.setText("Ingresa solo una letra válida.");
                }
                campoLetra.setText("");
            }
        });

        botonReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iniciarJuego();
            }
        });

      
        botonCambiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] nuevasPalabras = new String[10];
                for (int i = 0; i < nuevasPalabras.length; i++) {
                    String input = JOptionPane.showInputDialog("Ingrese la palabra nueva deseada " + (i + 1) + ":");
                    if (input != null && !input.trim().isEmpty()) {
                        nuevasPalabras[i] = input.trim().toUpperCase();
                    } else {
                        i--; 
                    }
                }
                palabrasIniciales = nuevasPalabras;
                
                iniciarJuego();
            }
        });
    }

    public void iniciarJuego() {
        Random rand = new Random();
        String palabra = palabrasIniciales[rand.nextInt(palabrasIniciales.length)];
        palabraActual = palabra.toCharArray();
        palabraOculta = new char[palabraActual.length];
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '-';
        }
        oportunidades = 5;
        actualizarPantalla();
        mensaje.setText("Escribe una letra para adivinar.");
        botonIntentar.setEnabled(true);
        botonReiniciar.setEnabled(false);
    }

    public void verificarLetra(char letra) {
        boolean acierto = false;

        for (int i = 0; i < palabraActual.length; i++) {
            if (palabraActual[i] == letra && palabraOculta[i] == '-') {
                palabraOculta[i] = letra;
                acierto = true;
            }
        }

        if (acierto) {
            mensaje.setText("Correcto! Letra valida.");
        } else {
            oportunidades--;
            mensaje.setText("Incorrecto. Te quedan " + oportunidades + " oportunidades.");
        }

        if (String.valueOf(palabraOculta).equals(String.valueOf(palabraActual))) {
            mensaje.setText("Ganaste! La palabra era: " + String.valueOf(palabraActual));
            terminarJuego();
        } else if (oportunidades == 0) {
            mensaje.setText("Perdiste! La palabra era: " + String.valueOf(palabraActual));
            terminarJuego();
        }

        actualizarPantalla();
    }

    public void actualizarPantalla() {
        StringBuilder sb = new StringBuilder();
        for (char c : palabraOculta) {
            sb.append(c).append(" ");
        }
        palabraMostrada.setText(sb.toString());
        contadorOportunidades.setText("Oportunidades: " + oportunidades);
    }

    public void terminarJuego() {
        botonIntentar.setEnabled(false);
        botonReiniciar.setEnabled(true);
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Aguilar_Adrian_Jugar().setVisible(true));
    }
}