package com.neeraj.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("home")
	
	//public ModelAndView home(@RequestParam("name") String myName)/*HttpServletRequest req,HttpServletRequest res*/
	public ModelAndView home(Alien alien)
	{
		//HttpSession session = req.getSession();
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
		
		
		/*
		 * //String name = req.getParameter("name"); System.out.println("hi" + myName);
		 * session.setAttribute("name", myName); return "home";
		 */
		//System.out.println("hello");
	}

}
