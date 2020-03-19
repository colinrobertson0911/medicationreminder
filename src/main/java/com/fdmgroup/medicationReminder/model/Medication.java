package com.fdmgroup.medicationReminder.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Medication {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medication_gen")
	@SequenceGenerator(name = "medication_gen", sequenceName = "MEDICATION_SEQ", allocationSize = 1)
	private long id;

	@Column
	private String name;

	@Column
	private String dosage;

	@Column
	private String condition;

	@Column
	private int timesAWeek;

	@Column
	private int timesADay;

	@Column
	private LocalTime timeToTake;

	@Column
	private int quantity;

	@Column
	private int pillsLeft;

	@Column
	private boolean refill;

	public Medication(String name, String dosage, String condition, int timesAWeek, int timesADay, LocalTime timeToTake,
			int quantity, int pillsLeft, boolean refill) {
		super();
		this.name = name;
		this.dosage = dosage;
		this.condition = condition;
		this.timesAWeek = timesAWeek;
		this.timesADay = timesADay;
		this.timeToTake = timeToTake;
		this.quantity = quantity;
		this.pillsLeft = pillsLeft;
		this.refill = refill;
	}

	public Medication() {
		super();
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

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getTimesAWeek() {
		return timesAWeek;
	}

	public void setTimesAWeek(int timesAWeek) {
		this.timesAWeek = timesAWeek;
	}

	public int getTimesADay() {
		return timesADay;
	}

	public void setTimesADay(int timesADay) {
		this.timesADay = timesADay;
	}

	public LocalTime getTimeToTake() {
		return timeToTake;
	}

	public void setTimeToTake(LocalTime timeToTake) {
		this.timeToTake = timeToTake;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPillsLeft() {
		return pillsLeft;
	}

	public void setPillsLeft(int pillsLeft) {
		this.pillsLeft = pillsLeft;
	}

	public boolean isRefill() {
		return refill;
	}

	public void setRefill(boolean refill) {
		this.refill = refill;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((condition == null) ? 0 : condition.hashCode());
		result = prime * result + ((dosage == null) ? 0 : dosage.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pillsLeft;
		result = prime * result + quantity;
		result = prime * result + (refill ? 1231 : 1237);
		result = prime * result + ((timeToTake == null) ? 0 : timeToTake.hashCode());
		result = prime * result + timesADay;
		result = prime * result + timesAWeek;
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
		Medication other = (Medication) obj;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (dosage == null) {
			if (other.dosage != null)
				return false;
		} else if (!dosage.equals(other.dosage))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pillsLeft != other.pillsLeft)
			return false;
		if (quantity != other.quantity)
			return false;
		if (refill != other.refill)
			return false;
		if (timeToTake == null) {
			if (other.timeToTake != null)
				return false;
		} else if (!timeToTake.equals(other.timeToTake))
			return false;
		if (timesADay != other.timesADay)
			return false;
		if (timesAWeek != other.timesAWeek)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medication [id=" + id + ", name=" + name + ", dosage=" + dosage + ", condition=" + condition
				+ ", timesAWeek=" + timesAWeek + ", timesADay=" + timesADay + ", timeToTake=" + timeToTake
				+ ", quantity=" + quantity + ", pillsLeft=" + pillsLeft + ", refill=" + refill + "]";
	}

}
