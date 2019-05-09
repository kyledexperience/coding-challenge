package co.referrals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable(value = "id", required = false) Long id) {

		dao.delete(id);
		return new ModelAndView("redirect:/");

	}

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable(value = "id", required = false) Long id) {

		ModelAndView mav = new ModelAndView("edit");
		mav.addObject("link", dao.findById(id));
		return mav;

	}

	@PostMapping("/edit/{id}")
	public ModelAndView editor(@PathVariable(value = "id", required = false) Long id,
			@RequestParam("title") String title) {

		Link link = dao.findById(id);
		link.setTitle(title);
		dao.update(link);
		return new ModelAndView("redirect:/");

	}

}
