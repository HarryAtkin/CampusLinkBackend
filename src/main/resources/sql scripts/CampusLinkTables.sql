create database CampusLink;

create table university (
	universityID SERIAL PRIMARY KEY NOT NULL,
	uni_name VARCHAR(255),
	uni_address VARCHAR(255),
);
create table account (
	AccountID SERIAL PRIMARY KEY NOT NULL,
	universityID INT,
	Email VARCHAR(255) REFERENCES student(email),
	password VARCHAR(255),
	role VARCHAR(10)
);
create table student (
    studentID SERIAL PRIMARY KEY NOT NULL,
    lName VARCHAR(255),
    fName VARCHAR(255),
    Email VARCHAR(255),
    DOB DATE
);
create table teacher (
	teacherID SERIAL PRIMARY KEY NOT NULL,
	accountID INT,
	PRIMARY KEY(teacherID),
	FOREIGN KEY (accountID) REFERENCES account(accountID)
);
create table module (
	moduleID SERIAL PRIMARY KEY NOT NULL,
	name VARCHAR(255),
);
create table room (
	roomNo CHAR(6),
	capacity INT,
);
create table lesson (
	lessonID SERIAL PRIMARY KEY NOT NULL,
	moduleID INT,
	roomNo CHAR(6),
	startTime DATETIME,
	endTime DATETIME,
	FOREIGN KEY(moduleID) REFERENCES module(moduleID),
	FOREIGN KEY(roomNo) REFERENCES room(roomNo)
);
create table student_lesson (
	studentID SERIAL PRIMARY KEY NOT NULL,
	lessonID SERIAL PRIMARY KEY NOT NULL,
	attendance BOOLEAN,
	reason VARCHAR(255),
	FOREIGN KEY(studentID) REFERENCES student(studentID),
	FOREIGN KEY(lessonID) REFERENCES lesson(lessonID)
);
create table module_student (
	moduleID SERIAL PRIMARY KEY NOT NULL,
	studentID SERIAL PRIMARY KEY NOT NULL,
	FOREIGN KEY(studentID) REFERENCES student(studentID),
	FOREIGN KEY(moduleID) REFERENCES module(moduleID)
);
create table module_teacher (
	moduleID SERIAL PRIMARY KEY NOT NULL,
	teacherID SERIAL PRIMARY KEY NOT NULL,,
	FOREIGN KEY(teacherID) REFERENCES teacher(teacherID),
	FOREIGN KEY(moduleID) REFERENCES module(moduleID)
);
create table chatroom (
	chatroomID SERIAL PRIMARY KEY NOT NULL,
	moduleID INT,
	FOREIGN KEY(moduleID) REFERENCES module(moduleID)
);
create table annoucement (
	annoucementID SERIAL PRIMARY KEY NOT NULL,
	chatroomID INT,
	teacherID INT,
	datePosted DATETIME,
	annoucement_title VARCHAR(255),
	annoucement_description TEXT,
	FOREIGN KEY(chatroomID) REFERENCES chatroom(chatroomID),
	FOREIGN KEY(teacherID) REFERENCES teacher(teacherID)
);
create table comment (
	commentID SERIAL PRIMARY KEY NOT NULL,
	annoucementID INT,
	accountID INT,
	message TEXT,
	datePosted DATETIME,
	FOREIGN KEY (annoucementID) REFERENCES annoucement(annoucementID),
	FOREIGN KEY (accountID) REFERENCES account(accountID)
);