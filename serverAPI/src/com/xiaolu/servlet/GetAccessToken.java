package com.xiaolu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.xiaolu.ThreadGetdata.TokenThread;

/**
 * ���ܣ���ȡ token
 * @author Boy Baby
 *
 */
@WebServlet("/GetAccessToken")
public class GetAccessToken extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException {
		new Thread(new TokenThread()).start(); //������ʱ��ȡaccess_token���߳�
	}
}
