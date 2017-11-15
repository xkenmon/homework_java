package cn.bigmeng.homework_java.experiment.gui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickMe {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("click me!");
        panel.add(button);
        button.addMouseListener(new MyClick());
        frame.setBounds(500, 500, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    static class MyClick implements MouseListener {
        boolean flag = false;

        public void mouseClicked(MouseEvent e) {
            JButton bt = (JButton) e.getComponent();
            bt.setText(flag ? "click me!" : "click me again!");
            flag = !flag;
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
