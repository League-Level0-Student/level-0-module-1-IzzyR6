import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1= JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer1.equals("a stamp")) {
	JOptionPane.showMessageDialog(null, "correct!");
	score=score+1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong!!! The answer is: a stamp.");
}
		// 6. Add some more riddles
String answer2=JOptionPane.showInputDialog("Who makes it, has no need of it.\n" + "Who buys it, has no use for it. \n" + "Who uses it can neither see nor feel it. \n" + "What is it?");
if(answer2.equals("a coffin")) {
	JOptionPane.showMessageDialog(null, "correct!");
	score=score+1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong!!! The answer is: a coffin.");
}
String answer3= JOptionPane.showInputDialog("What has a head and tail, but no body?");
if (answer3.equals("a coin")) {
	JOptionPane.showMessageDialog(null, "correct!");
	score=score+1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong!!! The answer is: a coin.");
}


		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your final score is... " + score);
	}
}

