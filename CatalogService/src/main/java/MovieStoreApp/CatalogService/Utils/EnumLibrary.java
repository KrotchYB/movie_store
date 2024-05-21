package MovieStoreApp.CatalogService.Utils;

public class EnumLibrary {
    public enum Genre{
        ADVENTURE("adventure"),
        FANTASY("fantasy"),
        HORROR("horror"),
        MYSTERY("mystery"),
        ROMANCE("romance"),
        ACTION("action"),
        COMEDY("comedy"),
        DRAMA("drama"),
        WESTERN("western"),
        THRILLER("thriller");


        String value;

        Genre(String value) {
            this.value =value;
        }
    }

    public enum Gender{
        MALE("male"),
        FEMALE("female"),
        ATTACK_HELICOPTER("attack_helicopter");

        String value;

        Gender(String value) {
            this.value =value;
        }
    }
}
