import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args){

        //declare
        Scanner keyboard;

        //initialize
        int tries = 5;
        keyboard = new Scanner(System.in);
        int pickedNumber = (int)(Math.random()*100);
        System.out.println("Choose a number between 1 and 100");

        boolean win = false;
        while (!win && tries>0) {

        int enteredNumber = keyboard.nextInt();

            if (enteredNumber > pickedNumber) {
                System.out.println("Too high");
                tries = tries-1;
            } else if (enteredNumber < pickedNumber) {
                System.out.println("Too low");
                tries = tries-1;
            } else if (enteredNumber == pickedNumber) {
                System.out.println("Correct!");
                win = true;
            }
        }
        if(tries ==0 ){
            System.out.println("out of tries.");
            System.out.println("The number was "+ pickedNumber);
        }
    }
}