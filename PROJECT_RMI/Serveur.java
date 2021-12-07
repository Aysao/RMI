import java.rmi.server.*;
import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Serveur extends UnicastRemoteObject implements Action{
	public Serveur() throws RemoteException{super();}
	public void Affichage() throws java.rmi.RemoteException
	{
		System.out.println("coucou");
	}
	public static void main(String[] args)
	{
		try{
			Serveur s = new Serveur();
			String nom="TOTO";
			Naming.rebind(nom,s);
			System.out.println("Serveur enregister");		
		}
		catch(Exception e){System.err.println("Erreur : "+e);}
	}

}
