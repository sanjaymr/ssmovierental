package org.ss.projects.movierental.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.ss.projects.movierental.domain.Genre;
import org.ss.projects.movierental.domain.Movie;
import org.ss.projects.movierental.service.impl.InMemoryDAO;

public class MovieDAOTest {

	private GenericDAO<Movie, Long> movieDAO = new InMemoryDAO<>();

	@Before
	public void Setup() {
		Genre genre = new Genre(1l, "Action");
		for (int i = 0; i < 5; i++) {
			Movie movie = new Movie(i, "Movie " + i,
					"This is the description of movie " + i, genre,
					new GregorianCalendar(2013, 1, 15));
			movieDAO.add(movie);
		}
	}

	@Test
	public final void testAdd() {
		int oldSize = movieDAO.list().size();
		Genre genre = new Genre(2L, "Comedy");
		Movie movie = new Movie(6, "Movie 6", "Description of movie 6", genre,
				new GregorianCalendar(2012, 1, 31));
		movieDAO.add(movie);
		int newSize = movieDAO.list().size();

		assertTrue(newSize == oldSize + 1);
	}

	@Test
	public final void testUpdate() {

	}

	@Test
	public final void testRemove() {
		int oldSize = movieDAO.list().size();
		Movie m = movieDAO.find(1L);
		movieDAO.remove(m);
		int newSize = movieDAO.list().size();

		assertFalse(oldSize == newSize);
	}

	@Test
	public final void testList() {
		List<Movie> list = movieDAO.list();
		assertNotNull(list);
		assertFalse(list.isEmpty());
	}

	@Test
	public final void testFind() {

	}

}
