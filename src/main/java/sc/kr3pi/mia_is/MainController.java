@Controller

public class MainController{

   @GetMapping("/")
   public String homePage(){
        return "index";
        }
}
