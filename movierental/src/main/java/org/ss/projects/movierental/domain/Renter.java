package org.ss.projects.movierental.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "renter")
public class Renter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String login;
	private String password;
	private String first_name;
	private String last_name;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private String area_code;
	private String country_code;
	private String phone;
	private String fax;
	private String email;

	public Renter() {
	}

	/**
	 * @param id
	 * @param login
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param address_line1
	 * @param address_line2
	 * @param city
	 * @param state
	 * @param area_code
	 * @param country_code
	 * @param phone
	 * @param fax
	 * @param email
	 */
	public Renter(long id, String login, String password, String first_name,
			String last_name, String address_line1, String address_line2,
			String city, String state, String area_code, String country_code,
			String phone, String fax, String email) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.area_code = area_code;
		this.country_code = country_code;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
	}

	/**
	 * @param login
	 * @param password
	 * @param first_name
	 * @param last_name
	 */
	public Renter(String login, String password, String first_name,
			String last_name) {
		super();
		this.login = login;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Renter [id=" + id + ", first_name=" + first_name
				+ ", last_name=" + last_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((last_name == null) ? 0 : last_name.hashCode());
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
		Renter other = (Renter) obj;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (id != other.id)
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		return true;
	}

}
