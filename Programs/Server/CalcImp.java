import java.rmi.*;
import java.rmi.server.*;


	class CalcImp implements Calc{
		public CalcImp()throws Exception{
			super();
		}
		
		public int add(int a,int b)throws RemoteException{
			return a+b;
		}
		public int mul(int a,int b)throws RemoteException{
			return a*b;
		}
	}