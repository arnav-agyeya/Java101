# Java101
Sapient
create table Customers (
 customer_id varchar(20) primary key,
 customer_name VARCHAR2(15) NOT NULL,
 customer_age NUMBER ,
 customer_sex CHAR(6),
 customer_number NUMBER(10),
 customer_emailid   varchar2(20),
 customer_password varchar2(10)
);

create table Rooms (
 Rooms_id varchar(20) primary key,
 rooms_location VARCHAR2(4) NOT NULL,
 rooms_type char(3) ,
 rooms_status number(1),
 rooms_price number(8)
);


create table booking (
 Booking_id number(10) primary key,
 rooms_id VARCHAR2(20) references rooms (rooms_id),
 customer_id varchar(20) references customers (customer_id) ,
 check_in date,
 check_out date,
 bill_amount number(10),
 paid_amount number(10)
);customer
