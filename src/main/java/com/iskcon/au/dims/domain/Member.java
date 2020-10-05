package com.iskcon.au.dims.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Member {
	private Integer memberId;
	private String firstName;
	private String lastName;
	private String initiatedName;
	private String positionCode;
	private String statusCode;
	private LocalDate startDate;
	private LocalDate dob;
	private Integer gaurdianId1;
	private String gaurdialRelation1;
	private Integer gaurdianId2;
	private String gaurdialRelation2;
	private String gender;
	private LocalDate iskconAssociatedDate;
	private String primaryPhone;
	private String secondaryPhone;
	private String emailAddress;
	private LocalDate leftDate;
	private String leftReason;
	private Integer addressId;
	private String comment1;
	private String comment2;
	private Integer createdBy;
	private LocalDateTime creationDate;
	private Integer lastUpdatedBy;
	private LocalDateTime lastUpdateDate;

}
