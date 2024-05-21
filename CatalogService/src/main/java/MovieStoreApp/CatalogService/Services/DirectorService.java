package MovieStoreApp.CatalogService.Services;

import MovieStoreApp.CatalogService.Repos.DirectorRepository;
import org.springframework.stereotype.Service;

@Service
public class DirectorService {
    private DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }
}
