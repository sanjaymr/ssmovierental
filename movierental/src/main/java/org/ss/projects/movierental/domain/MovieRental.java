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
@Table(name = "movie_renter")
public class MovieRental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@OneToOne
	@JoinColumn(name = "renter_id")
	private Renter renter;
	private Calendar checkin_date;
	private Calendar checkout_date;

	public MovieRental() {

	}

	public Calendar getCheckin_date() {
		return checkin_date;
	}

	public void setCheckin_date(Calendar checkin_date) {
		this.checkin_date = checkin_date;
	}

	public Calendar getCheckout_date() {
		return checkout_date;
	}

	public void setCheckout_date(Calendar checkout_date) {
		this.checkout_date = checkout_date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Renter getRenter() {
		return renter;
	}

	public void setRenter(Renter renter) {
		this.renter = renter;
	}

	@Override
	public String toString() {
		return "MovieRental [id=" + id + ", movie=" + movie + ", renter="
				+ renter + ", checkin_date=" + checkin_date
				+ ", checkout_date=" + checkout_date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + ((renter == null) ? 0 : renter.hashCode());
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
		MovieRental other = (MovieRental) obj;
		if (id != other.id)
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (renter == null) {
			if (other.renter != null)
				return false;
		} else if (!renter.equals(other.renter))
			return false;
		return true;
	}

}
