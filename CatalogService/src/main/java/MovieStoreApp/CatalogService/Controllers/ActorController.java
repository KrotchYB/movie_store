package MovieStoreApp.CatalogService.Controllers;

import MovieStoreApp.CatalogService.Services.ActorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actors")
public class ActorController {

    private ActorService actorService;


    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }
}
