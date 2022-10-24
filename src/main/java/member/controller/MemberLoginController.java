package member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberLoginController {

	private final String command = "/login.mem";
	//	private final String logout = "/logout.mem";
	private final String getPage = "/login";
	//	private final String gotoPage = "redirect:/main.main";


	@RequestMapping(command)
	public String login() {
		return getPage;
	}



}
