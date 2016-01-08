package springboot.security.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProfileController.class);

	@RequestMapping("/profile")
	public String profile(){
		LOGGER.debug("Get profile page");
		return "profile";
	}
}