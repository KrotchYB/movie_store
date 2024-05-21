package MovieStoreApp.SearchService.Controllers;

import MovieStoreApp.SearchService.Services.SearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/search")
public class SearchController {
    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping
    public Optional<List<Long>> getAllSearchResults(@RequestParam String movieName){
        return searchService.getAllSearchResultsWithParam(movieName);
    }
}
