package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

	private String username;
	private Date moment;
	
	// Construtor com argumentos
	public LogEntry(String username, Date moment) {
		this.username = username;
		this.moment = moment;
	}

	// Getters e Setters
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}

	// Método hashCode
	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	 // Método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(username, other.username);
	}
}
