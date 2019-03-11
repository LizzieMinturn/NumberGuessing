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
        enteredNumber = keyboard.nextInt();
        System.out.println(pickedNumber);

        if(enteredNumber>pickedNumber){
            System.out.println("Too high");
        }
       
    }
}
