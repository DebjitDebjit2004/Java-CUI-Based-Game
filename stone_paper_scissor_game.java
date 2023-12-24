import java.util.Random;
import java.util.Scanner;

public class stone_paper_scissor_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("==================== STONE PAPER SCISSOR GAME ====================");
        int compChoice = rand.nextInt(3);

        System.out.println(">>> Choose 1 for Stone, 2 for Paper and 3 for Scissor");
        System.out.print(">>> Enter Your Choice: ");
        int your_choice = sc.nextInt();
        if (your_choice == 1){
            if ((compChoice + 1) == 1){
                System.out.println(">>> Your Choice is Stone");
                System.out.println(">>> Computer's Choice is Stone");
                System.out.println("==================== Match Draw!!! ====================");
            } else if ((compChoice + 1) == 2) {
                System.out.println(">>> Your Choice is Stone");
                System.out.println(">>> Computer's Choice is Paper");
                System.out.println("==================== You Lose!!! :( Computer Win ====================");
            } else {
                System.out.println(">>> Your Choice is Stone");
                System.out.println(">>> Computer's Choice is Scissor");
                System.out.println("==================== You Win!!! :) Computer Lose ====================");
            }
        } else if (your_choice == 2) {
            if ((compChoice + 1) == 1){
                System.out.println(">>> Your Choice is Paper");
                System.out.println(">>> Computer's Choice is Stone");
                System.out.println("==================== You Win!!! :) Computer Lose ====================");
            } else if ((compChoice + 1) == 2) {
                System.out.println(">>> Your Choice is Paper");
                System.out.println(">>> Computer's Choice is Paper");
                System.out.println("==================== Match Draw !!! ====================");
            } else {
                System.out.println(">>> Your Choice is Paper");
                System.out.println(">>> Computer's Choice is Scissor");
                System.out.println("==================== Computer Win!!! :( You Lose ====================");
            }
        } else if (your_choice == 3) {
            if ((compChoice + 1) == 1){
                System.out.println(">>> Your Choice is Scissor");
                System.out.println(">>> Computer's Choice is Stone");
                System.out.println("==================== Computer Win!!! :( You Lose ====================");
            } else if ((compChoice + 1) == 2) {
                System.out.println(">>> Your Choice is Scissor");
                System.out.println(">>> Computer's Choice is Paper");
                System.out.println("==================== You Win!!! :) Computer Lose  ====================");
            } else {
                System.out.println(">>> Your Choice is Scissor");
                System.out.println(">>> Computer's Choice is Scissor");
                System.out.println("==================== Match Draw !!! ====================");
            }
        } else {
            System.out.println(">>> Invalid Choice !!!!!!!!!!!!!!");
            System.out.println("==================== Thank You :) ====================");
        }
    }
}

