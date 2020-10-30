import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "How many days are in a week";
        String choiceOne = "5";
        String choiceTwo = "7";
        String choiceThree = "6";

        String correctAnswer = choiceTwo;
        boolean correctAnswerChosen = false;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        String retrieveAnswerText = "Please choose one of the following values: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree;
        System.out.println(retrieveAnswerText);

        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        while(correctAnswerChosen == false) {
            String choice = input.next();
            if (choice.equals(correctAnswer)) {
                System.out.println("Congratulations you are correct!");
                correctAnswerChosen = true;
            }else {
                System.out.println("Please try again");
                System.out.println(retrieveAnswerText);
            }
        }

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.


    }

}
