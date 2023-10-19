package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.cat;

/**
 * Servlet implementation class showCats
 */
@WebServlet("/showCats")
public class showCats extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public showCats() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		catsHelper helper = new catsHelper();

		List<cat> catsList = helper.showAllcats();

		request.setAttribute("allcats", catsList);

		String path = "/Show.jsp";

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
