/**
 * 
 */
package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**  
 * Copyright: Copyright (c) 2016 Asiainfo
 * 
 * @ClassName: Test.java
 * @Description: TODO
 *
 * @version: TODO
 * @author: gengxy
 * @date: 2016年1月25日 下午5:25:11 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * 2016年1月25日      gengxy          0.0.1-SNAPSHOT     TODO
*/
public class Test {
	public static void main(String[] args) throws Exception {
		File file = new File("D:\\test.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		Student stu = new Student();
		stu.setAge(18);
		stu.setName("gxy");
		stu.setScore(100);

		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objOutputStream = new ObjectOutputStream(
		        fileOutputStream);
		objOutputStream.writeObject(stu);
		objOutputStream.flush();
		objOutputStream.close();
		fileOutputStream.close();
		
		
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
		Student obj = (Student)objInputStream.readObject();
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.score);
		objInputStream.close();
		fileInputStream.close();
		
		System.out.println(stu == obj);
	}
}
