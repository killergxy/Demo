package jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCTest {
	
	
	
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@20.26.11.4:1521:CSHP01";// �����ַ�
		String user = "ord_base";// �û���
		String password = "ord_base";// ����

		// try {
		// Class.forName(driver);
		// } catch (ClassNotFoundException e) {
		// System.out.println("����jdbc��ʧ��");
		// System.out.println(e.getMessage());
		// return;
		// }

		Connection con = null;
		String sql = "select * from occ_factor";
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con.getCatalog());
			PreparedStatement prepareStatement = con.prepareStatement(sql);
			ResultSetMetaData rsmd = prepareStatement.getMetaData();
			System.out.println(rsmd.getPrecision(1));

			// ResultSet executeQuery = prepareStatement.executeQuery();
			// while (executeQuery.next()) {
			// System.out.println("Name:" + executeQuery.getString(1)
			// + " Sex:" + executeQuery.getString(2));
			// }
		} catch (SQLException e) {
			System.out.println("执行数据库查询时出错...");
			e.printStackTrace();
		}finally{
			try {
				if(con != null){
					con.close();
				}
            } catch (SQLException e) {
	            e.printStackTrace();
            }
		}
	}
}
