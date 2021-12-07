import java.rmi.*;
import java.rmi.server.*;
public class Server  extends UnicastRemoteObject implements IServer{
    public IBagOfTask bag;
    
    public static void main(String[] args)
    {
        try {
            IServer srv = new Server();
            String name = "serverBoT";
            Naming.rebind(name, srv);
            System.out.println("--- serveur enregistré ---");
        }
        catch(Exception ex)
        {
            System.err.println("Erreur: " + ex);
        }
    }

    public Server() throws RemoteException 
    {
        super();
        bag = new BagOfTask(120);

    }

    public synchronized ITask getTask() throws RemoteException
    {
        System.out.println("dispatched task");
        return bag.getNext();
    }

    public synchronized void sendResult(ITask t) throws RemoteException
    {
        System.out.println("got result : "+ t.isPrimary());
        bag.sendResult(t);
    }

    public int getSize() throws RemoteException
    {
        return bag.getSize();
    }
    public void affichage() throws RemoteException
    {
        for(int i = 2; i < bag.getSize();i++)
        {
            System.out.print("Le nombre "+i+" est primaire ? : "+bag.getTab()[i]);
        }
    }

}
