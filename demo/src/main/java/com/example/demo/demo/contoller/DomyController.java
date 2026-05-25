@RestController
public class DomyController {
    @GetMapping("/dumy")
    String hello(){
        return "hello";

    }
}

//this will return hello just data since we have RestController annotation it will directly return hello data not any template
