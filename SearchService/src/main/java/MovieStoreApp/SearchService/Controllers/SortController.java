package MovieStoreApp.SearchService.Controllers;

import MovieStoreApp.SearchService.Services.SortService;
import MovieStoreApp.SearchService.Utils.EnumLibrary;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sort")
public class SortController {

    private SortService sortService;


    public SortController(SortService sortService) {
        this.sortService = sortService;
    }
    @GetMapping
    public List<Long> getSortedResult(@RequestParam String sortType){

        return sortService.getSortedResultWithParam(sortType);
    }

}
