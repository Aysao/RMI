import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServer extends Remote {
    public ITask getTask() throws RemoteException;
    public void sendResult(ITask t) throws RemoteException;
    public int getSize() throws RemoteException;
    public void affichage() throws RemoteException;
}
