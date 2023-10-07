package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListItem;

/**
 * Servlet implementation class EditItemServlet
 */
@WebServlet("/editSnackServlet")
public class EditSnackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditSnackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		ListItemHelper dao = new ListItemHelper();
		
		String snack = request.getParameter("snack");
		String price = request.getParameter("price");
		Integer tempid = Integer.parseInt(request.getParameter("id"));
		
		ListItem snackToUpdate = dao.searchSnackById(tempid);
		snackToUpdate.setPrice(price);
		snackToUpdate.setSnack(snack);
		
		dao.updateSnack(snackToUpdate);
		
		getServletContext().getRequestDispatcher("/viewAllSnacksServlet").forward(request, response);
	}

}
