package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberDTO;


@WebServlet("/JoinCon")
public class JoinCon extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		MemberDTO member = new MemberDTO(id, pw, name);
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(member);
		
		if(cnt > 0) { 
			request.setAttribute("id", id);
			response.sendRedirect("login.html");
			
		}else {
			response.sendRedirect("join.jsp");
		}
	

}}
