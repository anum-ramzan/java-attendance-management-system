# java-attendance-management-system
**Table of Content**

| Project Briefing                       | 3  |
|----------------------------------------|----|
| Customer Requirements                  | 4  |
| Functional Requirements That Are Meet: | 5  |
| Comparison Between Past and Present    | 6  |
| Hardware/ Software Requirements        | 7  |
| Data Flow Diagram                      | 8  |
| Application Flowchart                  | 9  |
| Sql Queries                            | 10 |
| Application Features                   | 12 |

**PROJECT BRIEFING**

Attendance Management System is software developed for daily student attendance
in schools, colleges and institutes.

It facilitates to access the attendance information of a particular student in a
particular class.

The information is sorted by the operators, which will be provided by the
teacher for a particular class.

This system will also help in evaluating attendance eligibility criteria of a
student.

**PURPOSE**

The purpose of developing attendance management system is to computerized the
tradition way of taking attendance.

Another purpose for developing this software is to generate the custom report at
the end of the session or in the between of the session.

Another reason for developing this project is to enhance our learning skill and
applying the application in the required area.

**CUSTOMER REQUIREMENTS**

The proposed system should be user friendly, the retrieval and storing of data
should be fast and data should be maintained efficiently. Moreover the graphical
user interface should be provided in the proposed system, which provides user to
deal with the system very easily. The proposed system requires very less paper
work. All the data is feted into the computer immediately and reports can be
generated through computers. Moreover work become very easy because there is no
need to keep data on papers.

-   First Frame will be of Class Batch Code Registration in which the user can
    add new batch code, teacher name and subject, Batch days ( TTS , MWF ) and
    batch timings (9 to 11,11 to 1, 3 to 5, 5 to 7 , 7 to 9) etc.

-   Second Frame will be of Students Registration where user can add the
    information about the student Example Details of a Student are as follows

1.  Enrollment No.

2.  Student Name

3.  Student Batch Code

Make the required database table for both Batch Code Registration and Student
Registration Frame in the systematic order with following the table
normalization rules.

-   After all registrations a Attendance frame will be created where teacher
    will select the Present student from the student names list in a particular
    batch code after this , enrollment no would be automatically displayed of
    that particular student. On clicking Mark Attendance Button, the attendance
    should be marked.

>   Note: Record of time and date of attendance marking is necessary of every
>   student.

Make the required database table for Attendance frame in the systematic order
with following the table normalization rules.

-   Reports can be easily generated in the proposed system so teacher can
    generate the report as per the requirement (monthly) or in the middle of the
    session. So teacher can give the notice to the students so he/she become
    regular. Required Reports are as follows

1.  Monthly Students Wise Present and Absent Report

2.  Export the above Report in Excel Sheet.

**FUNCTIONAL REQUIREMENTS THAT ARE MEET**

-   There is a login panel for both user and admin.

-   Stored Procedures are used for login in order to keep the security measures
    high. And saving from SQL Injection.

-   User can only mark the attendance for batches assigned him/her.

-   The reports can be generated either for individual student or for whole
    class

-   The admin is responsible for all deleting and updating.

-   Admin has rights for add/removing/updating teacher/student/batch

-   Every student and teacher is having a unique Enrollment no.

-   Admin can generate report for all batches and students.

-   Jar file is also created to run the project

**WORKING OF PRESENT SYSTEM**

 In the present system all work is done on paper. The whole session attendance is stored in register and at the end of the session the reports are generated. We are not interested in generating report in the middle of the session or as per the requirement because it takes more time in calculation. At the end of session the students who don’t have 75% attendance get a notice. 

DISADVANTAGES OF PRESENT WORKING SYSTEM 

-   Not User Friendly: The existing system is not user friendly because the
    retrieval of data is very slow and data is not maintained efficiently.

-   Difficulty in report generating: We require more calculations to generate
    the report so it is generated at the end of the session. And the student not
    get a single chance to improve their attendance

-   Manual control: All calculations to generate report is done manually so
    there is greater chance of errors.

-   Lots of paperwork: Existing system requires lot of paper work. Loss of even
    a single register/record led to difficult situation because all the papers
    are needed to generate the reports.

-   Time consuming: Every work is done manually so we cannot generate report in
    the middle of the session or as per the requirement because it is very time
    consuming.

ADVANTAGES OF THE PROPOSED SYSTEM

-   User Friendly: The proposed system is user friendly because the retrieval
    and storing of data is fast and data is maintained efficiently. Moreover the
    graphical user interface is provided in the proposed system, which provides
    user to deal with the system very easily.

-   Reports are easily generated: reports can be easily generated in the
    proposed system so user can generate the report as per the requirement
    (monthly) or in the middle of the session. User can give the notice to the
    students so he/she become regular.

-   Very less paper work: The proposed system requires very less paper work. All
    the data is feted into the computer immediately and reports can be generated
    through computers. Moreover work becomes very easy because there is no need
    to keep data on papers.

-   Computer operator control: Computer operator control will be there so no
    chance of errors. Moreover storing and retrieving of information is easy. So
    work can be done speedily and in time.

**HARDWARE/ SOFTWARE REQUIREMENTS**

**Hardware**

1.  Windows 10

2.  Java Virtual Machine

**Software**

Combination of the following Software’s are to be used:

-   Net Beans 8

-   Java Development Kit (JDK)1.7

-   SQL Server 2008

-   ODBC

**DATA FLOW DIAGRAM**

![](media/a9bb77fdd669fcbe00d0769b0ba9e03b.png)

**APPLICATION FLOWCHART**

![](media/143c56d18cb376cf5b5f3ae7c23072c5.png)

**SQL QUERIES**

![](media/fd11eab8201798eef35020cade5da1c3.png)

**APPLICATION FEATURES**

Main frame

![](media/3497594e115870964f89e0069037c9ed.png)

User Login and Admin login

![](media/fbf31383a6888a8d13022c7044519db5.png)

User (teacher) login Panel

Admin login

![](media/b1a8fc34448def5b58e4ad7088f5eae9.png)

If the username and Password is correct it will show welcome message but if
username or password is incorrect then it will show error message

User main frame after login

Here only signed in user batches will appear

The student and class buttons are disabled. They will enable when user will
select the batch code and press the next button

![](media/6f90433074d8cb6555014d0a05e2e90c.png)

After selecting batch and clicking next button student and class button will be
visible

![](media/31f367639ebb2dd19b743669e855b3f6.png)

For individual attendance teacher can select Student and for whole class
attendance can be marked

Student Attendance

![](media/747bcd64c23c68f082981e71d8999ed4.png)

User can select Student name from combo box student id, student batch, teacher
name, student days and timings are filled automatically

![](media/4e76c5ffae0b0444b172afc0e7281632.png)

Class Attendance Frame

![](media/a6de59b1abdc25c2d7cab24149ee033b.png)

Semester Name will be filled automatically through batch code

User will select the date and by clicking on table button the batch student will
appear

And by checking the box present will be marked and by through uncheck absent
will be marked

![](media/add9cc967a23bdeaa6dee0271d8b7547.png)

Table Button will fetch the data and mark button will mark the student
attendance and will show message

![](media/587a8ad680cef9656acdd6c008a29e27.png)

User cannot mark attendance for future dates if he/she do so then a popup
message will appear

![](media/ee0bb59de5224ac3773de9cb96718447.png)

And Mark attendance button will become disable to user until and unless user
chooser current date or pervious date

![](media/0501f74fa66e1b14460b8f29b878ec77.png)

To mark absent student attendance user can use Mark Absent Student Attendance
Button

![](media/569c9b90ef8c49b0965f638698179880.png)

Through this frame user can mark absentees attendance only

![](media/639558a72875b1787c556f4fd059d6ee.png)

It will only ask for date on which user can mark absentees’ attendance

As soon as user select the date book and session will be fill out

![](media/7fedf2b5fce9d25ae1f3750d2263f423.png)

And the in the same way user will fetch the data and mark attendance for
absentees’

![](media/2f3c9bd030044b1f3dcd3622f63db5d2.png)

User can go back through this arrow button

Reports can be generated either through excel or pdf

![](media/29bf5f89012c891628651534fa3b59eb.png)

This is whole batch report

![](media/d400c9fb17df16f307a828c490166502.png)

For custom report user can use search enter and combo to select

![](media/257d791fe98e8e4908e6a4c5059de2eb.png)

![](media/e5a1578d8648e3800c214700b6940a45.png)

Teacher can change pass and other information through setting

![](media/431844f08c1b352eb69a30ab80f7c351.png)

Save button will show this message if all the information is entered correctly

![](media/30491eb66588a0cf49ed407465cbc075.png)

Else it will show error

![](media/e7295c5a9266c7896a95b179d2890b34.png)

![](media/3a53595a57b1b457008bc607e95516af.png)

>   This arrow takes back to the batch selection frame

![](media/4486e579c8f62b2a6f53c86bbeea1fae.png)

Through exit button teacher will close the windows and Sign Out

**Admin Frame**

![](media/a76cbd49dc5def1e0b51518035b08b72.png)

.

Teacher Button will open Teacher’s Frame

From here new teacher can be added and details can also be seen.

Validation is applied

![](media/0ae312ad8005f7af23e74b56953be833.png)

Add button will add new teacher

Remove button will remove the teacher

Update button will update the teacher information

Clear button will clear the text fields

View all button will show all the teacher in the table

Student Button will open student Frame

From here new student can be added and details can also be seen.

Validation is applied

![](media/e14ee11761e8d73172ca6e00bc09cbb4.png)

As admin select the Batch for student, student timing, days, semester, and book
will fill out automatically

![](media/ab94d4684a4bc0f716862c6492ecbb1f.png)

Add button will add new student

Remove button will remove the student

Update button will update the student information

Clear button will clear the text fields

View all button will show all the student in the table

Batch Button will open batch’s frame

From here new batch can be added and details can also be seen.

Validation is applied

![](media/e749fc6ce51a0530a8e631cfff6b43e4.png)

Add button will add new batch

Remove button will remove the batch

Update button will update the batch information

Clear button will clear the text fields

View all batch will show all the teacher in the table

By Clicking on DashBorad Button main window appear

![](media/e2b8d4274f4ef1e1fcd7ae0f7bfc04c6.png)

Reporting can be done in four different

-   Firstly admin can get the all batches report

-   Secondly Student and batch report

-   Thirdly all batches with custom date

-   And lastly selected batch with custom date

    Ways through three different means

-   Excel file

-   PDF file

-   Print Command

![](media/ee955fa7d440f64fcc2ab8b21871d8c1.png)

![](media/e8c22eb7cf2c1d263e588d4e64033afc.png)

Admin panel will be close by this
