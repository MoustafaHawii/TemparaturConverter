import javax.swing.*;
import java.awt.*;

public class Converter extends JFrame {
    //Konstruktor
    public Converter () {
        setTitle("Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        getContentPane().setLayout(new BorderLayout(20,20));

        JPanel mainPanel = new JPanel(new BorderLayout(5,5));
        JPanel centerPanel = new JPanel(new BorderLayout(20,20));
        JPanel buttonPanel = new JPanel(new GridLayout(3,2,20,20));

        JLabel titel = new JLabel("What do u want 2 do?");

        JButton c2f = new JButton("C --> F");
        JButton f2c = new JButton("F --> C");

        JButton c2k = new JButton("C --> K");
        JButton k2c = new JButton("K --> C");

        JButton f2k = new JButton("F --> K");
        JButton k2f = new JButton("K --> F");

        buttonPanel.add(c2f);
        buttonPanel.add(f2c);
        buttonPanel.add(c2k);
        buttonPanel.add(k2c);
        buttonPanel.add(f2k);
        buttonPanel.add(k2f);

        centerPanel.add(buttonPanel, BorderLayout.CENTER);

        mainPanel.add(titel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        getContentPane().add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Converter();
    }
}