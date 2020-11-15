package dto;

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

        public void checkIfWon(String msg)
        {
            for (int iterator = 1; iterator < Fields.length - 1; iterator++)
            {
                String textleft = Fields[iterator - 1].getText();
                String textright = Fields[iterator + 1].getText();
                String textcurrent = Fields[iterator].getText();
                if (textcurrent.isEmpty())
                {
                    continue;
                }
                if (textleft.equals(textcurrent) && textleft.equals(textright))
                {
                    System.out.println(msg);
                    System.exit(0);
                }
                if (iterator > 2 && iterator < 6)
                {
                    String textabove = Fields[iterator - 3].getText();
                    String textbelow = Fields[iterator + 3].getText();
                    if (textabove.equals(textcurrent) && textabove.equals(textbelow))
                    {
                        System.out.println(msg);
                        System.exit(0);
                    }
                    if (iterator == 4)
                    {
                        if (textcurrent.equals(Fields[0]) && textcurrent.equals(Fields[9]))
                        {
                            System.out.println(msg);
                            System.exit(0);
                        } else if (textcurrent.equals(Fields[2]) && textcurrent.equals(Fields[6])){
                            System.out.println(msg);
                            System.exit(0);
                        }
                    }

                }
            }
        }

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
            checkIfWon("Human Player won!");



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
            checkIfWon("DTO Player won!");




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
