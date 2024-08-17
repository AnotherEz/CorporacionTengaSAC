
package GIU.VendedorCajero;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample extends JFrame {

    private JPanel basePanel;
    private CardLayout cardLayout;

    public MenuExample() {
        // Configuración de la ventana
        setTitle("Ejemplo de Cambio de Paneles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Crear los paneles que se cambiarán
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.add(new JLabel("Panel 1"));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.add(new JLabel("Panel 2"));

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        panel3.add(new JLabel("Panel 3"));

        // Configurar el CardLayout
        cardLayout = new CardLayout();
        basePanel = new JPanel(cardLayout);
        basePanel.add(panel1, "Panel 1");
        basePanel.add(panel2, "Panel 2");
        basePanel.add(panel3, "Panel 3");

        // Crear botones del menú
        JButton button1 = new JButton("Opción 1");
        JButton button2 = new JButton("Opción 2");
        JButton button3 = new JButton("Opción 3");

        // Agregar ActionListeners para cambiar los paneles
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(basePanel, "Panel 1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(basePanel, "Panel 2");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(basePanel, "Panel 3");
            }
        });

        // Configurar el layout principal
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.add(button1);
        menuPanel.add(button2);
        menuPanel.add(button3);

        // Configurar el layout del JFrame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(menuPanel, BorderLayout.WEST);
        getContentPane().add(basePanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuExample().setVisible(true);
            }
        });
    }
}
