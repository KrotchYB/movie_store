package MovieStoreApp.CatalogService.Services;

import MovieStoreApp.CatalogService.Repos.ActorRepository;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

    private ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }
}
