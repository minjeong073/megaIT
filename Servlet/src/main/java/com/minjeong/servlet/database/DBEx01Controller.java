package com.minjeong.servlet.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.minjeong.servlet.common.MysqlService;

@WebServlet("/db/ex01")
public class DBEx01Controller  extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			response.setContentType("text/plain");
			
			PrintWriter out = response.getWriter();
			
			MysqlService mysqlService = MysqlService.getInstance();
			mysqlService.connect();
			
			String selectQuery = "SELECT * FROM `used_goods`;";
			ResultSet resultSet = mysqlService.select(selectQuery);
			
			try {
				while(resultSet.next()) {
					String title = resultSet.getString("title");
					int price = resultSet.getInt("price");
					
					out.println("제목 : " + title + " 가격 : " + price);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			String insertQuery = "INSERT INTO `used_goods`\r\n"
					+ "(`sellerId`, `title`, `price`, `description`, `picture`, `createdAt`, `updatedAt`)\r\n"
					+ "VALUE\r\n"
					+ "(3, '고양이 간식 팝니다', 2000, '저희 고양이가 까탈스러워서 안먹어요', NULL, now(), now());";
			
			int count = mysqlService.update(insertQuery);
			
			out.println("삽입결과 : " + count);
			
			
//			try {
//				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//				
//				// 접속 주소, 아이디, 패스워드 
//				String url = "jdbc:mysql://localhost:3306/ming_0707";
//				String userId = "root";
//				String password = "root";
//				
//				Connection connection = DriverManager.getConnection(url, userId, password);
//				Statement statement = connection.createStatement();
//				
//				// used_goods 모든 행 출력
//				String selectQuery = "SELECT * FROM `used_goods`;";
//				ResultSet resultSet = statement.executeQuery(selectQuery);
//				
//				while(resultSet.next()) {
//					
//					String title = resultSet.getString("title");
//					int price = resultSet.getInt("price");
//					
//					out.println("제목 : " + title + " 가격 : " + price);
//					
//				}
//				
//				String insertQuery = "INSERT INTO `used_goods`\r\n"
//						+ "(`sellerId`, `title`, `price`, `description`, `picture`, `createdAt`, `updatedAt`)\r\n"
//						+ "VALUE\r\n"
//						+ "(3, '고양이 간식 팝니다', 2000, '저희 고양이가 까탈스러워서 안먹어요', NULL, now(), now());";
//				
//				// insert, update, delete
//				// 실행된 행의 개수 리턴
//				// insert - 삽입된 행의 개수  update - 수정된 행의 개수 delete - 삭제된 행의 개수 
//				int count = statement.executeUpdate(insertQuery);
//				out.println("삽입 결과 : " + count);
//				
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//			}
			
			
	}

}
