package com.sofas.app.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpHandler implements CommonHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("signup_chk", false);
		return "/signUp.jsp";
	}

}
