
import java.rmi.*;
public class Client{
	public static void main(String[] args)
	{
		try{
			Action a = (Action) Naming.lookup("TOTO");		
			a.Affichage();
		}	
		catch(Exception e){System.err.println("Erreur : "+e);}
	}
}
