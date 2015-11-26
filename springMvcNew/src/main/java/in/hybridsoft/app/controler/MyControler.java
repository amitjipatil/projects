package in.hybridsoft.app.controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyControler {
	
	@RequestMapping("/welcome")
	public ModelAndView printWelcome()
	{
		String message="hello amit....!";
		System.out.println("amit controler");
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("msg", message);
		return model;
		}
 
}
