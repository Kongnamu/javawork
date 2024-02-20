package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest {

public static void main(String[] args) {

	Connection conn = null;
	PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // jdbc드라이버를 가져오는 코드 누락
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
					"c##test",
		            "pwtest"); // 비번 넣어야함
			System.out.println("연결 성공");
	
			//매개변수화된 sql 문 작성
			String sql = "INSERT INTO users("
					+ "userid, username, userpassword, userage, useremail) "
					+ "VALUES(?, ?, ?, ?, ?)";
	
			//PreparedStatement 열기 및 값 지정
			pstmt = conn.prepareStatement(sql); // ()안에 sql 넣어야함
			
			pstmt.setString(1, "cloud");
			pstmt.setString(2, "이구름");
			pstmt.setString(3, "u2345");
			pstmt.setInt(4, 100);
			pstmt.setString(5, "cloud@korea.kr");
		
			int rows = pstmt.executeUpdate(); //pstmt.executeUpdate로 수정 필요
			System.out.println("저장된 행 수: " + rows);
				pstmt.close();
			} catch (ClassNotFoundException e) {
					e.printStackTrace();
			} catch (SQLException e) {
					e.printStackTrace();
			} finally {
					if(conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
		
						}
		
						System.out.println("연결 끊음");
		
		}
		
		}
		
		}
	
	}