import java.rmi.*;
import java.net.*;
public class Main
{
	public static void main(String arg[]){
		try {
			ImpServeurHello serv = new ImpServeurHello();
			String nom = "nomobjet";
			Naming.rebind(nom, serv);
			System.out.println("Serveur enregistrĂ©");
		}
		catch(Exception e){
			System.err.println("Erreur: " + e);
		}
	}
}
