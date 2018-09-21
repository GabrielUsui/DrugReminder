package imd0412.drugreminder;

import java.util.List;

public class DrugReminderImpl implements IReminder {
	
	private String nameMedication;
	private String dosage;
	private DrugDate startTime;
	private Frequency frequency;
	private Integer duration;
	
	public DrugReminderImpl() {
		
	}
	
	public DrugReminderImpl(String nameMedication, String dosage, DrugDate startTime, Frequency frequency, Integer duration) {
		this.nameMedication = nameMedication;
		this.dosage = dosage;
		this.startTime = startTime;
		this.frequency = frequency;
		this.duration = duration;
	}
		
	public String getNameMedication() {
		return nameMedication;
	}

	public void setNameMedication(String nameMedication) {
		this.nameMedication = nameMedication;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public DrugDate getStartTime() {
		return startTime;
	}

	public void setStartTime(DrugDate startTime) {
		this.startTime = startTime;
	}

	public Frequency getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public List<String> createReminders(String startTime, Frequency frequency, Integer duration) 
	{
		throw new IllegalStateException("Method createReminders not yet implemented.");
			
	}

}
