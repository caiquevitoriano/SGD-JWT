package exemplo.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //Mapeando a URL /users

    @RequestMapping("/users")
    @ResponseBody
    public String getUsers() {

        //Retornando um JSON simples quando ela for acessada.
        return "{\"users\":[{\"name\":\"Caique\", \"country\":\"Brasil\"}," +
                "{\"name\":\"Alexa\",\"country\":\"Japão\"}]}";
    }

}
