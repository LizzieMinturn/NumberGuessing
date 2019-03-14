import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args){

        //declare
        int pickedNumber,enteredNumber;
        Scanner keyboard;

        //initialize
        keyboard = new Scanner(System.in);
        pickedNumber = (int)(Math.random()*100);

        System.out.println("Choose a number between 1 and 100");

        boolean win = false;
        while (win == false) {

        enteredNumber = keyboard.nextInt();
        int numberOfTries = 0;
        numberOfTries++;


            if (enteredNumber > pickedNumber) {
                System.out.println("Too high, try again");
            } else if (enteredNumber < pickedNumber) {
                System.out.println("Too low, try again");
            } else if (enteredNumber == pickedNumber) {
                System.out.println("Correct!");
                win = true;
            }
        }
    }
}
