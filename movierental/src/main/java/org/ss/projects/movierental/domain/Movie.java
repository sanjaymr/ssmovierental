package org.ss.projects.movierental.domain;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String desc;

	@OneToOne
	@JoinColumn(name = "genre_id")
	private Genre genre;
	private Calendar release_date;

	public Movie() {
	}

	/**
	 * @param id
	 * @param name
	 * @param desc
	 * @param genre_id
	 * @param release_date
	 */
	public Movie(long id, String name, String desc, Genre genre,
			Calendar release_date) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.genre = genre;
		this.release_date = release_date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Calendar getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Calendar release_date) {
		this.release_date = release_date;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", desc=" + desc
				+ ", genre=" + genre + ", release_date=" + release_date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
