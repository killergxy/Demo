package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) {
	    try {
	        IRmiHelloWorld hello = (IRmiHelloWorld) Naming.lookup("rmi://192.168.1.109:1099/hello");
	        hello.sayHello();
        } catch (MalformedURLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        } catch (RemoteException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        } catch (NotBoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }
    }
}
