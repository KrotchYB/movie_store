package MovieStoreApp.CatalogService.Repos;

import MovieStoreApp.CatalogService.Entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository  extends JpaRepository<Movie, Long> {
}
