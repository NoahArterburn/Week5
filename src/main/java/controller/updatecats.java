package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.cat;

/**
 * Servlet implementation class updatecats
 */
@WebServlet("/updatecats")
public class updatecats extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatecats() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		catsHelper helper = new catsHelper();
		
		String oldName = request.getParameter("oldName");
		String Name = request.getParameter("Name");
		String breedName = request.getParameter("breedName");
		Double avgSize = Double.valueOf(request.getParameter("avgSize"));

		cat	catToUpdate = helper.searchcatByName(oldName);
		catToUpdate.setName(Name);
		catToUpdate.setbreedName(breedName);
		catToUpdate.setavgSize(avgSize);
		helper.update(catToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
