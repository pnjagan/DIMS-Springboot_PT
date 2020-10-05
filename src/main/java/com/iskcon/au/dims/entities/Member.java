package com.iskcon.au.dims.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "member")
@Data
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false)
    private Integer memberId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "initiated_name")
    private String initiatedName;

    @Column(name = "position_code", nullable = false)
    private String positionCode;

    @Column(name = "status_code", nullable = false)
    private String statusCode;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "dob", nullable = false)
    private LocalDate dob;

    @Column(name = "gaurdian_id_1")
    private Integer gaurdianId1;

    @Column(name = "gaurdial_relation_1")
    private String gaurdialRelation1;

    @Column(name = "gaurdian_id_2")
    private Integer gaurdianId2;

    @Column(name = "gaurdial_relation_2")
    private String gaurdialRelation2;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "iskcon_associated_date", nullable = false)
    private LocalDate iskconAssociatedDate;

    @Column(name = "primary_phone")
    private String primaryPhone;

    @Column(name = "secondary_phone")
    private String secondaryPhone;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "left_date")
    private LocalDate leftDate;

    @Column(name = "left_reason")
    private String leftReason;

    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "comment1")
    private String comment1;

    @Column(name = "comment2")
    private String comment2;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "last_updated_by")
    private Integer lastUpdatedBy;

    @Column(name = "last_update_date", nullable = false)
    private LocalDateTime lastUpdateDate;

}
