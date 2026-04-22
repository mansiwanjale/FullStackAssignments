import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
public class QuizImpl extends UnicastRemoteObject implements QuizInterface {

	String[] questions= {
			"1. Capital of India?\n1) Mumbai\n2) Delhi\n3) Pune\n4) Chennai",
	        
	        "2. 2 + 2 = ?\n1) 3\n2) 4\n3) 5\n4) 6",
	        
	        "3. Which language is used for Android development?\n1) Python\n2) Java\n3) C\n4) HTML",
	        
	        "4. Which is a database?\n1) MySQL\n2) HTML\n3) CSS\n4) Java",
	        
	        "5. Which company developed Java?\n1) Microsoft\n2) Apple\n3) Sun Microsystems\n4) Google"
	    	
	};
	
	int[] answers= {2,2,2,1,3};
	int score =0;
	
	protected QuizImpl() throws RemoteException{
		super();
	}
	
	public boolean checkAnswer(int qno,int ans) throws RemoteException{
		if (answers[qno] == ans) {
			score++;
			return true;
		}
		
		return false;
	}
	
	public int getScore() throws RemoteException{
		return score;
	}

	public String getQuestion(int qno) throws RemoteException {
		return questions[qno];
	}
	
}
