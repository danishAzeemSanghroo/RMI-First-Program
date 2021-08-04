import java.rmi.*;
import java.rmi.server.*;

	interface Calc extends Remote{
		int add(int a,int b)throws RemoteException;
		int mul(int a,int b)throws RemoteException;
	}