/**
 * 
 */
package rmi;

import java.rmi.Remote;

/**  
 * Copyright: Copyright (c) 2016 Asiainfo
 * 
 * @ClassName: IRmiHelloWorld.java
 * @Description: TODO
 *
 * @version: 0.0.1-SNAPSHOT
 * @author: gengxy
 * @date: 2016年3月24日 上午10:30:03 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * 2016年3月24日      gengxy          0.0.1-SNAPSHOT     TODO
*/
public interface IRmiHelloWorld extends Remote {
	public void sayHello() throws java.rmi.RemoteException;
}
