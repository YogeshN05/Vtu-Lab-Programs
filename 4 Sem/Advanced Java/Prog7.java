/*
Demonstrate a swing event handling application that creates 2 buttons Alpha and Beta and displays the 
text “Alpha pressed” when alpha button is clicked and “Beta pressed” when beta button is clicked.
 */

package pkg4jd23is126;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prog7 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Swing Event Handling Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create the label to display messages
        final JLabel label = new JLabel("Press a button");
        frame.add(label);

        // Create the Alpha button
        JButton alphaButton = new JButton("Alpha");
        frame.add(alphaButton);

        // Create the Beta button
        JButton betaButton = new JButton("Beta");
        frame.add(betaButton);

        // Add ActionListener to the Alpha button
        alphaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display message when Alpha button is pressed
                label.setText("Alpha pressed");
            }
        });

        // Add ActionListener to the Beta button
        betaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display message when Beta button is pressed
                label.setText("Beta pressed");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}


//OUTPUT:-
//DISPLAYED ON SCREEN

