package fr.sekaijin.osgi.web.module.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Manage extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private Logger log;

	public Manage() {
		log = LoggerFactory.getLogger(getClass());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.info("User - Manage - Servlet");
		resp.getWriter().println("User - Manage - Servlet");
	}
}
