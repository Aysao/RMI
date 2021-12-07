import java.rmi.server.*;
import java.rmi.*;
import java.util.HashMap;
public class Serveur extends UnicastRemoteObject implements ActionCompte
{
    private HashMap<Integer, Compte> liste;

    public static void main(String[] args)
    {
        try{
            Serveur srv = new Serveur();
            String nom = "serveurcompte";
            Naming.rebind(nom, srv);
            System.out.println("--- serveur enregistré ---");
        }
        catch (Exception e)
        {
            System.err.println("Erreur: " + e);
        }
    }

    public Serveur() throws RemoteException
    {
        super();
        liste = new  HashMap<Integer, Compte>();
    }

    public ICompte getCompte(int id) throws RemoteException 
    {
        if (liste.get(id) == null)
        {
            System.out.println("Création de compte ... ");
            liste.put(id, new Compte());
        }

        return liste.get(id);
    }

}