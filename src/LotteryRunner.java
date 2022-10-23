import java.util.Scanner;

public class LotteryRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your lottery pick: ");
        int userNum = s.nextInt();

        Lottery lot1 = new Lottery();
        int winnings = lot1.determineWinnings(userNum);
        System.out.println("The lottery number is " + lot1.getLotNum());

        String message;
        if (winnings == 100) {
            message = "Exact match: You win $100!";
        } else if (winnings == 10) {
            message = "Match all digits but not in correct order: You win $10!";
        } else if (winnings == 3) {
            message = "Match one digit: You win $3!";
        } else {
            message = "No matching numbers, you win nothing :(";
        }
        System.out.println(message);
    }
}
