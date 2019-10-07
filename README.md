# java-attendance-management-system

# PROJECT BRIEFING

Attendance Management System is software developed for daily student attendance in schools, colleges and institutes.

It facilitates to access the attendance information of a particular student in a particular class.

The information is sorted by the operators, which will be provided by the teacher for a particular class.

 This system will also help in evaluating attendance eligibility criteria of a student.

**Purpose: -**

The purpose of developing attendance management system is to computerized the tradition way of taking attendance.

Another purpose for developing this software is to generate the custom report at the end of the session or in the between of the session.

Another reason for developing this project is to enhance our learning skill and applying the application in the required area.

**CUSTOMER REQUIREMENTS**

The proposed system should be user friendly, the retrieval and storing of data should be fast and data should be maintained efficiently. Moreover the graphical user interface should be provided in the proposed system, which provides user to deal with the system very easily. The proposed system requires very less paper work. All the data is feted into the computer immediately and reports can be generated through computers. Moreover work become very easy because there is no need to keep data on papers.

- First Frame will be of Class Batch Code Registration in which the user can add new batch code, teacher name and subject, Batch days ( TTS , MWF ) and batch timings (9 to 11,11 to 1, 3 to 5, 5 to 7 , 7 to 9) etc.
- Second Frame will be of Students Registration where user can add the information about the student Example Details of a Student are as follows

1. Enrollment No.
2. Student Name
3. Student Batch Code

Make the required database table for both Batch Code Registration and Student Registration Frame in the systematic order with following the table normalization rules.

- After all registrations a Attendance frame will be created where teacher will select the   Present student from the student names list in a particular batch code after  this , enrollment no would be automatically displayed of that particular student. On clicking Mark Attendance Button, the attendance should be marked.

Note: Record of time and date of attendance marking is necessary of every student.

Make the required database table for Attendance frame in the systematic order with following the table normalization rules.

- Reports can be easily generated in the proposed system so teacher can generate the report as per the requirement (monthly) or in the middle of the session. So teacher can give the notice to the students so he/she become regular. Required Reports are as follows

1. Monthly Students Wise Present and Absent Report
2. Export the above Report in Excel Sheet.



**FUNCTIONAL REQUIREMENTS THAT ARE MEET:**

- There is a login panel for both user and admin.
- Stored Procedures are used for login in order to keep the security measures high. And saving from SQL Injection.
- User can only mark the attendance for batches assigned him/her.
- The reports can be generated either for individual student or for whole class
- The admin is responsible for all deleting and updating.
- Admin has rights for add/removing/updating teacher/student/batch
- Every student and teacher is having a unique Enrollment no.
- Admin can generate report for all batches and students.
- Jar file is also created to run the project

# Working of Present System

In the present system all work is done on paper. The whole session attendance is stored in register and at the end of the session the reports are generated. We are not interested in generating report in the middle of the session or as per the requirement because it takes more time in calculation. At the end of session the students who don&#39;t have 75% attendance get a notice.

# DISADVANTAGES OF PRESENT WORKING SYSTEM

1. Not User Friendly: The existing system is not user friendly because the retrieval of data is very slow and data is not maintained efficiently.
2. Difficulty in report generating: We require more calculations to generate the report so it is generated at the end of the session. And the student not get a single chance to improve their attendance
3. Manual control: All calculations to generate report is done manually so there is greater chance of errors.
4. Lots of paperwork: Existing system requires lot of paper work. Loss of even a single register/record led to difficult situation because all the papers are needed to generate the reports.
5. Time consuming: Every work is done manually so we cannot generate report in the middle of the session or as per the requirement because it is very time consuming.

# CHAREACTERSTIC OF THE PROPOSED SYSTEM

1. User Friendly: The proposed system is user friendly because the retrieval and storing of data is fast and data is maintained efficiently. Moreover the graphical user interface is provided in the proposed system, which provides user to deal with the system very easily.
2. Reports are easily generated: reports can be easily generated in the proposed system so user can generate the report as per the requirement (monthly) or in the middle of the session. User can give the notice to the students so he/she become regular.
3. Very less paper work: The proposed system requires very less paper work. All the data is feted into the computer immediately and reports can be generated through computers. Moreover work becomes very easy because there is no need to keep data on papers.
4. Computer operator control: Computer operator control will be there so no chance of errors. Moreover storing and retrieving of information is easy. So work can be done speedily and in time.

# HARDWARE/ SOFTWARE REQUIREMENTS

**Hardware**

1. A minimum computer system that will help you access all the tools in the courses is a Pentium 166 or better
2. 64 Megabytes of RAM or better
3. Windows 10
4. Java Virtual Machine

**Software**

Combination of the following Software&#39;s are to be used:

- Net Beans 8
- Java Development Kit (JDK)1.7
- SQL Server 2008
- ODBC
