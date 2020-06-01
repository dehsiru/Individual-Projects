-- -- Queries to populate the tables

--  USE db_tables;

-- INSERT INTO students VALUES (NULL,'Vasilis','Doyros','1993-01-18',2500.00);
-- INSERT INTO students VALUES (NULL,'Bobby', 'Shmurda','1993-07-03', 2250.0);
-- INSERT INTO students VALUES (NULL,'Antwnis', 'Peperis', '1980-12-14', 2150.0);
-- INSERT INTO students VALUES (NULL,'Kwstas', 'Tsotsoglou', '1991-11-29', 2500.0);
-- INSERT INTO students VALUES (NULL,'Makis','Tzitzis','1989-09-02', 2300.0);
-- INSERT INTO students VALUES (NULL,'Elissavet', 'Karathwma','1983-02-10', 2350.0);
-- INSERT INTO students VALUES (NULL,'Nicky', 'Tasoula','1987-06-23', 2500.0);
-- INSERT INTO students VALUES (NULL,'Thanasis', 'Kentimas', '1978-11-18', 2150.0);
-- INSERT INTO students VALUES (NULL,'Manwlis', 'Doudoumis', '1995-02-01', 2450.0);
-- INSERT INTO students VALUES (NULL,'Odysseas','Tasoylas','1993-06-03',2500.00);
-- INSERT INTO students VALUES (NULL,'Iwanna', 'Karanikola', '1990-01-18', 2300.0);
-- INSERT INTO students VALUES (NULL,'Elena', 'Mousouda', "1975-05-21", 2225.0);


-- INSERT INTO trainers VALUES (NULL, 'Nikos', 'Korompos', 'OOP');
-- INSERT INTO trainers VALUES (NULL, 'Arguris', 'Pagidas', 'SQL');
-- INSERT INTO trainers VALUES (NULL, 'George', 'Pasparakis', 'Full-Stack');
-- INSERT INTO trainers VALUES (NULL, 'Maria', 'Karapanou', 'Front-End');
-- INSERT INTO trainers VALUES (NULL, 'Dafni', 'Katsara', 'Git');
-- INSERT INTO trainers VALUES (NULL, 'Antwnios', 'Petrakis', 'Spring-Boot');
-- INSERT INTO trainers VALUES (NULL, 'Sakura', 'Konoha', 'Unit-Testing');
-- INSERT INTO trainers VALUES (NULL, 'Penny', 'Antwniadou', 'C#');
-- INSERT INTO trainers VALUES (NULL, 'George', 'Michaelides', 'InnoDb');
-- INSERT INTO trainers VALUES (NULL, 'Apostolis', 'Tsiantis', 'Javascript');

--  INSERT INTO courses VALUES (NULL, 'CB9', 'JAVA', 'Full Time', '2019-11-02','2020-02-02');
--  INSERT INTO courses VALUES (NULL, 'CB10', 'C#', 'Full Time', '2019-11-02','2020-02-02');
--  INSERT INTO courses VALUES (NULL, 'CB11', 'JAVA', 'Part Time', '2019-12-02','2020-05-02');
-- INSERT INTO courses VALUES (NULL, 'CB12', 'C#', 'Parassignmentst Time', '2019-12-02','2020-05-02');


--  INSERT INTO assignments VALUES(NULL, 'Assignment Part A ', 'Build a calcucator.', '2019-12-02', 0, 0, 0);
--  INSERT INTO assignments VALUES(NULL, 'Assignment Part B ', 'Build SQL database.', '2020-01-02', 0, 0, 0 );
--  INSERT INTO assignments VALUES(NULL, 'Assignment Part C', 'Build a front-end responsive webpage.', '2020-02-02', 0 ,0, 0);
--  INSERT INTO assignments VALUES(NULL, 'Assignment Part D ', 'Build a web-based application.', '2020-03-02',  0 ,0, 0);
--  INSERT INTO assignments VALUES(NULL, 'Assignment Part E ', 'Build a full stack project in Java.', '2020-04-02', 0 ,0, 0);

--  INSERT INTO trainers_per_course VALUES(1,1);
--  INSERT INTO trainers_per_course VALUES(2,2);
--  INSERT INTO trainers_per_course VALUES(3,3);
--  INSERT INTO trainers_per_course VALUES(4,4);
--  INSERT INTO trainers_per_course VALUES(5,2);
--  INSERT INTO trainers_per_course VALUES(6,3);
--  INSERT INTO trainers_per_course VALUES(7,1);
--  INSERT INTO trainers_per_course VALUES(5,3);

-- INSERT INTO students_per_course VALUES (1,1);
-- INSERT INTO students_per_course VALUES (2,2);
-- INSERT INTO students_per_course VALUES (3,3);
-- INSERT INTO students_per_course VALUES (4,4);
-- INSERT INTO students_per_course VALUES (5,1);
-- INSERT INTO students_per_course VALUES (6,1);
-- INSERT INTO students_per_course VALUES (7,2);
-- INSERT INTO students_per_course VALUES (8,3);
-- INSERT INTO students_per_course VALUES (9,4);
-- INSERT INTO students_per_course VALUES (10,2);
-- INSERT INTO students_per_course VALUES (11,1);
-- INSERT INTO students_per_course VALUES (12,4);
-- INSERT INTO students_per_course VALUES (3,1);
-- INSERT INTO students_per_course VALUES (4,2);

-- INSERT INTO assignments_per_student_per_course VALUES(1,1,1);
-- INSERT INTO assignments_per_student_per_course VALUES(2,1,1);
-- INSERT INTO assignments_per_student_per_course VALUES(3,1,1);
-- INSERT INTO assignments_per_student_per_course VALUES(4,1,1);
-- INSERT INTO assignments_per_student_per_course VALUES(5,1,1);
-- INSERT INTO assignments_per_student_per_course VALUES(1,2,2);
-- INSERT INTO assignments_per_student_per_course VALUES(2,2,2);
-- INSERT INTO assignments_per_student_per_course VALUES(2,2,3);
-- INSERT INTO assignments_per_student_per_course VALUES(4,3,4);
-- INSERT INTO assignments_per_student_per_course VALUES(4,4,4);
-- INSERT INTO assignments_per_student_per_course VALUES(3,4,3);
-- INSERT INTO assignments_per_student_per_course VALUES(3,5,3);
-- INSERT INTO assignments_per_student_per_course VALUES(3,6,3);
-- INSERT INTO assignments_per_student_per_course VALUES(5,8,4);
-- INSERT INTO assignments_per_student_per_course VALUES(3,6,2);
-- INSERT INTO assignments_per_student_per_course VALUES(4,6,2);
-- INSERT INTO assignments_per_student_per_course VALUES(1,4,1);

-- -------------------------------------------------------------------------------------

-- -- query for students per course
-- SELECT s.st_firstname, s.st_lastname, c.cs_title, c.cs_stream, c.cs_type
-- FROM students as s, courses as c, students_per_course as spc
-- WHERE s.st_id = spc.student_id AND c.cs_id = spc.course_id
-- ORDER BY c.cs_stream,cs_type;

-- -- query for trainers per course
-- SELECT t.tr_firstname, t.tr_lastname, t.tr_subject, c.cs_title, c.cs_stream, c.cs_type
-- FROM trainers as t INNER JOIN trainers_per_course
-- ON t.tr_id = trainers_per_course.trainer_id INNER JOIN courses as c 
-- ON c.cs_id = trainers_per_course.course_id
-- ORDER BY cs_stream;


-- -- query for assignment per course per student
-- SELECT  assi.as_title, c.cs_title , c.cs_type , s.st_firstname , s.st_lastname
-- FROM courses as c, assignments as assi, students as s, assignments_per_student_per_course as apspc
-- WHERE s.st_id = apspc.student_id AND c.cs_id = apspc.course_id AND assi.as_id=apspc.assignment_id
-- ORDER by c.cs_title;

-- -- query students that belong to more than one courses 
-- SELECT s.st_firstname, s.st_lastname, COUNT(spc.student_id) AS Courses
-- FROM students_per_course as spc
-- LEFT JOIN students as s
-- On spc.student_id = s.st_id
-- GROUP BY spc.student_id HAVING COUNT(spc.student_id)>1 ; 

