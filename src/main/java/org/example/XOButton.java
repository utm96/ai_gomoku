package org.example;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Image;

public class XOButton extends JButton {
    private ImageIcon X;
    private ImageIcon O;
    public Point point;
    public static boolean isXMove = true;
    public int value = 0;

    public XOButton(int x, int y) {
        X = new ImageIcon("C:\\Users\\minhut\\Desktop\\AI-homework-master\\ai_tictactoe\\src\\main\\resources\\X_caro.PNG");
        Image x_image = X.getImage();
        Image newimg = x_image.getScaledInstance(80,80, java.awt.Image.SCALE_SMOOTH);
        X = new ImageIcon(newimg);
        O = new ImageIcon("C:\\Users\\minhut\\Desktop\\AI-homework-master\\ai_tictactoe\\src\\main\\resources\\O_caro.PNG");
        Image o_image = O.getImage();
        Image onewimg = o_image.getScaledInstance(80,80, java.awt.Image.SCALE_SMOOTH);
        O = new ImageIcon(onewimg);
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);

        this.point = new Point(x, y);

//		addActionListener(this);
    }

    public void setState(Boolean isXMove) {
        if (isXMove) {
            setIcon(X);
            value = 2;
            XOButton.isXMove = false;
        } else {
            setIcon(O);
            value = 1;
            XOButton.isXMove = true;
        }

    }


}
