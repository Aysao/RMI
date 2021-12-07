import java.rmi.server.*;
import java.rmi.*;
import java.net.*;

public class ImpServeurHello extends UnicastRemoteObject implements Hello {
	public ImpServeurHello() throws RemoteException {super();}
	public String disBonjour() throws RemoteException {return "Bonjour !";}
}
