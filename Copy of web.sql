CREATE TABLE `USER` (
	`Key`	PK	NOT NULL	COMMENT '사용자 구별',
	`Auth`	PK	NOT NULL,
	`userName`	PK	NOT NULL,
	`userPW`	VARCHAR(255)	NOT NULL,
	`userPhone`	VARCHAR(255)	NULL,
	`Email`	VARCHAR(255)	NULL,
	`address`	VARCHAR(255)	NOT NULL,
	`detail`	VARCHAR(255)	NULL
);

CREATE TABLE `rantal` (
	`Key`	PK	NOT NULL	COMMENT '사용자 구별',
	`Auth`	PK	NOT NULL,
	`userName`	PK	NOT NULL,
	`Post`	VARCHAR(255)	NULL,
	`Product`	VARCHAR(255)	NULL,
	`Price`	VARCHAR(255)	NULL,
	`Type`	VARCHAR(255)	NULL
);

CREATE TABLE `Term` (
	`SemesterCode`	VARCHAR(255)	NOT NULL,
	`Semester`	VARCHAR(255)	NULL,
	`Subject`	VARCHAR(255)	NULL,
	`Mon`	VARCHAR(255)	NULL,
	`Tue`	VARCHAR(255)	NULL,
	`Wed`	VARCHAR(255)	NULL,
	`Thu`	VARCHAR(255)	NULL,
	`Fri`	VARCHAR(255)	NULL
);

CREATE TABLE `ClassRoom` (
	`교양`	VARCHAR(255)	NULL,
	`전공`	VARCHAR(255)	NULL,
	`교양1`	VARCHAR(255)	NULL,
	`SemesterCode`	VARCHAR(255)	NOT NULL
);

CREATE TABLE `Course` (
	`CourseCode`	VARCHAR(255)	NOT NULL,
	`CourseName`	VARCHAR(255)	NULL,
	`ClassNumber`	VARCHAR(255)	NULL
);

CREATE TABLE `Subject` (
	`SubjectCode`	VARCHAR(255)	NOT NULL,
	`TeacherCode`	VARCHAR(255)	NOT NULL,
	`CourseCode`	VARCHAR(255)	NOT NULL,
	`Subject Name`	VARCHAR(255)	NULL,
	`SubjectCredit`	VARCHAR(255)	NOT NULL
);

CREATE TABLE `Teacher` (
	`TeacherCode`	VARCHAR(255)	NOT NULL,
	`TeacherName`	PJ	NULL
);

CREATE TABLE `TimeTable` (
	`SutjectAssignment`	VARCHAR(255)	NOT NULL,
	`RoomAssignment`	VARCHAR(255)	NOT NULL,
	`TeacherAssignment`	VARCHAR(255)	NOT NULL,
	`SemesterCode`	VARCHAR(255)	NOT NULL,
	`SubjectCode`	VARCHAR(255)	NOT NULL,
	`WeekDay`	VARCHAR(255)	NULL,
	`Time`	VARCHAR(255)	NULL
);

CREATE TABLE `main rental` (
	`Key`	PJ	NOT NULL,
	`contect`	VARCHAR(255)	NULL,
	`img`	VARCHAR(255)	NULL,
	`good`	VARCHAR(255)	NULL,
	`Key2`	PK	NOT NULL	COMMENT '사용자 구별',
	`Auth`	PK	NOT NULL,
	`userName`	PK	NOT NULL
);

CREATE TABLE `Auth` (
	`steff`	PK	NOT NULL,
	`Auth`	PK	NOT NULL,
	`admin`	VARCHAR(255)	NULL,
	`sup`	VARCHAR(255)	NULL,
	`prid`	VARCHAR(255)	NULL,
	`nomal`	VARCHAR(255)	NULL
);

CREATE TABLE `announcement` (
	`steff`	PK	NOT NULL,
	`division`	VARCHAR(255)	NULL,
	`mainfield`	VARCHAR(255)	NULL,
	`file`	VARCHAR(255)	NULL,
	`img`	VARCHAR(255)	NULL
);

CREATE TABLE `usedmarket` (
	`Type`	VARCHAR(255)	NOT NULL,
	`Title`	VARCHAR(255)	NULL,
	`Main`	VARCHAR(255)	NULL
);

ALTER TABLE `USER` ADD CONSTRAINT `PK_USER` PRIMARY KEY (
	`Key`,
	`Auth`,
	`userName`
);

ALTER TABLE `Term` ADD CONSTRAINT `PK_TERM` PRIMARY KEY (
	`SemesterCode`
);

ALTER TABLE `Course` ADD CONSTRAINT `PK_COURSE` PRIMARY KEY (
	`CourseCode`
);

ALTER TABLE `Subject` ADD CONSTRAINT `PK_SUBJECT` PRIMARY KEY (
	`SubjectCode`
);

ALTER TABLE `Teacher` ADD CONSTRAINT `PK_TEACHER` PRIMARY KEY (
	`TeacherCode`
);

ALTER TABLE `TimeTable` ADD CONSTRAINT `PK_TIMETABLE` PRIMARY KEY (
	`SutjectAssignment`,
	`RoomAssignment`,
	`TeacherAssignment`
);

ALTER TABLE `main rental` ADD CONSTRAINT `PK_MAIN RENTAL` PRIMARY KEY (
	`Key`
);

ALTER TABLE `Auth` ADD CONSTRAINT `PK_AUTH` PRIMARY KEY (
	`steff`
);

ALTER TABLE `usedmarket` ADD CONSTRAINT `PK_USEDMARKET` PRIMARY KEY (
	`Type`
);

