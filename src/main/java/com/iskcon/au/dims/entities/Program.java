package com.iskcon.au.dims.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "program")
@Entity
@Data
public class Program implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_id", nullable = false)
    private Integer programId;

    @Column(name = "program_name", nullable = false)
    private String programName;

    @Column(name = "program_category", nullable = false)
    private String programCategory;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "guru_1_id")
    private Integer guru1Id;

    @Column(name = "guru_2_id")
    private Integer guru2Id;

    @Column(name = "program_address_id")
    private Integer programAddressId;

    @Column(name = "social_group_ref1")
    private String socialGroupRef1;

    @Column(name = "social_group_ref2")
    private String socialGroupRef2;

    @Column(name = "class_progress_num")
    private Integer classProgressNum;

    @Column(name = "notes1")
    private String notes1;

    @Column(name = "notes2")
    private String notes2;

    @Column(name = "notes3")
    private String notes3;

    @Column(name = "notes4")
    private String notes4;

    @Column(name = "notes5")
    private String notes5;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "last_updated_by")
    private Integer lastUpdatedBy;

    @Column(name = "last_update_date", nullable = false)
    private LocalDateTime lastUpdateDate;

}
