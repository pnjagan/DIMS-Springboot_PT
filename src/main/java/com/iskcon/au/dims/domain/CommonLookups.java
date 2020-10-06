package com.iskcon.au.dims.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class CommonLookups {
    private Integer lookupId;
    private String lookupType;
    private String lookupCode;
    private String lookupValue;
    private Integer createdBy;
    private LocalDateTime creationDate;
    private Integer lastUpdatedBy;
    private LocalDateTime lastUpdateDate;
}
