import java.rmi.*;

public interface QuizInterface extends Remote{

	String getQuestion(int qno) throws RemoteException;
	boolean checkAnswer(int qno, int ans) throws RemoteException;
	int getScore() throws RemoteException;
}
