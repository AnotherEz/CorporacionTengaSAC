import javax.swing.*;
import java.awt.*;

public class SwingFillersExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Fillers Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Horizontal Glue Example
        JPanel hGluePanel = new JPanel();
        hGluePanel.setLayout(new BoxLayout(hGluePanel, BoxLayout.X_AXIS));
        hGluePanel.add(new JButton("Left"));
        hGluePanel.add(Box.createHorizontalGlue());
        hGluePanel.add(new JButton("Right"));
        panel.add(hGluePanel);
        panel.add(Box.createVerticalStrut(10));

        // Vertical Glue Example
        JPanel vGluePanel = new JPanel();
        vGluePanel.setLayout(new BoxLayout(vGluePanel, BoxLayout.Y_AXIS));
        vGluePanel.add(new JButton("Top"));
        vGluePanel.add(Box.createVerticalGlue());
        vGluePanel.add(new JButton("Bottom"));
        panel.add(vGluePanel);
        panel.add(Box.createVerticalStrut(10));

        // Horizontal Strut Example
        JPanel hStrutPanel = new JPanel();
        hStrutPanel.setLayout(new BoxLayout(hStrutPanel, BoxLayout.X_AXIS));
        hStrutPanel.add(new JButton("Button 1"));
        hStrutPanel.add(Box.createHorizontalStrut(20));
        hStrutPanel.add(new JButton("Button 2"));
        panel.add(hStrutPanel);
        panel.add(Box.createVerticalStrut(10));

        // Vertical Strut Example
        JPanel vStrutPanel = new JPanel();
        vStrutPanel.setLayout(new BoxLayout(vStrutPanel, BoxLayout.Y_AXIS));
        vStrutPanel.add(new JButton("Button 1"));
        vStrutPanel.add(Box.createVerticalStrut(20));
        vStrutPanel.add(new JButton("Button 2"));
        panel.add(vStrutPanel);
        panel.add(Box.createVerticalStrut(10));

        // Rigid Area Example
        JPanel rigidAreaPanel = new JPanel();
        rigidAreaPanel.setLayout(new BoxLayout(rigidAreaPanel, BoxLayout.X_AXIS));
        rigidAreaPanel.add(new JButton("Button 1"));
        rigidAreaPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        rigidAreaPanel.add(new JButton("Button 2"));
        panel.add(rigidAreaPanel);
        panel.add(Box.createVerticalStrut(10));

        // Glue Example
        JPanel gluePanel = new JPanel();
        gluePanel.setLayout(new BoxLayout(gluePanel, BoxLayout.X_AXIS));
        gluePanel.add(new JButton("Button 1"));
        gluePanel.add(Box.createGlue());
        gluePanel.add(new JButton("Button 2"));
        panel.add(gluePanel);
        panel.add(Box.createVerticalStrut(10));

        frame.add(panel);
        frame.setVisible(true);
    }
}

