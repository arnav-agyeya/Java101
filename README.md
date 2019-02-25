# Java101
Sapient
1.create table Customers (
 customer_id varchar(20) primary key,
 customer_name VARCHAR2(15) NOT NULL,
 customer_age NUMBER ,
 customer_sex CHAR(6),
 customer_number NUMBER(10),
 customer_emailid   varchar2(20),
 customer_password varchar2(10)
);

2.create table Rooms (
 Rooms_id varchar(20) primary key,
 rooms_location VARCHAR2(4) NOT NULL,
 rooms_type char(3) ,
 rooms_status number(1),
 rooms_price number(8)
);


3.create table booking (
 Booking_id number(10) primary key,
 rooms_id VARCHAR2(20) references rooms (rooms_id),
 customer_id varchar(20) references customers (customer_id) ,
 check_in date,
 check_out date,
 bill_amount number(10),
 paid_amount number(10)
);customer


4.insert into customers values('1','prakash',21,'male',974561230,'abcdseas@gmail.com','password');
insert into rooms values('D5','3','xl',0,5000);

5.select * from ROOMS where rooms_type='xl' and rooms_id
in (select rooms_id from booking where '12-JUN-67' >= 
check_out or '14-JUN-67' <=check_in);


6.select asf.rooms_id from asf join
booking bb
on
asf.rooms_id = bb.rooms_id
where
	('12-JUN-67' >= bb.check_out
	or
	'14-JUN-67' <=bb.check_in)
;
