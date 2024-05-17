package MovieStoreApp.UserService.Entities;

import MovieStoreApp.UserService.Utils.EnumLibrary;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String userName;
    @Column(nullable = false)
    String password;
    @Column(nullable = false)
    String firstName;
    String middleName;
    @Column(nullable = false)
    String lastName;
    LocalDateTime birthDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    EnumLibrary.Gender gender;

}
