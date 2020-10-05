--create database dims;

use dims;

/*
drop table member;
drop table address;
drop table common_lookups;
drop table program;
drop table program_member_assoc;
*/


CREATE TABLE member(
	member_id 		INT PRIMARY KEY AUTO_INCREMENT,
	first_name 		VARCHAR(200) NOT NULL,
	last_name 		VARCHAR(200),
	initiated_name 	VARCHAR(200),
	position_code 		VARCHAR(100) NOT NULL, -- Keeping it more flexible
	status_code		    VARCHAR(20)  NOT NULL,  -- Keeping it more flexible
	start_date 		DATE ,                 -- Start date can be NULL when we have to capture for data parents not devotees
	dob				DATE NOT NULL,         -- Minor or adult can be computed to display
	gaurdian_id_1   INT,
	gaurdial_relation_1     VARCHAR(100),
	gaurdian_id_2   	    INT,
	gaurdial_relation_2     VARCHAR(100),
	gender 		            VARCHAR(1) NOT NULL, -- M Male , F - Female , O - Others , N -  not disclosed
	iskcon_associated_date  DATE NOT NULL,
	primary_phone   		VARCHAR(20),
	secondary_phone         VARCHAR(20),
	email_address           VARCHAR(50),
	---------------------------------------
	left_date 		DATE,
	left_reason 	VARCHAR(50),
	-------------------------------
	address_id      INT,
	------------------------------
	comment1 		VARCHAR(50),
	comment2 		VARCHAR(50),
	---Audit column
	created_by      INT, --User Id
	creation_date  TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ,
	last_updated_by INT,
	last_update_date   TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

---------------------------------------------------------------------

create TABLE address (
	address_id INT 		 PRIMARY KEY  AUTO_INCREMENT,
	address_line_1       VARCHAR(100),
	address_line_2       VARCHAR(100),
	suburb          	 VARCHAR(50),
	zip                  VARCHAR(50) NOT NULL,
	state                VARCHAR(20),
	country              VARCHAR(50),
	comments             VARCHAR(500),
	----
    created_by      INT, --User Id
    creation_date    TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ,
    last_updated_by INT,
    last_update_date  TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


create TABLE common_lookups (
	lookup_id INT  PRIMARY KEY  AUTO_INCREMENT,
	lookup_type    VARCHAR(100),
	lookup_code    VARCHAR(100),
	lookup_value    VARCHAR(100),
	--Audit columns
    created_by          INT, --User Id
    creation_date        TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ,
    last_updated_by     INT,
    last_update_date   TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


create TABLE program (
	program_id         	INT PRIMARY KEY AUTO_INCREMENT,
	program_name 	   	VARCHAR(100) NOT NULL,
	program_category    VARCHAR(100) NOT NULL, -- Kids, Intro , adults-bg , adults-online etc...
	start_date          DATE,
	end_date            DATE,
	guru_1_id             INT, -- member ID of guru 
	guru_2_id             INT, -- member ID of guru   
	program_address_id 	INT,
	social_group_ref1   VARCHAR(100),
	social_group_ref2   VARCHAR(100),
	class_progress_num  INT,
	notes1            	VARCHAR(500),
	notes2            	VARCHAR(500),
	notes3            	VARCHAR(500),
	notes4            	VARCHAR(500),
	notes5            	VARCHAR(500),
	--Audit columns
    created_by          INT, --User Id
    creation_date        TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ,
    last_updated_by     INT,
    last_update_date    TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

create table program_member_assoc (
    assoc_id    INT PRIMARY KEY AUTO_INCREMENT,
    member_id  INT,
    program_id INT,
    join_date  DATE,
    discontinue_date DATE,
    status     DATE,
    comments   VARCHAR(500),
    --Audit columns
    created_by          INT, --User Id
    creation_date       TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ,
    last_updated_by     INT,
    last_update_date    TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
-------------------------------------------------------------------



------------------------------------------------------------
insert into member  (
	first_name
	,last_name
	,position_code
	,status_code
	,start_date
	,dob
	,gender
	,iskcon_associated_date
) values (
    'Hare'
    ,'Krishna'
    ,'N'
    ,'A'
    ,'2020-01-01'
    ,'1982-01-01'
    ,'M'
    ,'2020-02-01'
);

/*
--------------------------------------------------
-- Address need not be repeated for every family member
-- So better to keep addr reference in the user
-- Assumption that every user has 1 address is much fairer
---------------------------------
CREATE TABLE contact_details(
    contact_id      INT AUTO_INCREMENT PRIMARY KEY,
	member_id       VARCHAR(20) ,
	mobile_no       VARCHAR(13) NOT NULL,
    whatsapp_no     VARCHAR(13) NOT NULL,
    email_address   VARCHAR(100) NOT NULL,
    address_1       VARCHAR(100),
    address_2       VARCHAR(100),
    suburb          VARCHAR(50) NOT NULL,
    state           VARCHAR(20),
    country         VARCHAR(50),
    comment         VARCHAR(500),
    FOREIGN KEY (member_id) REFERENCES member(member_id)
)
--------------------------------------------
*/