import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class GuessingGame implements ActionListener {
  JTextField userGuess;
  JButton guessButton, playAgain;
  JLabel enterGuess, highLow, lastGuess;
  Random random;
  int randomnum;

  GuessingGame() {
    Random random = new Random();
    int max = 100;
    int min = 1;
    int randomnum = min + random.nextInt(max);

    JFrame guessingGame = new JFrame("Guessing Game");
    guessingGame.setLayout(new FlowLayout() );
    guessingGame.setSize(240, 120);
    
    userGuess = new JTextField(10);
    userGuess.setActionCommand("myTF");

    guessButton = new JButton("Guess");
    playAgain = new JButton("Play Again");

    userGuess.addActionListener(this);
    guessButton.addActionListener(this);
    playAgain.addActionListener(this);

    enterGuess = new JLabel("Enter Your Guess:");
    highLow = new JLabel("");
    lastGuess = new JLabel("");

    guessingGame.add(enterGuess);
    guessingGame.add(userGuess);
    guessingGame.add(guessButton);
    guessingGame.add(highLow);
    guessingGame.add(lastGuess);
    guessingGame.add(playAgain);

    guessingGame.setVisible(true);
  }
    public void actionPerformed(ActionEvent ae) {
      if (ae.getActionCommand().equals("Guess")) {
        int guess = Integer.parseInt(userGuess.getText());
        String orgStr = GuessingGame.getText();
        String resStr = "";



        userGuess < 1 = highLow.setText("Too Low!");
        userGuess > 100 = highLow.setText("Too High!");



        for (int i=orgStr.length()-1; i >=0; i--)
        resStr += orgStr.charAt(i);

        userGuess.setText(resStr);
        lastGuess.setText("Last guess was " + userGuess.getText());
      }
      else {
        if (ae.getActionCommand().equals("Play Again")){
        int randomnum = 1 + random.nextInt(100);

        enterGuess.setText("Enter Your Guess:");
        highLow.setText("");
        lastGuess.setText("");
        userGuess.setText("");}
        else {
          highLow.setText("You pressed Enter.  Please press the Guess Button");
        }
      }
    }

    


  

}
