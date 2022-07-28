package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHour;
	private Integer hoours;
	
	public HourContract() {
	}

	public HourContract(Date date, Double valuePerHour, Integer hoours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hoours = hoours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHoours() {
		return hoours;
	}

	public void setHoours(Integer hoours) {
		this.hoours = hoours;
	}
	
	public double totalValue() {
		return valuePerHour * hoours;
	}
}