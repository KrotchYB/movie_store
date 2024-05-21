package MovieStoreApp.CatalogService.Repos;

import MovieStoreApp.CatalogService.Entities.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository  extends JpaRepository<Director, Long> {
}
