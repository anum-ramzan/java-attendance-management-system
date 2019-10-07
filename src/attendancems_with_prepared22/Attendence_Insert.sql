Use Attendance
go

/*  tbl admin  */
insert into tbl_admin values ('admin', '123');

 
 
/*  tbl teacher  */
insert into tbl_teacher values ('10001', 'ali',    'Sir Ali',    'ali', 'false', '2015-01-01');
insert into tbl_teacher values ('10002', 'ashar',  'Sir Ashar',  'ash', 'true', '2014-12-01');
insert into tbl_teacher values ('10003', 'sohail', 'Sir Sohail', 'soh', 'true', '2014-11-01');
insert into tbl_teacher values ('10004', 'farooq', 'Sir Farooq', 'far', 'true', '2014-10-01');
insert into tbl_teacher values ('10005', 'ahmed',  'Sir Ahmed',  'ahm', 'false', '2015-01-01');


/* tbl batch  */
insert into tbl_batch values ('IPRO-201602C', 'TTS','9-11',	'CPISM',   'HTML5 - NexTGen Web ',                    					10001,'Sir Ali',	'2015-11-01','true');
insert into tbl_batch values ('IPRO-201505E', 'MWF','11-1',	'DISM',    'Fundamentals of Java', 					 					10002,'Sir Ashar',	'2015-10-01','true');
insert into tbl_batch values ('IPRO-201601B', 'TTS','11-1',	'ADSE-II', 'Working with Cloud Computing',			   					10002,'Sir Ashar',	'2015-01-01','true');
insert into tbl_batch values ('IPRO-201506F', 'MWF','1-3',	'CPISM',   'Data Management using SQL Server',         					10003,'Sir Sohail',	'2016-01-02','true');
insert into tbl_batch values ('IPRO-201504D', 'MWF','3-5',	'HDSE-II', 'Working with Liunx Operating System',	   					10004,'Sir Farooq',	'2016-01-01','true');
insert into tbl_batch values ('IPRO-201508H', 'TTS','9-11',	'ADSE-II', 'Integrating Databases in Web Application using ADO.NET',	10004,'Sir Farooq',	'2015-02-01','true');
insert into tbl_batch values ('IPRO-201501K', 'MWF','3-5',	'CPISM',   'Microsoft Office 2010 A Modern Approach',					10005,'Sir Ahmed',	'2016-01-01','false');


go

/* tbl std  */
--IPRO-201602C
insert into tbl_std values ('2015-11-01', 1111, 'Asad',  'IPRO-201602C', 'CPISM',  'TTS', '9-11', 'HTML5 - NexTGen Web', 'Sir Ali',  10001,'true');
insert into tbl_std values ('2015-11-01', 1112, 'Umer',  'IPRO-201602C', 'CPISM',  'TTS', '9-11', 'HTML5 - NexTGen Web', 'Sir Ali',  10001,'true');
insert into tbl_std values ('2015-11-01', 1113, 'Zaid',  'IPRO-201602C', 'CPISM',  'TTS', '9-11', 'HTML5 - NexTGen Web', 'Sir Ali',  10002,'true');
insert into tbl_std values ('2015-11-01', 1114, 'Ahemd', 'IPRO-201602C', 'CPISM',  'TTS', '9-11', 'HTML5 - NexTGen Web', 'Sir Ali',  10002,'true');
insert into tbl_std values ('2015-11-01', 1115, 'Sara',  'IPRO-201602C', 'CPISM',  'TTS', '9-11', 'HTML5 - NexTGen Web', 'Sir Ali',  10003,'true');
go
--IPRO-201505E
insert into tbl_std values ('2015-10-01', 1116, 'Habib',	'IPRO-201505E', 'DISM', 'MWF',  '11-1', 'Fundamentals of Java', 'Sir Ashar',10002, 'true');
insert into tbl_std values ('2015-10-01', 1117, 'Hamid',	'IPRO-201505E', 'DISM', 'MWF',  '11-1', 'Fundamentals of Java', 'Sir Ashar',10002, 'true');
insert into tbl_std values ('2015-10-01', 1118, 'Ibrahim',	'IPRO-201505E', 'DISM', 'MWF',  '11-1', 'Fundamentals of Java', 'Sir Ashar',10002, 'true');
insert into tbl_std values ('2015-10-01', 1119, 'Hashim',	'IPRO-201505E', 'DISM', 'MWF',  '11-1', 'Fundamentals of Java', 'Sir Ashar',10002, 'true');
insert into tbl_std values ('2015-10-01', 1120, 'Azra',		'IPRO-201505E', 'DISM', 'MWF',  '11-1', 'Fundamentals of Java', 'Sir Ashar',10002, 'true');
insert into tbl_std values ('2015-10-01', 1121, 'Adeela',	'IPRO-201505E', 'DISM', 'MWF',  '11-1', 'Fundamentals of Java', 'Sir Ashar',10002, 'true');
go
--IPRO-201601B
insert into tbl_std values ('2015-01-01', 1122, 'Basma',	'IPRO-201601B', 'ADSE-II', 'TTS',  '11-1', 'Working with Cloud Computing', 'Sir Ashar', 10002, 'true');
insert into tbl_std values ('2015-01-01', 1123, 'Batool',	'IPRO-201601B', 'ADSE-II', 'TTS',  '11-1', 'Working with Cloud Computing', 'Sir Ashar', 10002, 'true');
insert into tbl_std values ('2015-01-01', 1124, 'Faiza',	'IPRO-201601B', 'ADSE-II', 'TTS',  '11-1', 'Working with Cloud Computing', 'Sir Ashar', 10002, 'true');
insert into tbl_std values ('2015-01-01', 1125, 'Hafsa',	'IPRO-201601B', 'ADSE-II', 'TTS',  '11-1', 'Working with Cloud Computing', 'Sir Ashar', 10002, 'true');
insert into tbl_std values ('2015-01-01', 1126, 'Jawad',	'IPRO-201601B', 'ADSE-II', 'TTS',  '11-1', 'Working with Cloud Computing', 'Sir Ashar', 10002, 'true');
insert into tbl_std values ('2015-01-01', 1127, 'Khalid',	'IPRO-201601B', 'ADSE-II', 'TTS',  '11-1', 'Working with Cloud Computing', 'Sir Ashar', 10002, 'true');
insert into tbl_std values ('2015-01-01', 1128, 'Munib',	'IPRO-201601B', 'ADSE-II', 'TTS',  '11-1', 'Working with Cloud Computing', 'Sir Ashar', 10002, 'true');
go
--IPRO-201506F
insert into tbl_std values ('2015-01-02', 1129, 'Nadir',	'IPRO-201506F', 'CPISM', 'MWF',  '1-3', 'Data Management using SQL Server',      'Sir Sohail', 10003, 'true');
insert into tbl_std values ('2015-01-02', 1130, 'Nasib',	'IPRO-201506F', 'CPISM', 'MWF',  '1-3', 'Data Management using SQL Server',      'Sir Sohail', 10003, 'true');
insert into tbl_std values ('2015-01-02', 1131, 'Umar',		'IPRO-201506F', 'CPISM', 'MWF',  '1-3', 'Data Management using SQL Server',      'Sir Sohail', 10003, 'true');
insert into tbl_std values ('2015-01-02', 1132, 'Wahab',	'IPRO-201506F', 'CPISM', 'MWF',  '1-3', 'Data Management using SQL Server',      'Sir Sohail', 10003, 'true');
insert into tbl_std values ('2015-01-02', 1133, 'Rashid',	'IPRO-201506F', 'CPISM', 'MWF',  '1-3', 'Data Management using SQL Server',      'Sir Sohail', 10003, 'true');
go
--IPRO-201504D
insert into tbl_std values ('2016-01-01', 1134, 'Zafar',	'IPRO-201504D', 'HDSE-II', 'MWF',  '3-5', 'Working with Liunx Operating System', 'Sir Farooq', 10004, 'true');
insert into tbl_std values ('2016-01-01', 1135, 'Lubna',	'IPRO-201504D', 'HDSE-II', 'MWF',  '3-5', 'Working with Liunx Operating System', 'Sir Farooq', 10004, 'true');
insert into tbl_std values ('2016-01-01', 1136, 'Yasir',	'IPRO-201504D', 'HDSE-II', 'MWF',  '3-5', 'Working with Liunx Operating System', 'Sir Farooq', 10004, 'true');
insert into tbl_std values ('2016-01-01', 1137, 'Waqar',	'IPRO-201504D', 'HDSE-II', 'MWF',  '3-5', 'Working with Liunx Operating System', 'Sir Farooq', 10004, 'true');
insert into tbl_std values ('2016-01-01', 1138, 'Nabila',	'IPRO-201504D', 'HDSE-II', 'MWF',  '3-5', 'Working with Liunx Operating System', 'Sir Farooq', 10004, 'true');
go
--IPRO-201508H
insert into tbl_std values ('2015-02-01', 1139, 'Shafiq',	'IPRO-201508H', 'ADSE-II', 'TTS',  '9-11', 'Integrating Databases in Web Application using ADO.NET', 'Sir Farooq', 10004, 'true');
insert into tbl_std values ('2015-02-01', 1140, 'Sajid',	'IPRO-201508H', 'ADSE-II', 'TTS',  '9-11', 'Integrating Databases in Web Application using ADO.NET', 'Sir Farooq', 10004, 'true');
insert into tbl_std values ('2015-02-01', 1141, 'Noor',		'IPRO-201508H', 'ADSE-II', 'TTS',  '9-11', 'Integrating Databases in Web Application using ADO.NET', 'Sir Farooq', 10004, 'true');
insert into tbl_std values ('2015-02-01', 1142, 'Saud',		'IPRO-201508H', 'ADSE-II', 'TTS',  '9-11', 'Integrating Databases in Web Application using ADO.NET', 'Sir Farooq', 10004, 'true');
insert into tbl_std values ('2015-02-01', 1143, 'Raiqa',	'IPRO-201508H', 'ADSE-II', 'TTS',  '9-11', 'Integrating Databases in Web Application using ADO.NET', 'Sir Farooq', 10004, 'true');
go
--IPRO-201501K, 
insert into tbl_std values ('2016-01-01', 1144, 'Salma',	'IPRO-201501K', 'CPISM', 'MWF','3-5', 'Microsoft Office 2010 A Modern Approach', 'Sir Ahmed', 10005, 'true');
insert into tbl_std values ('2016-01-01', 1145, 'Uzma',		'IPRO-201501K', 'CPISM', 'MWF','3-5', 'Microsoft Office 2010 A Modern Approach', 'Sir Ahmed', 10005, 'true');
insert into tbl_std values ('2016-01-01', 1146, 'Muneer',	'IPRO-201501K', 'CPISM', 'MWF','3-5', 'Microsoft Office 2010 A Modern Approach', 'Sir Ahmed', 10005, 'true');
insert into tbl_std values ('2016-01-01', 1147, 'Irfan',	'IPRO-201501K', 'CPISM', 'MWF','3-5', 'Microsoft Office 2010 A Modern Approach', 'Sir Ahmed', 10005, 'true');
insert into tbl_std values ('2016-01-01', 1148, 'Warda',	'IPRO-201501K', 'CPISM', 'MWF','3-5', 'Microsoft Office 2010 A Modern Approach', 'Sir Ahmed', 10005, 'true');

GO


/*std attend*/
insert into std_attend values ('2016-01-02', 1122, 'Basma', 'IPRO-201601B','Working with Cloud Computing','Session 01','Present');
insert into std_attend values ('2016-01-02', 1123, 'Batool', 'IPRO-201601B','Working with Cloud Computing','Session 01','Absent');
insert into std_attend values ('2016-01-02', 1124, 'Faiza', 'IPRO-201601B','Working with Cloud Computing','Session 01','Present');
insert into std_attend values ('2016-01-02', 1125, 'Hafsa', 'IPRO-201601B','Working with Cloud Computing','Session 01','Absent');
insert into std_attend values ('2016-01-02', 1126, 'Jawad', 'IPRO-201601B','Working with Cloud Computing','Session 01','Absent');
insert into std_attend values ('2016-01-02', 1127, 'Khalid', 'IPRO-201601B','Working with Cloud Computing','Session 01','Present');
insert into std_attend values ('2016-01-02', 1128, 'Munib', 'IPRO-201601B','Working with Cloud Computing','Session 01','Present');
go
insert into std_attend values ('2016-01-05', 1122, 'Basma', 'IPRO-201601B','Working with Cloud Computing','Session 03','Absent');
insert into std_attend values ('2016-01-05', 1123, 'Batool', 'IPRO-201601B','Working with Cloud Computing','Session 03','Absent');
insert into std_attend values ('2016-01-05', 1124, 'Faiza', 'IPRO-201601B','Working with Cloud Computing','Session 03','Present');
insert into std_attend values ('2016-01-05', 1125, 'Hafsa', 'IPRO-201601B','Working with Cloud Computing','Session 03','Present');
insert into std_attend values ('2016-01-05', 1126, 'Jawad', 'IPRO-201601B','Working with Cloud Computing','Session 03','Present');
insert into std_attend values ('2016-01-05', 1127, 'Khalid', 'IPRO-201601B','Working with Cloud Computing','Session 03','Present');
insert into std_attend values ('2016-01-05', 1128, 'Munib', 'IPRO-201601B','Working with Cloud Computing','Session 03','Present');
go
insert into std_attend values ('2016-01-07', 1122, 'Basma', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 01','Present');
insert into std_attend values ('2016-01-07', 1123, 'Batool', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 01','Absent');
insert into std_attend values ('2016-01-07', 1124, 'Faiza', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 01','Absent');
insert into std_attend values ('2016-01-07', 1125, 'Hafsa', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 01','Absent');
insert into std_attend values ('2016-01-07', 1126, 'Jawad', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 01','Present');
insert into std_attend values ('2016-01-07', 1127, 'Khalid', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 01','Present');
insert into std_attend values ('2016-01-07', 1128, 'Munib', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 01','Present');
go
insert into std_attend values ('2016-01-09', 1122, 'Basma', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 03','Present');
insert into std_attend values ('2016-01-09', 1123, 'Batool', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 03','Absent');
insert into std_attend values ('2016-01-09', 1124, 'Faiza', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 03','Present');
insert into std_attend values ('2016-01-09', 1125, 'Hafsa', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 03','Absent');
insert into std_attend values ('2016-01-09', 1126, 'Jawad', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 03','Absent');
insert into std_attend values ('2016-01-09', 1127, 'Khalid', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 03','Present');
insert into std_attend values ('2016-01-09', 1128, 'Munib', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 03','Present');
go
insert into std_attend values ('2016-01-12', 1122, 'Basma', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 05','Present');
insert into std_attend values ('2016-01-12', 1123, 'Batool', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 05','Present');
insert into std_attend values ('2016-01-12', 1124, 'Faiza', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 05','Present');
insert into std_attend values ('2016-01-12', 1125, 'Hafsa', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 05','Present');
insert into std_attend values ('2016-01-12', 1126, 'Jawad', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 05','Present');
insert into std_attend values ('2016-01-12', 1127, 'Khalid', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 05','Present');
insert into std_attend values ('2016-01-12', 1128, 'Munib', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 05','Present');
go
insert into std_attend values ('2016-01-14', 1122, 'Basma', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 07','Absent');
insert into std_attend values ('2016-01-14', 1123, 'Batool', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 07','Absent');
insert into std_attend values ('2016-01-14', 1124, 'Faiza', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 07','Absent');
insert into std_attend values ('2016-01-14', 1125, 'Hafsa', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 07','Present');
insert into std_attend values ('2016-01-14', 1126, 'Jawad', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 07','Present');
insert into std_attend values ('2016-01-14', 1127, 'Khalid', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 07','Present');
insert into std_attend values ('2016-01-14', 1128, 'Munib', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 07','Present');
go
insert into std_attend values ('2016-01-16', 1122, 'Basma', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 09','Present');
insert into std_attend values ('2016-01-16', 1123, 'Batool', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 09','Present');
insert into std_attend values ('2016-01-16', 1124, 'Faiza', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 09','Present');
insert into std_attend values ('2016-01-16', 1125, 'Hafsa', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 09','Present');
insert into std_attend values ('2016-01-16', 1126, 'Jawad', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 09','Present');
insert into std_attend values ('2016-01-16', 1127, 'Khalid', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 09','Absent');
insert into std_attend values ('2016-01-16', 1128, 'Munib', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 09','Present');
go
insert into std_attend values ('2016-01-19', 1122, 'Basma', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 11','Absent');
insert into std_attend values ('2016-01-19', 1123, 'Batool', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 11','Absent');
insert into std_attend values ('2016-01-19', 1124, 'Faiza', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 11','Present');
insert into std_attend values ('2016-01-19', 1125, 'Hafsa', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 11','Absent');
insert into std_attend values ('2016-01-19', 1126, 'Jawad', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 11','Present');
insert into std_attend values ('2016-01-19', 1127, 'Khalid', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 11','Present');
insert into std_attend values ('2016-01-19', 1128, 'Munib', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 11','Present');
go
insert into std_attend values ('2016-01-21', 1122, 'Basma', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 13','Absent');
insert into std_attend values ('2016-01-21', 1123, 'Batool', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 13','Present');
insert into std_attend values ('2016-01-21', 1124, 'Faiza', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 13','Present');
insert into std_attend values ('2016-01-21', 1125, 'Hafsa', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 13','Absent');
insert into std_attend values ('2016-01-21', 1126, 'Jawad', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 13','Absent');
insert into std_attend values ('2016-01-21', 1127, 'Khalid', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 13','Present');
insert into std_attend values ('2016-01-21', 1128, 'Munib', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 13','Present');
go
insert into std_attend values ('2016-01-23', 1122, 'Basma', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 14','Absent');
insert into std_attend values ('2016-01-23', 1123, 'Batool', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 14','Present');
insert into std_attend values ('2016-01-23', 1124, 'Faiza', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 14','Absent');
insert into std_attend values ('2016-01-23', 1125, 'Hafsa', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 14','Absent');
insert into std_attend values ('2016-01-23', 1126, 'Jawad', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 14','Present');
insert into std_attend values ('2016-01-23', 1127, 'Khalid', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 14','Present');
insert into std_attend values ('2016-01-23', 1128, 'Munib', 'IPRO-201601B','Integrating Databases in Web Application using ADO.NET','Session 14','Present');
go
insert into std_attend values ('2016-01-26', 1122, 'Basma', 'IPRO-201601B','Essential Features of .NET Framework','Session 01','Present');
insert into std_attend values ('2016-01-26', 1123, 'Batool', 'IPRO-201601B','Essential Features of .NET Framework','Session 01','Present');
insert into std_attend values ('2016-01-26', 1124, 'Faiza', 'IPRO-201601B','Essential Features of .NET Framework','Session 01','Absent');
insert into std_attend values ('2016-01-26', 1125, 'Hafsa', 'IPRO-201601B','Essential Features of .NET Framework','Session 01','Absent');
insert into std_attend values ('2016-01-26', 1126, 'Jawad', 'IPRO-201601B','Essential Features of .NET Framework','Session 01','Absent');
insert into std_attend values ('2016-01-26', 1127, 'Khalid', 'IPRO-201601B','Essential Features of .NET Framework','Session 01','Present');
insert into std_attend values ('2016-01-26', 1128, 'Munib', 'IPRO-201601B','Essential Features of .NET Framework','Session 01','Present');
go
insert into std_attend values ('2016-01-28', 1122, 'Basma', 'IPRO-201601B','Essential Features of .NET Framework','Session 02','Absent');
insert into std_attend values ('2016-01-28', 1123, 'Batool', 'IPRO-201601B','Essential Features of .NET Framework','Session 02','Present');
insert into std_attend values ('2016-01-28', 1124, 'Faiza', 'IPRO-201601B','Essential Features of .NET Framework','Session 02','Present');
insert into std_attend values ('2016-01-28', 1125, 'Hafsa', 'IPRO-201601B','Essential Features of .NET Framework','Session 02','Present');
insert into std_attend values ('2016-01-28', 1126, 'Jawad', 'IPRO-201601B','Essential Features of .NET Framework','Session 02','Present');
insert into std_attend values ('2016-01-28', 1127, 'Khalid', 'IPRO-201601B','Essential Features of .NET Framework','Session 02','Absent');
insert into std_attend values ('2016-01-28', 1128, 'Munib', 'IPRO-201601B','Essential Features of .NET Framework','Session 02','Present');
go
insert into std_attend values ('2016-01-30', 1122, 'Basma', 'IPRO-201601B','Essential Features of .NET Framework','Session 04','Absent');
insert into std_attend values ('2016-01-30', 1123, 'Batool', 'IPRO-201601B','Essential Features of .NET Framework','Session 04','Absent');
insert into std_attend values ('2016-01-30', 1124, 'Faiza', 'IPRO-201601B','Essential Features of .NET Framework','Session 04','Present');
insert into std_attend values ('2016-01-30', 1125, 'Hafsa', 'IPRO-201601B','Essential Features of .NET Framework','Session 04','Absent');
insert into std_attend values ('2016-01-30', 1126, 'Jawad', 'IPRO-201601B','Essential Features of .NET Framework','Session 04','Present');
insert into std_attend values ('2016-01-30', 1127, 'Khalid', 'IPRO-201601B','Essential Features of .NET Framework','Session 04','Present');
insert into std_attend values ('2016-01-30', 1128, 'Munib', 'IPRO-201601B','Essential Features of .NET Framework','Session 04','Present');

go
/*Teacher Details*/
insert into teacher_details values ('Ali', 'Khan', 25, 'ali@gmail.com', 10001, 'ali');
insert into teacher_details values ('Ashar', 'Hussain', 25, 'ashar@gmail.com', 10002, 'ash');
insert into teacher_details values ('Syed', 'Sohail', 25, 'sohail@gmail.com', 10003, 'soh');
insert into teacher_details values ('Farooq', 'Shibli', 40, 'farooq@gmail.com', 10004, 'far');
insert into teacher_details values ('Ahemd', 'Shah', 45, 'ashar@gmail.com', 10005, 'ahm');

go

/*tbl book*/
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 01');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 02');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 03');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 04');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 05');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 06');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 07');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 08');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 09');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 10');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 11');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 12');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 13');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 14');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Concept Session 15');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 01');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 02');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 03');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 04');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 05');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 06');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 07');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 08');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 09');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 10');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 11');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 12');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 13');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 14');
insert into tbl_book values ('CPISM', 'Microsoft Office 2010 A Modern Approach', 'Lab Session 15');
insert into tbl_book values ('CPISM', 'Designing Websites in Dreamweaver CS5 ',   'Session 01');
insert into tbl_book values ('CPISM', 'Designing Websites in Dreamweaver CS5 ',   'Session 02');
insert into tbl_book values ('CPISM', 'Designing Websites in Dreamweaver CS5 ',   'Session 03');
insert into tbl_book values ('CPISM', 'Designing Websites in Dreamweaver CS5 ',   'Session 04');
insert into tbl_book values ('CPISM', 'Designing Websites in Dreamweaver CS5 ',   'Session 05');
insert into tbl_book values ('CPISM', 'Designing Websites in Dreamweaver CS5 ',   'Session 06');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 01');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 02');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 03');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 04');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 05');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 06');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 07');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 08');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 09');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 10');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 11');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 12');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 13');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 14');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 15');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 16');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 17');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 18');
insert into tbl_book values ('CPISM', 'HTML5 - NexTGen Web ',                     'Session 19');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 01');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 02');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 03');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 04');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 05');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 06');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 07');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 08');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 09');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 10');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 11');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 12');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 13');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 14');
insert into tbl_book values ('CPISM', 'Data Management using SQL Server ',        'Session 15');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 01');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 02');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Lab Session 03');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 04');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Lab Session 05');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 06');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Lab Session 07');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 08');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Lab Session 09');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 10');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Lab Session 11');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 12');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Lab Session 13');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 14');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Lab Session 15');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 16');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Lab Session 17');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 18');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Lab Session 19');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Concepts Session 20');
insert into tbl_book values ('CPISM', 'Elementary Programming with C  ',          'Lab Session 21');
/*DISM BOOKS*/
insert into tbl_book values ('DISM', 'XML Simplified',                     'Session 01');
insert into tbl_book values ('DISM', 'XML Simplified',                     'Session 02');
insert into tbl_book values ('DISM', 'XML Simplified',                     'Session 03');
insert into tbl_book values ('DISM', 'XML Simplified',                     'Session 04');
insert into tbl_book values ('DISM', 'XML Simplified',                     'Session 05');
insert into tbl_book values ('DISM', 'XML Simplified',                     'Session 06');
insert into tbl_book values ('DISM', 'XML Simplified',                     'Session 07');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 01');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 02');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 03');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 04');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 05');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 06');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 07');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 08');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 09');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 10');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 11');
insert into tbl_book values ('DISM', 'Fundamentals of Java',               'Session 12');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 01');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 02');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 03');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 04');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 05');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 06');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 07');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 08');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 09');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 10');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 11');
insert into tbl_book values ('DISM', 'Object-oriented Programming in Java','Session 12');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 01');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 02');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 03');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 04');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 05');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 06');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 07');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 08');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 09');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 10');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 11');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 12');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 13');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 14');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 15');
insert into tbl_book values ('DISM', 'Building Applications in C#',        'Session 16');
insert into tbl_book values ('DISM', 'Introduction to Cloud Computing',    'Session 01');
/*HDSE-I Book*/
insert into tbl_book values ('HDSE-I', 'Advanced Programming with C#',				'Session 01');
insert into tbl_book values ('HDSE-I', 'Advanced Programming with C#',				'Session 02');
insert into tbl_book values ('HDSE-I', 'Advanced Programming with C#',				'Session 03');
insert into tbl_book values ('HDSE-I', 'Advanced Programming with C#',				'Session 04');
insert into tbl_book values ('HDSE-I', 'Advanced Programming with C#',				'Session 05');
insert into tbl_book values ('HDSE-I', 'Advanced Programming with C#',				'Session 06');
insert into tbl_book values ('HDSE-I', 'Advanced Programming with C#',				'Session 07');
insert into tbl_book values ('HDSE-I', 'Advanced Programming with C#',				'Session 08');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - I',		'Session 01');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - I',		'Session 02');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - I',		'Session 03');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - I',		'Session 04');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - I',		'Session 05');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - I',		'Session 06');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - I',		'Session 07');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - I',		'Session 08');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - I',		'Session 09');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - II',	'Session 01');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - II',	'Session 02');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - II',	'Session 03');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - II',	'Session 04');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - II',	'Session 05');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - II',	'Session 06');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - II',	'Session 07');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - II',	'Session 08');
insert into tbl_book values ('HDSE-I', 'Windows Forms Programming with C# - II',	'Session 09');
insert into tbl_book values ('HDSE-I', 'Advanced Data Access in .NET',				'Session 01');
insert into tbl_book values ('HDSE-I', 'Advanced Data Access in .NET',				'Session 02');
insert into tbl_book values ('HDSE-I', 'Advanced Data Access in .NET',				'Session 03');
insert into tbl_book values ('HDSE-I', 'Advanced Data Access in .NET',				'Session 04');
insert into tbl_book values ('HDSE-I', 'Advanced Data Access in .NET',				'Session 05');
insert into tbl_book values ('HDSE-I', 'Advanced Data Access in .NET',				'Session 06');
insert into tbl_book values ('HDSE-I', 'Advanced Data Access in .NET',				'Session 07');
insert into tbl_book values ('HDSE-I', 'Advanced Data Access in .NET',				'Session 08');
/*HDSE - II BOOK*/
insert into tbl_book values ('HDSE-II', 'Working with Liunx Operating System',	'Session 01');
insert into tbl_book values ('HDSE-II', 'Working with Liunx Operating System',	'Session 02');
insert into tbl_book values ('HDSE-II', 'Working with Liunx Operating System',	'Session 03');
insert into tbl_book values ('HDSE-II', 'Working with Liunx Operating System',	'Session 04');
insert into tbl_book values ('HDSE-II', 'Working with Liunx Operating System',	'Session 05');
insert into tbl_book values ('HDSE-II', 'Working with Liunx Operating System',	'Session 06');
insert into tbl_book values ('HDSE-II', 'Working with Liunx Operating System',	'Session 07');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 01');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 02');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 03');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 04');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 05');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 06');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 07');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 08');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 09');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 10');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 11');
insert into tbl_book values ('HDSE-II', 'Using Apache Web Server',				'Session 12');
insert into tbl_book values ('HDSE-II', 'Database Programming with MySQL',		'Session 01');
insert into tbl_book values ('HDSE-II', 'Database Programming with MySQL',		'Session 02');
insert into tbl_book values ('HDSE-II', 'Database Programming with MySQL',		'Session 03');
insert into tbl_book values ('HDSE-II', 'Database Programming with MySQL',		'Session 04');
insert into tbl_book values ('HDSE-II', 'Database Programming with MySQL',		'Session 05');
insert into tbl_book values ('HDSE-II', 'Database Programming with MySQL',		'Session 06');
insert into tbl_book values ('HDSE-II', 'Database Programming with MySQL',		'Session 07');
insert into tbl_book values ('HDSE-II', 'Database Programming with MySQL',		'Session 08');
insert into tbl_book values ('HDSE-II', 'Web Application Development with PHP',	'Session 01');
insert into tbl_book values ('HDSE-II', 'Web Application Development with PHP',	'Session 02');
insert into tbl_book values ('HDSE-II', 'Web Application Development with PHP',	'Session 03');
insert into tbl_book values ('HDSE-II', 'Web Application Development with PHP',	'Session 04');
insert into tbl_book values ('HDSE-II', 'Web Application Development with PHP',	'Session 05');
insert into tbl_book values ('HDSE-II', 'Web Application Development with PHP',	'Session 06');
insert into tbl_book values ('HDSE-II', 'Web Application Development with PHP',	'Session 07');
insert into tbl_book values ('HDSE-II', 'Web Application Development with PHP',	'Session 08');
insert into tbl_book values ('HDSE-II', 'Web Application Development with PHP',	'Session 09');
insert into tbl_book values ('HDSE-II', 'Web Application Development with PHP',	'Session 10');
/*ADSE-I*/
insert into tbl_book values ('ADSE-I', 'Object Oriented Analysis And Design',	'Session 01');
insert into tbl_book values ('ADSE-I', 'Object Oriented Analysis And Design',	'Session 02');
insert into tbl_book values ('ADSE-I', 'Object Oriented Analysis And Design',	'Session 03');
insert into tbl_book values ('ADSE-I', 'Object Oriented Analysis And Design',	'Session 04');
insert into tbl_book values ('ADSE-I', 'Object Oriented Analysis And Design',	'Session 05');
insert into tbl_book values ('ADSE-I', 'Software Engineering Principles',		'Session 01');
insert into tbl_book values ('ADSE-I', 'Software Engineering Principles',		'Session 02');
insert into tbl_book values ('ADSE-I', 'Software Engineering Principles',		'Session 03');
insert into tbl_book values ('ADSE-I', 'Software Engineering Principles',		'Session 04');
insert into tbl_book values ('ADSE-I', 'Software Engineering Principles',		'Session 05');
insert into tbl_book values ('ADSE-I', 'Software Project Management',			'Session 01');
insert into tbl_book values ('ADSE-I', 'Software Project Management',			'Session 02');
insert into tbl_book values ('ADSE-I', 'Software Project Management',			'Session 03');
insert into tbl_book values ('ADSE-I', 'Software Project Management',			'Session 04');
insert into tbl_book values ('ADSE-I', 'Software Project Management',			'Session 05');
insert into tbl_book values ('ADSE-I', 'Working with Cloud Computing',			'Session 01');
insert into tbl_book values ('ADSE-I', 'Working with Cloud Computing',			'Session 02');
insert into tbl_book values ('ADSE-I', 'Working with Cloud Computing',			'Session 03');
insert into tbl_book values ('ADSE-I', 'Internet Security',						'Session 01');
insert into tbl_book values ('ADSE-I', 'Internet Security',						'Session 02');
insert into tbl_book values ('ADSE-I', 'Internet Security',						'Session 03');
insert into tbl_book values ('ADSE-I', 'Internet Security',						'Session 04');
insert into tbl_book values ('ADSE-I', 'Internet Security',						'Session 05');
insert into tbl_book values ('ADSE-I', 'Internet Security',						'Session 06');
insert into tbl_book values ('ADSE-I', 'Internet Security',						'Session 07');
/*ADSE-II*/
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-I',									'Session 01');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-I',									'Session 02');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-I',									'Session 03');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-I',									'Session 04');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-I',									'Session 05');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-I',									'Session 06');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-I',									'Session 07');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-II',								'Session 01');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-II',								'Session 02');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-II',								'Session 03');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-II',								'Session 04');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-II',								'Session 05');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-II',								'Session 06');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-II',								'Session 07');
insert into tbl_book values ('ADSE-II', 'Web Programming in Asp.NET-II',								'Session 08');
insert into tbl_book values ('ADSE-II', 'Working with Cloud Computing',									'Session 01');
insert into tbl_book values ('ADSE-II', 'Working with Cloud Computing',									'Session 02');
insert into tbl_book values ('ADSE-II', 'Working with Cloud Computing',									'Session 03');
insert into tbl_book values ('ADSE-II', 'Working with Cloud Computing',									'Session 04');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 01');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 02');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 03');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 04');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 05');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 06');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 07');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 08');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 09');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 10');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 11');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 12');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 13');
insert into tbl_book values ('ADSE-II', 'Integrating Databases in Web Application using ADO.NET',		'Session 14');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 01');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 02');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 03');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 04');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 05');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 06');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 07');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 08');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 09');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 10');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 11');
insert into tbl_book values ('ADSE-II', 'Essential Features of .NET Framework',							'Session 12');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 01');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 02');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 03');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 04');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 05');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 06');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 07');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 08');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 09');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 10');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 11');
insert into tbl_book values ('ADSE-II', 'Building Rich UI using Windows Presentation Foundation (WPF)',	'Session 12');
insert into tbl_book values ('ADSE-II', 'Developing ASP.NET AJAX Applications',							'Session 01');
insert into tbl_book values ('ADSE-II', 'Developing ASP.NET AJAX Applications',							'Session 02');
insert into tbl_book values ('ADSE-II', 'Developing ASP.NET AJAX Applications',							'Session 03');
insert into tbl_book values ('ADSE-II', 'Developing ASP.NET AJAX Applications',							'Session 04');
insert into tbl_book values ('ADSE-II', 'Developing ASP.NET AJAX Applications',							'Session 05');
insert into tbl_book values ('ADSE-II', 'Developing ASP.NET AJAX Applications',							'Session 06');
insert into tbl_book values ('ADSE-II', 'Developing ASP.NET AJAX Applications',							'Session 07');
insert into tbl_book values ('ADSE-II', 'Developing ASP.NET AJAX Applications',							'Session 08');
insert into tbl_book values ('ADSE-II', 'Developing Mobile Application in .NET',						'Session 01');
insert into tbl_book values ('ADSE-II', 'Developing Mobile Application in .NET',						'Session 02');
insert into tbl_book values ('ADSE-II', 'Developing Mobile Application in .NET',						'Session 03');
insert into tbl_book values ('ADSE-II', 'Developing Mobile Application in .NET',						'Session 04');
insert into tbl_book values ('ADSE-II', 'Developing Mobile Application in .NET',						'Session 05');
insert into tbl_book values ('ADSE-II', 'Developing Mobile Application in .NET',						'Session 06');
insert into tbl_book values ('ADSE-II', 'Developing Mobile Application in .NET',						'Session 07');
insert into tbl_book values ('ADSE-II', 'Developing Mobile Application in .NET',						'Session 08');
insert into tbl_book values ('ADSE-II', 'Enterprise Application Development (WCF)',						'Session 01');
insert into tbl_book values ('ADSE-II', 'Enterprise Application Development (WCF)',						'Session 02');
insert into tbl_book values ('ADSE-II', 'Enterprise Application Development (WCF)',						'Session 03');
insert into tbl_book values ('ADSE-II', 'Enterprise Application Development (WCF)',						'Session 04');
insert into tbl_book values ('ADSE-II', 'Enterprise Application Development (WCF)',						'Session 05');
insert into tbl_book values ('ADSE-II', 'Enterprise Application Development (WCF)',						'Session 06');
insert into tbl_book values ('ADSE-II', 'Enterprise Application Development (WCF)',						'Session 07');
insert into tbl_book values ('ADSE-II', 'Enterprise Application Development (WCF)',						'Session 08');
insert into tbl_book values ('ADSE-II', 'Enterprise Application Development (WCF)',						'Session 09');