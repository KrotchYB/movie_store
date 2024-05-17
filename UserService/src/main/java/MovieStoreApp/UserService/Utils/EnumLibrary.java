package MovieStoreApp.UserService.Utils;

public class EnumLibrary {
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
