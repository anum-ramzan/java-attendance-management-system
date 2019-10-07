/*ODBC Name : attend*/

create database Attendance

GO

Use Attendance

GO
/* Admin login */
create table tbl_admin (
admin_name varchar(50),
admin_pass varchar(20)
)

go

create proc sp_admin_select
@admin_name varchar(50),
@admin_pass varchar(20)
as
begin 
select * from tbl_admin where admin_name = @admin_name and admin_pass = @admin_pass
end


go
/* Teacher Details and login */
create table tbl_teacher (
teacher_id int primary key,
[user_name] varchar(max),
teacher_name varchar(max),
teacher_pass varchar(max),
teacher_status varchar(max),
added_on date
)
go

create proc sp_teacher_select 
@user_name varchar(max),
@teacher_pass varchar(max)

as
begin
select * from tbl_teacher where [user_name] = @user_name and teacher_pass =@teacher_pass and teacher_status = 'true'
end


go
/* Add Batch */
create table tbl_batch (
batch_code varchar (50) primary key,
batch_days varchar(max),
batch_time varchar(max),
semester_name varchar(max),
batch_book varchar(max),
teacher_id int foreign key references tbl_teacher(teacher_id),
teacher_name varchar(max),
added_on date,
batch_status varchar(max)
)

go

/* Add Student */
create table tbl_std (
date_added date,
std_id int primary key ,
std_name varchar(30),
std_batch_code varchar(30) ,
semester_name varchar(10),
std_days varchar(10),
std_time varchar(10),
std_book varchar(max) ,
teacher_name varchar(50),
teacher_id int foreign key references tbl_teacher(teacher_id),
std_status varchar(20),
)


go
/*Semester Details*/
create table tbl_book (
semester_name varchar (30),
semester_book varchar(max),
std_book_session varchar(20),
)

go
/* Marking Student Attendance*/
create table std_attend (
attend_date date,
std_id int foreign key references tbl_std(std_id),
std_name varchar(max),
std_batch_code varchar(max) ,
std_book varchar(max) ,
std_book_session varchar(max),
std_status varchar(max),
)

go

/*teacher Details*/
create table teacher_details(
name varchar(50),
surname varchar(50),
age int,
email varchar(max),
teacher_id int foreign key references tbl_teacher(teacher_id),
teacher_pass varchar(max),
)

go
---------------Stored Procedure--------------

/* Stored Procdure For Checking Date */
-- '2016-03-22', 'IPRO-201501K'

create proc myproc
@date date,
@std_batch varchar(50)
as
begin


declare @count int;

if((select COUNT( attend_date) from std_attend where attend_date=@date and std_batch_code = @std_batch)>0)
begin
print'date already exsist'
end

else
begin


select * from tbl_std where std_batch_code = @std_batch
end

end




go


Use Attendance
select * from tbl_admin
select * from tbl_batch
select * from tbl_book
select * from tbl_std
select * from std_attend
select * from tbl_teacher
select * from teacher_details


/*
Select *  FROM INFORMATION_SCHEMA.COLUMNS  WHERE TABLE_NAME = 'std_attend' AND TABLE_SCHEMA='dbo'  pivot (select * FROM INFORMATION_SCHEMA.COLUMNS )

select COLUMN_NAME from INFORMATION_SCHEMA.COLUMNS  where TABLE_NAME = 'std_attend'

--SELECT COLUMN_NAME FROM Attendance.INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = N'tbl_std'

SELECT COLUMN_NAME as 'Search By' FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'std_attend' AND TABLE_SCHEMA='dbo' 

--select column_name from INFORMATION_SCHEMA.COLUMNS where TABLE_NAME = 'std_attend' and TABLE_SCHEMA = 'dbo'

--select * from INFORMATION_SCHEMA.COLUMNS where TABLE_NAME='tbl_std'
*/