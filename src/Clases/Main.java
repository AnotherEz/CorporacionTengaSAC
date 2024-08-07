package Clases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Añadir y Quitar Panel con Botón");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear el panel padre con FlowLayout
        JPanel panelPadre = new JPanel();
        panelPadre.setLayout(new FlowLayout());

        // Crear un botón para añadir el panel hijo
        JButton addButton = new JButton("Añadir Panel Hijo");

        // Crear un botón para quitar el panel hijo
        JButton removeButton = new JButton("Quitar Panel Hijo");

        // Crear el panel hijo
        JPanel panelHijo = new JPanel();
        panelHijo.add(new JLabel("Soy el panel hijo"));

        // Añadir los botones al panel padre
        panelPadre.add(addButton);
        panelPadre.add(removeButton);

        // Añadir un ActionListener al botón de añadir
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Añadir el panel hijo al panel padre cuando se hace clic en el botón
                panelPadre.add(panelHijo);
                // Refrescar el panel padre para que se muestre el panel hijo añadido
                panelPadre.revalidate();
                panelPadre.repaint();
            }
        });

        // Añadir un ActionListener al botón de quitar
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Quitar el panel hijo del panel padre cuando se hace clic en el botón
                panelPadre.remove(panelHijo);
                // Refrescar el panel padre para que se quite el panel hijo
                panelPadre.revalidate();
                panelPadre.repaint();
            }
        });

        // Añadir el panel padre al marco
        frame.add(panelPadre);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
