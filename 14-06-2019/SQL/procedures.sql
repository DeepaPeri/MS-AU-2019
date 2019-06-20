
create database MovieTicketBookingSystem;
use MovieTicketBookingSystem;

CREATE TABLE Theatre(
location varchar(20),
screens int,
seats int,
th_id int primary key,
th_name varchar(30)
);

CREATE TABLE Movie (
mo_id int primary key,
mo_name varchar(30),
movie_genre varchar(30)
);

CREATE TABLE User(
u_id int primary key,
u_name varchar(30),
location varchar(30)
);

CREATE TABLE Shows (
s_id int primary key,
s_time date,
th_id int,
mo_id int,
foreign key (mo_id) references Movie(mo_id),
foreign key (th_id) references Theatre(th_id)
);

CREATE TABLE  BookingDetails(
bo_id int primary key,
sh_id int,
u_id int,
tickets int,
foreign key (u_id) references user(u_id),
foreign key (sh_id) references Shows(sh_id)
);

INSERT INTO Theatre(th_id,th_name,location,screens,seats)
VALUES(103,'CityPride','Bangalore',2,400);

INSERT INTO Movie(movie_id,movie_name,movie_genre)
VALUES(4,'Showman','Music');

INSERT INTO User(u_id,u_name,location)
VALUES(1003,'Ankit','Bangalore');

INSERT INTO Shows(sh_id,sh_time,th_id,mo_id,tickets)
VALUES(2004,'2019-07-30',103,1,15);

INSERT INTO BookingDetails(bo_id,sh_id,user_id,tickets)
VALUES(10003,2002,1003,2);

delimiter $$
create procedure BookTicketNew(in user_id int, in theatre_id_new int, in movie_id_new int,in tickets_new int)
begin
declare show_id_new int default 0;
declare avail integer default 0;
select show_id,count(*) as total_tickets from Shows where th_id = theatre_id_new and mo_id = movie_id_new and tickets >= tickets_new into show_id_new,avail;
if avail>0 then
INSERT INTO BookingDetails(show_id,user_id,tickets)
VALUES(show_id_new,user_id,tickets_new);
update Shows set tickets = tickets - tickets_new where show_id = show_id_new;
end if;
end $$
delimiter ;


call BookTicketNew(1002,102,3,4);

delimiter $$
create procedure GetBookingDetails(in user_id_new int,in show_id_new int,in booking_id_new int)
begin
select * from BookingDetails where user_id = user_id_new and show_id = show_id_new and booking_id = booking_id_new;
end $$
delimiter ;

call GetBookingDetails(1001,2001,10001);