/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sim005;

/**
 *
 * @author yahir
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SIM005 extends JFrame {

    public SIM005() {
        setTitle("Ejercicio 5: MouseListener");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);

        JLabel etiqueta = new JLabel("Pasa el ratón por aquí", SwingConstants.CENTER);
        etiqueta.setPreferredSize(new Dimension(200, 50));
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.LIGHT_GRAY);

        etiqueta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                etiqueta.setBackground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                etiqueta.setBackground(Color.BLUE);
            }
        });

        add(etiqueta);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SIM005().setVisible(true);
        });
    }
}