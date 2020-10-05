package com.iskcon.au.dims.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "program_member_assoc")
@Data
public class ProgramMemberAssoc implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assoc_id", nullable = false)
    private Integer assocId;

    @Column(name = "member_id")
    private Integer memberId;

    @Column(name = "program_id")
    private Integer programId;

    @Column(name = "join_date")
    private LocalDate joinDate;

    @Column(name = "discontinue_date")
    private LocalDate discontinueDate;

    @Column(name = "status")
    private LocalDate status;

    @Column(name = "comments")
    private String comments;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "last_updated_by")
    private Integer lastUpdatedBy;

    @Column(name = "last_update_date", nullable = false)
    private LocalDateTime lastUpdateDate;

}
