/**
 * 
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**  
 * Copyright: Copyright (c) 2016 Asiainfo
 * 
 * @ClassName: RmiHelloWorldImpl.java
 * @Description: TODO
 *
 * @version: 0.0.1-SNAPSHOT
 * @author: gengxy
 * @date: 2016年3月24日 上午10:31:03 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * 2016年3月24日      gengxy          0.0.1-SNAPSHOT     TODO
*/
public class RmiHelloWorldImpl extends UnicastRemoteObject implements
        IRmiHelloWorld {

	/**
	 * 
	 */
    private static final long serialVersionUID = 123l;

	protected RmiHelloWorldImpl() throws RemoteException {
	    super();
    }

	@Override
	public void sayHello() throws java.rmi.RemoteException {
		System.out.println("Hello world!");
	}
	
	public static void main(String[] args) {
		IRmiHelloWorld hello = null;
        try {
	        hello = new RmiHelloWorldImpl();
	        LocateRegistry.createRegistry(1099); //加上此程序，就可以不要在控制台上开启RMI的注册程序，1099是RMI服务监视的默认端口
	        java.rmi.Naming.rebind("rmi://localhost:1099/hello", hello);
        } catch (RemoteException e) {
	        e.printStackTrace();
        } catch (MalformedURLException e) {
	        e.printStackTrace();
        }
	   
    }

}
