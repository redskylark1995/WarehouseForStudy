#外键
CREATE TABLE demo_emp(
 emp_id INT,
 dept_id int,
 PRIMARY KEY (emp_id),
 FOREIGN KEY(dept_id) REFERENCES t_demo_dept(dept_id)
 

);