package com.pankiba.onetooneforeignkeyasso.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = { "employee" })
@NoArgsConstructor
@Entity
public class EmployeeDetails implements Serializable {

	private static final long serialVersionUID = -8132793126873784036L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeDetailsId;

	private String location;

	/**
	 *
	 * @JoinColumn defines foreign key column and indicates the owner of the relationship.
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true, name = "EMPLOYEE_ID")
	@JsonIgnore
	private Employee employee;

	public EmployeeDetails(String location) {
		this.location = location;
	}

}
