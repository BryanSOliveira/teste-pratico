package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ConteinerDao;
import model.ConteinerJavaBeans;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = {"/Controller", "/main-conteiner", "/insert-conteiner", "/select-conteiner"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ConteinerDao conteiner = new ConteinerDao();
	ConteinerJavaBeans conteinerJavaBeans = new ConteinerJavaBeans();

    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		if(action.equals("/main-conteiner")) {
			conteineres(request, response);
		} else if(action.equals("/insert-conteiner")) {
			novoConteiner(request, response);
		} else if(action.equals("/select-conteiner")) {
			listarConteiner(request, response);
		}
	}
	
	protected void conteineres(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ConteinerJavaBeans> lista = conteiner.listarConteineres();
		request.setAttribute("conteineres", lista);
		RequestDispatcher rd = request.getRequestDispatcher("viewconteiner.jsp");
		rd.forward(request, response);
	}
	
	protected void novoConteiner(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		conteinerJavaBeans.setNome_cliente(request.getParameter("nome_cliente"));
		conteinerJavaBeans.setNumero_conteiner(request.getParameter("numero_conteiner"));
		conteinerJavaBeans.setTipo_conteiner(request.getParameter("tipo_conteiner"));
		conteinerJavaBeans.setStatus_conteiner(request.getParameter("status_conteiner"));
		conteinerJavaBeans.setCategoria_conteiner(request.getParameter("categoria_conteiner"));
		
		conteiner.inserirConteiner(conteinerJavaBeans);
		response.sendRedirect("main-conteiner");
	}
	
	protected void listarConteiner(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_conteiner = Integer.parseInt(request.getParameter("id_conteiner"));
		conteinerJavaBeans.setId_conteiner(id_conteiner);
		
		request.setAttribute("id_conteiner", conteinerJavaBeans.getId_conteiner());
		request.setAttribute("nome_cliente", conteinerJavaBeans.getNome_cliente());
		request.setAttribute("numero_conteiner", conteinerJavaBeans.getNumero_conteiner());
		request.setAttribute("tipo_conteiner", conteinerJavaBeans.getTipo_conteiner());
		request.setAttribute("status_conteiner", conteinerJavaBeans.getStatus_conteiner());
		request.setAttribute("categoria_conteiner", conteinerJavaBeans.getCategoria_conteiner());
		
		RequestDispatcher rd = request.getRequestDispatcher("editconteiner.jsp");
		rd.forward(request, response);
	}

}
