package dto;

import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TicTacToeField {
    private JButton Fields[] = new JButton[9];
    private int [] scores = new int[2];
    private TicTacToePlayer dtoPlayer;
    private String HumanPlayerName = "";

    public String getHumanPlayerName() {
        return HumanPlayerName;
    }

    public void setHumanPlayerName(String humanPlayerName) {
        HumanPlayerName = humanPlayerName;
    }

    public JButton[] getFields() {
        return Fields;
    }

    public int[] getScores() {
        return scores;
    }

    public TicTacToePlayer getDtoPlayer() {
        return dtoPlayer;
    }

    public TicTacToeField(TicTacToePlayer dtoPlayer){
        this.dtoPlayer = dtoPlayer;
    }

    public class TicTacToe extends JPanel
    {
        public TicTacToe(){
            setLayout(new GridLayout(3,3));
            initField();

        }
        public void initField()
        {
            for(int i = 0; i <= 8; i++)
            {
                Fields[i] = new JButton();
                Fields[i].setText("");
                Fields[i].addActionListener(new buttonListener());

                add(Fields[i]); //adds this button to JPanel (note: no need for JPanel.add(...)
                //because this whole class is a JPanel already
            }

        }
    }

    private class buttonListener implements ActionListener {

        public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
            JButton buttonClicked = (JButton)actionEvent.getSource();
            String marked = "O";
            if (dtoPlayer.is_circle()) {
                marked = "X";
            }
            buttonClicked.setText(marked);
            String text0 = Fields[0].getText();
            String text1 = Fields[1].getText();
            String text2 = Fields[2].getText();
            int iterator = 0;
            for (JButton buttons : Fields){

                if (!buttons.getText().isEmpty() && buttons.getText().equals(Fields[iterator - 1]))
                {
                    
                }
                iterator++;
            }



            for (JButton field : Fields) {
                if (field.getText().isEmpty())
                {
                    marked = "X";
                    if (dtoPlayer.is_circle()) {
                        marked = "O";
                    }
                    field.setText(marked);
                    break;
                }
            }




        }
    }

    public void startGame() {

        JFrame window = new JFrame("Tic-Tac-Toe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.getContentPane().add(new TicTacToe());
        window.setBounds(300,200,300,300);
        window.setVisible(true);

    }
}
