package MovieStoreApp.CatalogService.Repos;

import MovieStoreApp.CatalogService.Entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository  extends JpaRepository<Actor, Long> {
}
