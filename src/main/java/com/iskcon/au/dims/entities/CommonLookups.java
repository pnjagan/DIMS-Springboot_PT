package com.iskcon.au.dims.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "common_lookups")
@Data
public class CommonLookups implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lookup_id", nullable = false)
    private Integer lookupId;

    @Column(name = "lookup_type")
    private String lookupType;

    @Column(name = "lookup_code")
    private String lookupCode;

    @Column(name = "lookup_value")
    private String lookupValue;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "last_updated_by")
    private Integer lastUpdatedBy;

    @Column(name = "last_update_date")
    private LocalDateTime lastUpdateDate;

}
