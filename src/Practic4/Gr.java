package Practic4;

import javax.swing.*;
import java.awt.*;

public class Gr extends JFrame {

    JButton bMilan = new JButton("AC Milan");
    JButton bMadrid = new JButton("Real Madrid");
    JLabel jResult = new JLabel("Result: 0 X 0");
    JLabel jLastScorer = new JLabel("Last Scorer: N/A");
    Label lWinner = new Label("Winner: Draw");
    int MilanScore = 0;
    int MadridScore = 0;
    String lastScorer = "N/A";
    String winner = "N/A";

    public Gr() {
        super("Game");
        setLayout(new FlowLayout());
        setSize(180, 200);
        add(bMilan);
        add(bMadrid);
        add(jResult);
        add(jLastScorer);
        add(lWinner);
        bMilan.addActionListener(ae -> {
            MilanScore++;
            jLastScorer.setText("Last Scorer: AC Milan");
            Check();
        });
        bMadrid.addActionListener(ae -> {
            MadridScore++;
            jLastScorer.setText("Last Scorer: Real Madrid");
            Check();
        });
    }

    private void Check() {
        jResult.setText("Result: " + MilanScore + " X " + MadridScore);
        if (MilanScore > MadridScore) {
            lWinner.setText("Winner: AC Milan");
        } else if (MadridScore > MilanScore) {
            lWinner.setText("Winner: Real Madrid");
        } else {
            lWinner.setText("Winner: Draw");
        }
    }

    public static void main(String[] args) {
        new Gr().setVisible(true);
    }
}