package com.iskcon.au.dims.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "address")
@Data
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id", nullable = false)
    private Integer addressId;

    @Column(name = "address_line_1")
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    @Column(name = "suburb")
    private String suburb;

    @Column(name = "zip", nullable = false)
    private String zip;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

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
