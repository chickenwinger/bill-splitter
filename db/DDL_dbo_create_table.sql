CREATE TABLE TESTDB.tbl_bill (
	id int IDENTITY(1,1) NOT NULL,
	title varchar(255) NULL,
	amount decimal(10,2) NULL,
	status varchar(9) DEFAULT 'UNSETTLED' NULL,
	updated_datetime datetime DEFAULT getdate() NULL,
	created_datetime datetime DEFAULT getdate() NULL,
	CONSTRAINT PK__tbl_bill__3213E83F73E7DE38 PRIMARY KEY (id)
);

CREATE TABLE TESTDB.tbl_user (
	id int IDENTITY(1,1) NOT NULL,
	username varchar(255) NULL,
	fullname varchar(255) NULL,
	updated_datetime datetime DEFAULT getdate() NULL,
	created_datetime datetime DEFAULT getdate() NULL,
	CONSTRAINT PK__tbl_user__3213E83FA77938CA PRIMARY KEY (id)
);

CREATE TABLE TESTDB.tbl_bill_to_user (
	bill_id int NOT NULL,
	user_id int NOT NULL,
	share_percent decimal(3,2) DEFAULT 0 NULL,
	amount_paid decimal(10,2) DEFAULT 0 NULL,
	status varchar(7) DEFAULT 'PENDING' NULL,
	updated_datetime datetime DEFAULT getdate() NULL,
	created_datetime datetime DEFAULT getdate() NULL,
	CONSTRAINT PK__tbl_bill__3C9D3EC3BBF1B849 PRIMARY KEY (bill_id,user_id),
	CONSTRAINT FK__tbl_bill___bill___6B24EA82 FOREIGN KEY (bill_id) REFERENCES TESTDB.tbl_bill(id),
	CONSTRAINT FK__tbl_bill___user___6C190EBB FOREIGN KEY (user_id) REFERENCES TESTDB.tbl_user(id)
);