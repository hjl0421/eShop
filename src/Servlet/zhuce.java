package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class zhuce extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  String user;
          String pass;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("δ�ɹ�");
			e.printStackTrace();
		}

		try {

		  user=request.getParameter("user");
			pass=request.getParameter("pass");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/eshopdb","root","admin");
			System.out.println("");
			 Statement sta=(Statement) con.createStatement();
			int n=sta.executeUpdate("insert studentdb values('"+user+"','"+pass+"')");
			System.out.println("ע��ɹ�");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ע��δ�ɹ������и��û���");
			e.printStackTrace();
		}

	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
             String user;
             String pass;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("δ�ɹ�");
			e.printStackTrace();
		}

		try {

		    user=request.getParameter("user");
			pass=request.getParameter("pass");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/eshopdb","root","h");
			System.out.println("");
			 Statement sta=(Statement) con.createStatement();
			int n=sta.executeUpdate("insert new_table values('"+user+"','"+pass+"')");
			System.out.println("ע��ɹ�");
		
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ע��δ�ɹ������и��û���");
			e.printStackTrace();
		}

		System.out.println("ע��ɹ�");

	}

}
