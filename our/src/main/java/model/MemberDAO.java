package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void connection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pass = "hr";

			conn = DriverManager.getConnection(url, user, pass);

		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc.jar파일 또는 driver경로 확인!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결실패");
			e.printStackTrace();
		}

	}

	public void close() {

		try {

			if (rs != null) {rs.close();}
			if (psmt != null) {psmt.close();}
			if (conn != null) {conn.close();}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public int join(MemberDTO member) {

		int cnt = 0; 

		try {

			connection();

			String sql = "insert into web_member values(?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getPw());
			psmt.setString(3, member.getName());
			
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// DB관련 오류 발생시 실행되는 catch문
			e.printStackTrace();
		} finally {
			// 무조건 실행하는 구문!!
			// DB 종료기능 구현

			// close 메소드 호출
			close();
		}
		// end
		return cnt;
	}
}
