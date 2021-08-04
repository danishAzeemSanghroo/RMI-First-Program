import java.rmi.*;
import java.rmi.server.*;

class RMIServer{
	public static void main(String args[])throws Exception{
	CalcImp ob=new CalcImp();
	UnicastRemoteObject.exportObject(ob);
	Naming.rebind("ali",ob);
	System.out.println("RMI Server Started....");
	}
}