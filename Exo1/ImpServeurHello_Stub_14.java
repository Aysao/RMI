// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

public final class ImpServeurHello_Stub
    extends java.rmi.server.RemoteStub
    implements Hello, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_disBonjour_0;
    
    static {
	try {
	    $method_disBonjour_0 = Hello.class.getMethod("disBonjour", new java.lang.Class[] {});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public ImpServeurHello_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of disBonjour()
    public java.lang.String disBonjour()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_disBonjour_0, null, 6805628327962282984L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}
