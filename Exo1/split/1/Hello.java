import java.rmi.*;
public interface Hello extends Remote
{
	public String disBonjour() throws RemoteException;
}
