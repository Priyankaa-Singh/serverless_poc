package test;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@Validated
public class User {

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Email is mandatory")
    private String email;

    //@JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")

    @NotNull(message = "Please provide a date.")
  //  @Pattern(regexp="^\\\\d{4}-[01]\\\\d-[0-3]\\\\d")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z'")
    private Timestamp createdDate;

    private ArrayList<UnPaidWorkTime> unpaidTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public ArrayList<UnPaidWorkTime> getUnpaidTime() {
        return unpaidTime;
    }

    public void setUnpaidTime(ArrayList<UnPaidWorkTime> unpaidTime) {
        this.unpaidTime = unpaidTime;
    }
}
