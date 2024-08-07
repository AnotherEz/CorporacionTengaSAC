import javax.swing.*;
import java.awt.*;

public class LayoutExamples {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Examples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Absolute Layout", createAbsoluteLayoutPanel());
        tabbedPane.addTab("Border Layout", createBorderLayoutPanel());
        tabbedPane.addTab("Box Layout", createBoxLayoutPanel());
        tabbedPane.addTab("Card Layout", createCardLayoutPanel());
        tabbedPane.addTab("Flow Layout", createFlowLayoutPanel());
        tabbedPane.addTab("Grid Bag Layout", createGridBagLayoutPanel());
        tabbedPane.addTab("Grid Layout", createGridLayoutPanel());
        tabbedPane.addTab("Overlay Layout", createOverlayLayoutPanel());

        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static JPanel createAbsoluteLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null); // Absolute Layout
        JButton button = new JButton("Button");
        button.setBounds(50, 50, 100, 30); // x, y, width, height
        panel.add(button);
        return panel;
    }

    private static JPanel createBorderLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);
        panel.add(new JButton("East"), BorderLayout.EAST);
        panel.add(new JButton("West"), BorderLayout.WEST);
        panel.add(new JButton("Center"), BorderLayout.CENTER);
        return panel;
    }

    private static JPanel createBoxLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Dispone en una columna
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        return panel;
    }

    private static JPanel createCardLayoutPanel() {
        JPanel panel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        panel.setLayout(cardLayout);
        panel.add(new JButton("Card 1"), "Card1");
        panel.add(new JButton("Card 2"), "Card2");
        cardLayout.show(panel, "Card1"); // Muestra "Card1"
        return panel;
    }

    private static JPanel createFlowLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        return panel;
    }

    private static JPanel createGridBagLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("Button 1"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JButton("Button 2"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JButton("Button 3"), gbc);
        return panel;
    }

    private static JPanel createGridLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2)); // 2 filas, 2 columnas
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        return panel;
    }

    private static JPanel createOverlayLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new OverlayLayout(panel));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);
        return panel;
    }
}
