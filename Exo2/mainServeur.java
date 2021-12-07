import java.rmi.Naming;

public class mainServeur {
    public static void main(String[] args)
    {
        try{
            Serveur srv = new Serveur();
            String nom = "serveur_compte";
            Naming.rebind(nom, srv);
            System.out.println("--- serveur enregistré ---");
        }
        catch (Exception e)
        {
            System.err.println("Erreur: " + e);
        }
    }
}
