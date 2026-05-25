@RestController
public class DomyController {
    @GetMapping("/dumy")
    String hello(){
        return "hello";

    }
}
