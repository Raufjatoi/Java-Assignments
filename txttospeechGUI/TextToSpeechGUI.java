package txttospeechGUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextToSpeechGUI extends JFrame {
    private JTextField textField;
    private JButton speakButton;

    public TextToSpeechGUI() {
        setTitle("Text to Speech Converter");
        setSize(800, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel headingLabel = new JLabel("Text to Speech", SwingConstants.CENTER);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 36));
        add(headingLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());

        textField = new JTextField(40);
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        speakButton = new JButton("Speak");
        speakButton.setFont(new Font("Arial", Font.BOLD, 24));

        speakButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    speak(text);
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter some text!");
                }
            }
        });

        centerPanel.add(new JLabel("Enter text: "));
        centerPanel.add(textField);
        centerPanel.add(speakButton);

        add(centerPanel, BorderLayout.CENTER);

        JLabel bottomLabel = new JLabel("by Qadeer", SwingConstants.CENTER);
        bottomLabel.setFont(new Font("Arial", Font.ITALIC, 18));
        add(bottomLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void speak(String text) {
        // Code to convert text to speech goes here
        // For simplicity, let's just print the text for now
        System.out.println("Speaking: " + text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TextToSpeechGUI();
            }
        });
    }
}
