package MovieStoreApp.CatalogService.Services;

import MovieStoreApp.CatalogService.Repos.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
}
