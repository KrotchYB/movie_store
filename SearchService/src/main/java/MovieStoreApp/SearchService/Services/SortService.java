package MovieStoreApp.SearchService.Services;

import MovieStoreApp.SearchService.Utils.EnumLibrary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SortService {
    public List<Long> getSortedResultWithParam(String movieName) {

        switch (EnumLibrary.SortType.fromString(movieName)){
            case FEATURED:
                System.out.println("1");
                break;
            case MOST_VIEWED:
                System.out.println("2");
                break;
            case NEWEST:
                System.out.println("3");
                break;
            case ALPHABETICAL:
                System.out.println("4");
                break;
            case REVERSED_ALPHABETICAL:
                System.out.println("5");
                break;
            default:
                break;
        }

        return null;

    }
}
