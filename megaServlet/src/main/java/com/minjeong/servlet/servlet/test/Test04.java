package com.minjeong.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test04")
public class Test04 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html> <head> <title> 리스트 출력 </title> </head> <body> <ul>");
		
		for (int i = 0; i < 30; i++) {			
			out.println("<li> " + (i + 1) + "번째 리스트" + "</li>");
		}
		
		out.println("</ul> </body> </html>");
	}
	
}
