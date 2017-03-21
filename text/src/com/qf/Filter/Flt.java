package com.qf.Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qf.mod.LoginUser;

public class Flt implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
			HttpServletRequest req= (HttpServletRequest)arg0;
			HttpServletResponse rsp=(HttpServletResponse)arg1;
			PrintWriter out=rsp.getWriter();
			//rsp.setContentType("text/html;charset=UTF-8");
//			LoginUser user=(LoginUser)req.getSession().getAttribute("user");
			if(req.getSession().getAttribute("user")==null){
			
//				 String url="<script>window.parent.location.href='";  
//		         url+="login.jsp'</script>)";  
//		         out.println(url); 
				rsp.sendRedirect("login.jsp");
			}else{
				arg2.doFilter(arg0, arg1);
			}
			
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
