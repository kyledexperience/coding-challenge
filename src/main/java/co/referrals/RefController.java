package co.referrals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RefController {

	@Autowired
	private LinksDao dao;

	@RequestMapping("/")
	public ModelAndView home() {

		ModelAndView mav = new ModelAndView("kyle-links");

		mav.addObject("list", dao.findAll());

		return mav;

	}

	@PostMapping("/")
	public ModelAndView homed(@RequestParam("link") String link) {

		Link x = new Link(link, 1);
		dao.create(x);

		return new ModelAndView("redirect:/");

	}

}
