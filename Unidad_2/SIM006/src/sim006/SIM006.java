/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sim006;

/**
 *
 * @author yahir
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SIM006 extends JFrame {

    public SIM006() {
        setTitle("Ejercicio 6: KeyListener");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        setLocationRelativeTo(null);

        JTextField campo = new JTextField(20);
        JLabel contador = new JLabel("Caracteres: 0");
        JLabel palabras = new JLabel("Palabras: 0");

        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String texto = campo.getText();
                int total = campo.getText().length();
                contador.setText("Caracteres: " + total);
                int totalPalabras = texto.trim().isEmpty() ? 0 : texto.trim().split("\\s+").length;
                palabras.setText("Palabras: " + totalPalabras);
            }
        });

        add(new JLabel("Escribe algo: "));
        add(campo);
        add(contador);
        add(palabras);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SIM006().setVisible(true);
        });
    }
}