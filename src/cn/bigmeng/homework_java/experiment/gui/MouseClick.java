package cn.bigmeng.homework_java.experiment.gui;

import org.omg.CORBA.FREE_MEM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

public class MouseClick {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("click Test");
        frame.setLayout(new BorderLayout());
        frame.setBounds(500, 500, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("please click me to update Date");
        panel.add(button);
        button.addMouseListener(new MouseL(frame));
        frame.setVisible(true);
    }

    public static class MouseL implements MouseListener {
        JFrame frame;

        MouseL(JFrame frame) {
            this.frame = frame;
        }

        public void mouseClicked(MouseEvent e) {
            System.out.println("click...");
            frame.setTitle(new Date().toString());
        }

        public void mousePressed(MouseEvent e) {

        }

        public void mouseReleased(MouseEvent e) {

        }

        public void mouseEntered(MouseEvent e) {

        }

        public void mouseExited(MouseEvent e) {

        }
    }
}
