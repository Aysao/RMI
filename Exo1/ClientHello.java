import java.rmi.*;

public class ClientHello {
	public static void main(String args[]){
		try{
			Hello h = (Hello)Naming.lookup("nomobjet");
			String message = h.disBonjour();
			System.out.println(message);
		}
		catch(Exception e){
			System.err.println("Erreur: " + e);
		}
	}
}
