package org.me.teamService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
	@Id
	@GeneratedValue
	private long id;

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;
	
	@JsonProperty("ticketCount")
	private int ticketCount;
	
	public User() {}
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ticketCount = 0;
	}	
}