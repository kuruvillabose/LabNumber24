package com.grandCircus.springCoffeShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {
	
	@Autowired
	CoffeeJdbcDao dao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println(dao.findAllItems());
		return new ModelAndView("index","test",dao.findAllItems());
	}
	
	@RequestMapping("/register-user")
	public ModelAndView showUserForm() {
		return new ModelAndView("user-form");
	}
	
	@RequestMapping("/submit-user-registration")
	public ModelAndView submitUserForm(
			@RequestParam("firstname") String f,
			@RequestParam("lastname") String l,
			@RequestParam("email") String e,
			@RequestParam("phonenumber") int p,
			@RequestParam("password") String pw){
		
		// construct a user from the URL params
		User user = new User();
		user.setFirstname(f);
		user.setLastname(l);
		user.setPassword(pw);
		
		ModelAndView mav = new ModelAndView("user-confirmation");
		// send the whole user object to the JSP.
		mav.addObject("user", user);
		dao.addUser(f, l, e, p, pw);
		return mav;
		
	}
}
