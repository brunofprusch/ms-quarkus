package br.com.ms.quarkus.service;

import br.com.ms.quarkus.model.Movie;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class MovieService {

    public List<Movie> findAll() {
        return Arrays.asList(
                new Movie("The Avengers","Action",2012),
                new Movie("Avengers: Age Of Ultron","Action",2015),
                new Movie("Avengers: Infinity War","Action",2018),
                new Movie("Avengers: Endgame","Action",2019)
        );
    }
}
