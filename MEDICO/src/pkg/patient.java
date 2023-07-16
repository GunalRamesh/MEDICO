package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Feedback
 */
public class patient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public patient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	  }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex[]");
		String Address = request.getParameter("Address");
		String occupation = request.getParameter("occupation");
		String phone = request.getParameter("phone");
		String ref = request.getParameter("ref");
		String history = request.getParameter("history");
		try{
			Connection con = (Connection) DatabaseConnect.connect();
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into patient values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, age);
			ps.setString(3, sex);
			ps.setString(4, Address);
			ps.setString(5, occupation);
			ps.setString(6, phone);
			ps.setString(7, ref);
			ps.setString(8, history);
			int i = ps.executeUpdate();
			
			if(i>0)
				
				
				out.println("<!DOCTYPE html>");  
			out.println("<html lang= 'en'>");
			out.println("<head>");
			out.println("<meta charset='UTF-8'>");
			out.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
			out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
			out.println("<meta name='description' content='Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/'>");

				 out.println("<!-- title -->");
			out.println("<title>About | KIT</title>");       

			out.println("<!-- favicon -->");
			out.println("<link rel='shortcut icon' type='image/png' href='assets/img/products/loggo.png'>");
			
			out.println("<link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,700' rel='stylesheet'>");
			out.println("<link href='https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap' rel='stylesheet'>");
			
			out.println("<link rel='stylesheet' href='assets/css/all.min.css'>");
out.println("<link rel='stylesheet' href='assets/bootstrap/css/bootstrap.min.css'>");

out.println("<link rel='stylesheet' href='assets/css/owl.carousel.css'>");

out.println("<link rel='stylesheet' href='assets/css/magnific-popup.css'>");
out.println("<link rel='stylesheet' href='assets/css/animate.css'>");

out.println("<link rel='stylesheet' href='assets/css/meanmenu.min.css'>");
out.println("<!-- main style -->");
out.println("<link rel='stylesheet' href='assets/css/main.css'>");
out.println("<!-- responsive -->");
out.println("<link rel='stylesheet' href='assets/css/responsive.css'>");

out.println("<link rel=\'stylesheet\' type=\'text/css\' href=\'login.css'>");

out.println("</head>");
out.println("<body>");

out.println("<!--PreLoader-->");
out.println(" <div class='loader'>");
out.println(" <div class='loader-inner'>");  
out.println("<div class='circle'></div>");     
out.println("</div>");
out.println("</div>");
out.println("<!--PreLoader Ends-->"); 

out.println("<!-- header -->");
out.println("<div class='top-header-area' id='sticker'>");
out.println("<div class='container'>");	
out.println("<div class='row'>");	
out.println("<div class='col-lg-12 col-sm-12 text-center'>");	
out.println("<div class='main-menu-wrap'>");	
out.println("<!-- logo -->");	
out.println("	<div class='site-logo'>");
out.println("<a href='index.html'>");	
out.println("<img src='assets/img/black.png' alt=''>");		
out.println("</a>");	
out.println("</div>");
out.println("<!-- logo -->");

out.println("<!-- menu start -->");
out.println("<nav class='main-menu'>");	
out.println("<ul>");	
out.println("<li class='current-list-item'><a href='index.html'>Home</a>");	
						
out.println("</li>");
out.println("<li><a href='about.html'>About</a>");
out.println("<ul class='sub-menu'>");
out.println("<li><a href='Library.html'>Library</a></li>");	
out.println("<li><a href='Hostel.html'>Hostel</a></li>");
out.println("<li><a href='Transport.html'>Transport</a></li>");
out.println("<li><a href='Sports.html'>Sports</a></li>");
out.println("</ul>");
out.println("</li>");
out.println("<li><a href='news.html'>Events</a>");
out.println("</li>");
out.println("<li><a href='contact.html'>News</a></li>");
out.println("<li><a href='shop.html'>Achievements</a>");
						
out.println("</li>");
out.println("<li><a href='shop.html'>Recruiters</a>");
						
out.println("</li>");
out.println("<li></li>");
out.println("</ul>");
out.println("</nav>");
out.println("<a class='mobile-show search-bar-icon' href='#'><i class='fas fa-search'></i></a>");
out.println("<div class='mobile-menu'></div>");
out.println("<!-- menu end -->");
out.println("</div>");
out.println("</div>");
out.println("</div>");
out.println("</div>");
out.println("</div> ");
out.println("<br> ");
out.println("<br> ");
out.println("<br> ");
out.println("<br> ");	
out.println("<br> ");
out.println("<br> ");
out.println("<br> ");
				
				
				
				out.print("<body background=''>");
				out.println("<center><h2 align=centere>Thank you "+name+", you have created an account.</h2><br></center>");
				out.print("<center><a href='studentlogin.html'>Back To Login Page</a></center><br><br></body>");
				
				
				out.println("<div class='footer-area'>");
				out.println("<div class='container'>");
				out.println("<div class='row'>");	
				out.println("<div class='col-lg-3 col-md-6'>");	
							out.println("<div class='footer-box about-widget'>");		
							out.println("<h2 class='widget-title'>About us</h2>");	
							out.println("	<p>We are a team of passionate people whose goal is to improve everyone's life through disruptive products. We build great products to solve your business problems.</p>");
							out.println("</div>");
							out.println("</div>");
							out.println("<div class='col-lg-3 col-md-6'>");
							out.println("<div class='footer-box get-in-touch'>");	
							out.println("<h2 class='widget-title'>Get in Touch</h2>");
							out.println("<ul>");
							out.println("<li> S.F.NO.247,248 L&T Bypass road, Bodipalayam,Coimbatore-32.</li>");
							out.println("<li>ADMISSIONS@KARPAGAMTECH.AC.IN</li>");
							out.println("<li>0422 3502440</li>");
							out.println("</ul>");	
							out.println("</div>");
							out.println("</div>");
							out.println("<div class='col-lg-3 col-md-6'>");
							out.println("<div class='footer-box pages'>");	
							out.println("<h2 class='widget-title'>Pages</h2>");
							out.println("<ul>");
							out.println("<li><a href='index.html'>Home</a></li>");	
							out.println("<li><a href='about.html'>About</a></li>");
							out.println("<li><a href='services.html'>Events</a></li>");
							out.println("<li><a href='news.html'>News</a></li>");
							out.println("<li><a href='contact.html'>Achievements</a></li>");
							out.println("<li><a href='contact.html'>Recruiters</a></li>");
							out.println("	</ul>");
							out.println("</div>");
							out.println("</div>");
							out.println("<div class='col-lg-3 col-md-6'>");
							out.println("<div class='footer-box subscribe'>");
							out.println("<h2 class='widget-title'>Subscribe</h2>");	
							out.println("<p>Subscribe to our mailing list to get the latest updates.</p>");
							out.println("<form action='index.html'>");
							out.println("<input type='email' placeholder='Email'>");
							out.println("<button type='submit'><i class='fas fa-paper-plane'></i></button>");
							out.println("</form>");
							out.println("</div>");
							out.println("</div>");
							out.println("</div>");
							out.println("</div>");
							out.println("</div>");
							

				
				
				out.println("<script src='assets/js/jquery-1.11.3.min.js'></script>");
				
				out.println("<script src='assets/bootstrap/js/bootstrap.min.js'></script>");
				
				out.println("<script src='assets/js/jquery.countdown.js'></script>");	
				
				out.println("<script src='assets/js/jquery.isotope-3.0.6.min.js'></script>");

				out.println("<script src='assets/js/waypoints.js'></script>");
				
				out.println("<script src='assets/js/owl.carousel.min.js'></script>");

				out.println("<script src='assets/js/jquery.magnific-popup.min.js'></script>");	
				
				out.println("<script src='assets/js/jquery.meanmenu.min.js'></script>");
				
				out.println("<script src='assets/js/sticker.js'></script>");	

				out.println("<script src='assets/js/main.js'></script>");

				out.println("</body>");
				out.println("</html>");
				
			}catch(Exception e2){
				System.out.println(e2);
			}
		out.close();
}
	}

