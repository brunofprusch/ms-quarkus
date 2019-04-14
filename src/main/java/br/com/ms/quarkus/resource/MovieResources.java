package br.com.ms.quarkus.resource;

import br.com.ms.quarkus.model.Movie;
import br.com.ms.quarkus.service.MovieService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/movie")
public class MovieResources {

    @Inject
    MovieService movieService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> movies () {
        return movieService.findAll();
    }
}