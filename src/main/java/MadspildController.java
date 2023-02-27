import org.springframework.web.bind.annotation.GetMapping;

public class MadspildController {
    @GetMapping("/")
    public String Madspild(){
        return "Madspild";
    }
}
