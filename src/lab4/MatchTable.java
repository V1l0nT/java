package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MatchTable extends JFrame{
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    int pntmln = 0;
    int pntmdrd = 0;
    JLabel res = new JLabel("Result: "+pntmln+" X "+pntmdrd);
    String last = "N/A";
    JLabel lstscr = new JLabel("Last Scorer: "+last);
    String win = "DRAW";
    JLabel wingame = new JLabel("Winner: "+win);
    MatchTable() {
        super("AC Milan VS Real Madrid");
        setSize(400, 300);
        setLayout(new BorderLayout());
        add(milan, BorderLayout.WEST);
        add(madrid, BorderLayout.EAST);
        add(wingame, BorderLayout.NORTH);
        add(lstscr, BorderLayout.CENTER);
        add(res, BorderLayout.SOUTH);
        milan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent a) {
                pntmln+=1;
                last = "AC Milan";
                if (pntmln > pntmdrd) win = "AC Milan";
                        else if (pntmln == pntmdrd) win = "DRAW";
                        else win = "Real Madrid";
                res.setText("Result: "+pntmln+" X "+pntmdrd);
                lstscr.setText("Last Scorer: "+last);
                wingame.setText("Winner: "+win);
            }
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
        });
        madrid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent a) {
                pntmdrd+=1;
                last = "RealMadrid";
                if (pntmln > pntmdrd) win = "AC Milan";
                else if (pntmln == pntmdrd) win = "DRAW";
                else win = "Real Madrid";
                res.setText("Result: "+pntmln+" X "+pntmdrd);
                lstscr.setText("Last Scorer: "+last);
                wingame.setText("Winner: "+win);
            }
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
        });
    }

    public static void main(String[] args) {
        new MatchTable().setVisible(true);
    }
}
