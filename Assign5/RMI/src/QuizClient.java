import java.rmi.*;
import java.util.Scanner;

public class QuizClient {
	public static void main(String[] args) {
		try {
			QuizInterface obj = (QuizInterface) Naming.lookup("rmi://localhost/QuizService");
			Scanner sc = new Scanner(System.in);

			System.out.println("Client is running\n");

			for(int i = 0; i < 5; i++) {
				System.out.println(obj.getQuestion(i));   // 👈 CALL SERVER
				
				System.out.print("Enter your answer: ");
				int ans = sc.nextInt();

				boolean result = obj.checkAnswer(i, ans); // 👈 CALL SERVER

				if(result) {
					System.out.println("Correct!\n");
				} else {
					System.out.println("Wrong!\n");
				}
			}

			int finalScore = obj.getScore(); // 👈 CALL SERVER
			System.out.println("Your Score: " + finalScore);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}