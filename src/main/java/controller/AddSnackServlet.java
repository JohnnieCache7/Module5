package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListItem;

/**
 * Servlet implementation class AddItemServlet
 */
@WebServlet("/addSnackServlet")
public class AddSnackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddSnackServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String snack = request.getParameter("snack");
		String price = request.getParameter("price");

		ListItem li = new ListItem(snack, price);
		ListItemHelper dao = new ListItemHelper();
		dao.insertSnack(li);
		
		

		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
