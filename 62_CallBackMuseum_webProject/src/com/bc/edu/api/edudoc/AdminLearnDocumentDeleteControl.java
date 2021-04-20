package com.bc.edu.api.edudoc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.edu.model.dao.EduLearnDocDAO;

@WebServlet("/docdelete")
public class AdminLearnDocumentDeleteControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		int res = 1;new EduLearnDocDAO().docDelete(request.getParameterValues("eduleancheck"));
		PrintWriter out = response.getWriter();
		if(res > 0) {
			out.write("true");
		} else {
			out.write("false");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
