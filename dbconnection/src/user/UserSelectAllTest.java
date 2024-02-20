package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserSelectAllTest {

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
	         String sql = "SELECT * FROM users";
	         pstnt = conn.prepareStatement(sql);
	         
	         //sql 실행 - 검색
	         ResultSet rs = pstnt.executeQuery();
	         List<User> userList = new ArrayList<>();
	         while(rs.next()) { //검색된 데이터가 있으면 (찾았으면)
	        	 //db에서 userid(칼럼은 소문자)를 꺼내옴
	        	 User user = new User();
	        	 user.setUserId(rs.getString("userid"));
	        	 user.setUserName(rs.getString("username"));
	        	 user.setUserPassword(rs.getString("userpassword"));
	        	 user.setUserAge(rs.getInt("userage"));
	        	 user.setUserMail(rs.getString("usermail"));
	        	 //리스트에 user 객체 저장
	        	 userList.add(user);
	         }
	         
	         /* for(int i = 0; i < userList.size(); i++) {
	        	 User user = userList.get(i);
	        	//System.out.println(user);
	        	 System.out.println("userId: " + user.getUserId());
	        	 System.out.println("userName: " + user.getUserName());
	        	 System.out.println("userPassword: " + user.getUserPassword());
	        	 System.out.println("userAge: " + user.getUserAge());
	        	 System.out.println("userMail: " + user.getUserMail());
	        	 System.out.println("===========================================");
	         }*/
	         
	         for(User user : userList) {
	        	 System.out.println("userId: " + user.getUserId());
	        	 System.out.println("userName: " + user.getUserName());
	        	 System.out.println("userPassword: " + user.getUserPassword());
	        	 System.out.println("userAge: " + user.getUserAge());
	        	 System.out.println("userMail: " + user.getUserMail());
	        	 System.out.println("===========================================");
	         }
	         //스텍구조이므로 종료 순서를 아래처럼 rs > pstnt > conn순으로 함
	         rs.close();
	         pstnt.close();
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      } catch (SQLException e) {
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
