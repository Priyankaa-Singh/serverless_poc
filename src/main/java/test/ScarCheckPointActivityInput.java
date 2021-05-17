package test;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonFormat;

@Validated
public class ScarCheckPointActivityInput implements Serializable {

	private static final long serialVersionUID = 8364127478548873551L;

	@NotEmpty(message="Employee Id cannot be null or empty")
	@NotNull
	private String employeeId;

	private String specialProcessingCode;

	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	//@Pattern(regexp ="^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$")
    @NotNull(message = "Please provide a date.")
	private Date timecardDate;

	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z’")
	@NotNull(message = "Please provide a punchInTimestamp.")
	private Date punchInTimestamp;

	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z’")
	@NotNull(message = "Please provide a punchOutTimestamp.")
	private Date punchOutTimestamp;

	@NotEmpty(message="BuildingMnemonic cannot be null or empty")
	@NotNull
	private String buildingMnemonic;

	private ArrayList<UnPaidWorkTime> unpaidTime;
	
	@NotEmpty(message="ApplicationMnemonic cannot be null or empty")	
	@NotNull
	private String applicationMnemonic;
	
	public ScarCheckPointActivityInput() {
	}

	public ScarCheckPointActivityInput(String employeeId, String specialProcessingCode, Date timecardDate,
			Timestamp punchInTimestamp, Timestamp punchOutTimestamp, String buildingMnemonic, String applicationMnemonic) {		
		this.employeeId = employeeId;
		this.specialProcessingCode = specialProcessingCode;
		this.timecardDate = timecardDate;
		this.punchInTimestamp = punchInTimestamp;
		this.punchOutTimestamp = punchOutTimestamp;
		this.buildingMnemonic = buildingMnemonic;
		this.applicationMnemonic = applicationMnemonic;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getSpecialProcessingCode() {
		return specialProcessingCode;
	}

	public void setSpecialProcessingCode(String specialProcessingCode) {
		this.specialProcessingCode = specialProcessingCode;
	}

	public String getBuildingMnemonic() {
		return buildingMnemonic;
	}

	public void setBuildingMnemonic(String buildingMnemonic) {
		this.buildingMnemonic = buildingMnemonic;
	}

	public String getApplicationMnemonic() {
		return applicationMnemonic;
	}

	public void setApplicationMnemonic(String applicationMnemonic) {
		this.applicationMnemonic = applicationMnemonic;
	}

	

	public Date getPunchInTimestamp() {
		return punchInTimestamp;
	}

	public void setPunchInTimestamp(Date punchInTimestamp) {
		this.punchInTimestamp = punchInTimestamp;
	}

	public Date getPunchOutTimestamp() {
		return punchOutTimestamp;
	}

	public void setPunchOutTimestamp(Date punchOutTimestamp) {
		this.punchOutTimestamp = punchOutTimestamp;
	}

	public ArrayList<UnPaidWorkTime> getUnpaidTime() {
		return unpaidTime;
	}

	public void setUnpaidTime(ArrayList<UnPaidWorkTime> unpaidTime) {
		this.unpaidTime = unpaidTime;
	}

	public Date getTimecardDate() {
		return timecardDate;
	}

	public void setTimecardDate(Date timecardDate) {
		this.timecardDate = timecardDate;
	}

	

	
}
