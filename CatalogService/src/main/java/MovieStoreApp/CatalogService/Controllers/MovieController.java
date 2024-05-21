package MovieStoreApp.CatalogService.Controllers;

import MovieStoreApp.CatalogService.Services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

//    @GetMapping
//    public Movie getAllMovies
}
