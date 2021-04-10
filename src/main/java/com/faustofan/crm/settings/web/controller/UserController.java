package com.faustofan.crm.settings.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: fausto
 * @date: 2021/4/10 18:24
 * @description:
 */
public class UserController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path= request.getServletPath();
		
		if("/settings/user/login.do".equals(path)){
		
		}
	
	}
}
