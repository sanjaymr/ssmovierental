package org.ss.projects.movierental.service;

import java.util.List;

import org.ss.projects.movierental.domain.Movie;

public interface RentalService {

	/**
	 * List all movies ever rented by a Renter
	 * 
	 * @param person
	 *            Renter id
	 * @return List of movies even rented by the person. null if invalid id.
	 */
	List<Movie> moviesByRenter(long person);

}
