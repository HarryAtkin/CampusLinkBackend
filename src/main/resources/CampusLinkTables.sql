create database CampusLink;

create table university (
	universityID INT NOT NULL AUTO_INCREMENT,
	uni_name VARCHAR(255),
	uni_address VARCHAR(255),
    PRIMARY KEY (universityID)
);
create table account (
	accountID INT NOT NULL AUTO_INCREMENT,
	universityID INT,
	email VARCHAR(255),
	password VARCHAR(255),
	role ENUM('Student', 'Teacher', 'Admin'),
	fname VARCHAR(50),
	lname VARCHAR(50),
	DOB DATE,
    PRIMARY KEY(accountID),
    FOREIGN KEY (universityID) REFERENCES university(universityID)
);
create table student (
    studentID INT NOT NULL AUTO_INCREMENT,
	accountID INT,
	PRIMARY KEY(studentID),
	FOREIGN KEY (accountID) REFERENCES account(accountID)
);
create table teacher (
	teacherID INT NOT NULL AUTO_INCREMENT,
	accountID INT,
	PRIMARY KEY(teacherID),
	FOREIGN KEY (accountID) REFERENCES account(accountID)
);
create table module (
	moduleID INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255),
	PRIMARY KEY(moduleID)
);
create table room (
	roomNo CHAR(6),
	capacity INT,
	PRIMARY KEY(roomNo)
);
create table lesson (
	lessonID INT NOT NULL AUTO_INCREMENT,
	moduleID INT,
	roomNo CHAR(6),
	startTime DATETIME,
	endTime DATETIME,
	PRIMARY KEY(lessonID),
	FOREIGN KEY(moduleID) REFERENCES module(moduleID),
	FOREIGN KEY(roomNo) REFERENCES room(roomNo)
);
create table student_lesson (
	studentID INT,
	lessonID INT,
	attendance BOOLEAN,
	reason VARCHAR(255),
	PRIMARY KEY(studentID, lessonID),
	FOREIGN KEY(studentID) REFERENCES student(studentID),
	FOREIGN KEY(lessonID) REFERENCES lesson(lessonID)
);
create table module_student (
	moduleID INT,
	studentID INT,
	PRIMARY KEY(moduleID, studentID),
	FOREIGN KEY(studentID) REFERENCES student(studentID),
	FOREIGN KEY(moduleID) REFERENCES module(moduleID)
);
create table module_teacher (
	moduleID INT,
	teacherID INT,
	PRIMARY KEY(moduleID, teacherID),
	FOREIGN KEY(teacherID) REFERENCES teacher(teacherID),
	FOREIGN KEY(moduleID) REFERENCES module(moduleID)
);
create table chatroom (
	chatroomID INT NOT NULL AUTO_INCREMENT,
	moduleID INT,
	PRIMARY KEY(chatroomID),
	FOREIGN KEY(moduleID) REFERENCES module(moduleID)
);
create table annoucement (
	annoucementID INT NOT NULL AUTO_INCREMENT,
	chatroomID INT,
	teacherID INT,
	datePosted DATETIME,
	annoucement_title VARCHAR(255),
	annoucement_description TEXT,
	PRIMARY KEY(annoucementID),
	FOREIGN KEY(chatroomID) REFERENCES chatroom(chatroomID),
	FOREIGN KEY(teacherID) REFERENCES teacher(teacherID)
);
create table comment (
	commentID INT NOT NULL AUTO_INCREMENT,
	annoucementID INT,
	accountID INT,
	message TEXT,
	datePosted DATETIME,
	PRIMARY KEY(commmentID, annoucementID, accountID),
	FOREIGN KEY (annoucementID) REFERENCES annoucement(annoucementID),
	FOREIGN KEY (accountID) REFERENCES account(accountID)
);