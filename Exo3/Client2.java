import java.rmi.Naming;

public class Client2 {
    public static void main(String[] args)
    {
        IServer srv = null;
        try{
            srv = (IServer) Naming.lookup("serverBoT");
            for(int i = 2;i < srv.getSize(); i++)
            {
                ITask t = srv.getTask();
                t.run();
                srv.sendResult(t);
            }
        }
        catch(Exception e)
        {
            System.err.println("Problem : "+e);
            System.exit(1);
        }
    }
}
