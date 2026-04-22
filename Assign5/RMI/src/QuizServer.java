import java.rmi.Naming;

public class QuizServer {

	public static void main(String args[]) {
		try {
			QuizImpl obj = new QuizImpl();
			
			Naming.rebind("rmi://localhost/QuizService", obj);
			System.out.println("Quiz Server is Running...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
