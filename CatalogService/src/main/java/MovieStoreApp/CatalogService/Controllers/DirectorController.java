package MovieStoreApp.CatalogService.Controllers;

import MovieStoreApp.CatalogService.Services.DirectorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/directors")
public class DirectorController {

    private DirectorService directorService;

    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }
}
