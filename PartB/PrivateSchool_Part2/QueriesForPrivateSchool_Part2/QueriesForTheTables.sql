-- CREATE DATABASE db_tables;

--  USE db_tables;

-- CREATE TABLE IF NOT EXISTS students(
-- 	st_id INT AUTO_INCREMENT PRIMARY KEY,
--  st_firstname VARCHAR(25),
-- 	st_lastname VARCHAR(25),
-- 	st_dateofbirth DATE,
--  st_tuitionfees DECIMAL(6,2)
-- );

-- CREATE TABLE IF NOT EXISTS trainers(
-- 	tr_id INT AUTO_INCREMENT PRIMARY KEY,
--  tr_firstname VARCHAR(25),
--  tr_lastname VARCHAR(25),
--  tr_subject VARCHAR(25)
-- );

-- CREATE TABLE IF NOT EXISTS courses(
-- 	cs_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
-- 	cs_title VARCHAR(10),
-- 	cs_stream VARCHAR(10),
-- 	cs_type VARCHAR(10),
-- 	cs_startdate DATE,
-- 	cs_enddate DATE
-- );

-- CREATE TABLE IF NOT EXISTS assignments(
-- 	as_id INT AUTO_INCREMENT PRIMARY KEY,
-- 	as_title VARCHAR(35),
-- 	as_description VARCHAR(150),
--  as_subdatetime DATE,
--  as_oralmark DECIMAL(4,2),
--  as_writtenmark DECIMAL(4,2),
--  as_totalmark DECIMAL(5,2)
-- );	


-- CREATE TABLE IF NOT EXISTS students_per_course(
-- 	student_id INT NOT NULL, 
-- 	course_id INT NOT NULL,
-- 	PRIMARY KEY (student_id, course_id),
-- 	FOREIGN KEY (student_id) REFERENCES students (st_id),
-- 	FOREIGN KEY (course_id) REFERENCES courses (cs_id)
-- );


-- CREATE TABLE IF NOT EXISTS trainers_per_course(
-- 	trainer_id INT NOT NULL, 
-- 	course_id INT NOT NULL,
-- 	PRIMARY KEY (trainer_id, course_id),
-- 	FOREIGN KEY (trainer_id) REFERENCES trainers (tr_id),
-- 	FOREIGN KEY (course_id) REFERENCES courses (cs_id)
-- );

-- CREATE TABLE IF NOT EXISTS assignments_per_student_per_course(
--   assignment_id INT NOT NULL,
--   student_id INT NOT NULL,
--   course_id INT NOT NULL,
--   PRIMARY KEY (assignment_id, student_id, course_id),
--   FOREIGN KEY (assignment_id) REFERENCES assignments (as_id),
--   FOREIGN KEY (student_id) REFERENCES students (st_id),
--   FOREIGN KEY (course_id) REFERENCES courses (cs_id)
-- );