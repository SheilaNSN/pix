package matera.bootcamp.pix.rest.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusApiController {

    @GetMapping("/api/v1/status")
<<<<<<< HEAD
<<<<<<< HEAD

    public String statusCheck(){
        return "up";
    }
}
=======
=======
>>>>>>> feature/api-conta-corrente
//    @RequestMapping(value = "/api/v1/status", method = RequestMethod.GET)
    public String statusCheck() {
        return "up";
    }

<<<<<<< HEAD
}
>>>>>>> feature/api-conta-corrente
=======
}
>>>>>>> feature/api-conta-corrente
