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
@Table(name = "movie")
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String title;

    LocalDateTime releaseDate;
    @Column(nullable = false)
    Long totalViews;
    @Column(nullable = false)
    Integer imdbScore;


    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "movie_actor_mapping", joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private Set<Actor> actors;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "movie_director_mapping", joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id"))
    private Set<Actor> directors;


//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "actor_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    List<Actor> actors;
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "director_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    List<Director> directors;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    EnumLibrary.Genre genre;

    @Lob
    @Column(name = "imagedata", length = 1000)
    private byte[] imageData;
}
