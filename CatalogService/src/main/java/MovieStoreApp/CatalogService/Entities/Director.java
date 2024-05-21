package MovieStoreApp.CatalogService.Entities;

import MovieStoreApp.CatalogService.Utils.EnumLibrary;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "director")
@Data
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String firstName;
    String middleName;
    @Column(nullable = false)
    String lastName;
    LocalDateTime birthDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    EnumLibrary.Gender gender;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "movie_director_mapping", joinColumns = @JoinColumn(name = "director_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private Set<Movie> movies;
}
