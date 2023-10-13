package dbcrud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateTest {

	public static void main(String[] args) {
		Connection conn= null;          // 네트워크 연결 클래스
	    PreparedStatement pstnt = null; // sql 처리 인터페이스
	      //JDBC 드라이버 등록
	      try {
	         Class.forName("oracle.jdbc.OracleDriver");
	         
	         //연결하기- getConnection(url,user, password)
	          conn = DriverManager.getConnection(
	               "jdbc:oracle:thin:@localhost:1521/xe",
	               "c##mydb",
	               "pwmydb");
	         System.out.println("연결 성공!");
	         
	         //DB처리 작업
	         //매개 변수화된 sql문 작성: 동적 바인딩
	         String sql = "UPDATE boards "
	         		+ "SET btitle = ?, bcontent = ?, bfilename = ?, bfiledata = ? "
	         		+ "WHERE bno = ?";
	         pstnt = conn.prepareStatement(sql);
	         // '?'값 지정
	         pstnt.setString(1, "노트북");
	         pstnt.setString(2, "LG 노트북입니다.");
	         pstnt.setString(3, "notebook.png");
	         //사진 첨부한 경우
	         pstnt.setBlob(4, new FileInputStream("src/dbcrud/notebook.png"));
	         pstnt.setInt(5, 8);
	      
	          
	         
	         //sql 실행
	         int rows = pstnt.executeUpdate();
	         System.out.println("저장된 행의 수: " + rows);
	         //auto commit됨
	      } catch (Exception e) {
			e.printStackTrace();
		} finally {
	         if(conn != null) { // 연결이 되어 있다면 
	            try {
	               conn.close();
	               System.out.println("연결 끊음");
	            } catch (SQLException e) {
	               e.printStackTrace();
	            }
	         }
	      }
	}

}
