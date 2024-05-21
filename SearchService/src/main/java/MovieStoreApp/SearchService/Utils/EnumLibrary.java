package MovieStoreApp.SearchService.Utils;

import java.util.Locale;

public class EnumLibrary {
    public enum SortType{
        FEATURED("featured"),
        MOST_VIEWED("most_viewed"),
        NEWEST("newest"),
        ALPHABETICAL("alphabetical"),
        REVERSED_ALPHABETICAL("reversed_alphabetical");

        private String value;

        SortType(String value) {
            this.value =value;
        }

        public String getValue() {
            return value;
        }

        public static SortType fromString(String text) {
            for (SortType s : SortType.values()) {
                if (s.getValue().equalsIgnoreCase(text)) {
                    return s;
                }
            }
            return null;
        }
    }
}
