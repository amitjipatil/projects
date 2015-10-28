package in.hybridsoft.facebook.servlet;

import in.hybridsoft.facebook.dao.GetData;
import in.hybridsoft.facebook.model.Register;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

public class PaginationServlet extends HttpServlet {
	/**
	 * @author amit patil
	 *  
	 */
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;
	int index;
	int previus;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("vvvvvvvvvmml");

		index = Integer.parseInt(req.getParameter("pageindex"));

		System.out.println("*******pageIndex=" + index);
		if (index > 1) {
			previus = index - 1;
		}
		int next = index + 1;
		List<Register> list = GetData.selectData(index);

		req.setAttribute("listdata", list);
		req.setAttribute("previus", previus);
		req.setAttribute("next", next);
		rd = req.getRequestDispatcher("jsp/home.jsp");
		rd.forward(req, res);

	}
}
