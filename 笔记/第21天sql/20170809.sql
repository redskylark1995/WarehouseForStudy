#创建职员表
/*create table t_demo_employee(
    emp_id int auto_increment primary key,
    emp_name varchar(50),
    emp_gender varchar(1),
    emp_dept varchar(20),
    emp_posit varchar(20),
    emp_salary double
);*/
#desc t_demo_employee;

#修改表添加列：出生年月、入职时间、绩效工资；
-- alter table t_demo_employee add column(
--     emp_birthday date,
--     emp_inwork_time datetime,
--     emp_perf_salary double
-- );

 #批量插入多个职员数据，插入数据的列：姓名、性别、部门、职位、出生年月、入职时间；
-- insert into t_demo_employee(emp_name,emp_gender,emp_dept,
--     emp_posit,emp_birthday,emp_inwork_time) values
--         ('张四','男','技术部','普通员工','1995-02-28','2017-06-06 09:00:00'),
--         ('李思','女','技术部','普通员工','1990-03-28','2017-06-06 09:00:00'),
--         ('王武','男','市场部','普通员工','1990-04-28','2017-06-06 09:00:00'),
--         ('王武','女','财务部','普通员工','1995-05-28','2017-06-06 09:00:00'),
--         ('赵流','男','行政部','普通员工','1990-06-28','2017-06-06 09:00:00'),
--         ('田七','女','行政部','普通员工','1995-08-28','2017-06-06 09:00:00'),
--         ('孙俪','女','技术部','普通员工','1992-09-28','2017-06-06 09:00:00'),
--         ('刘毅','男','市场部','普通员工','1995-10-28','2017-06-06 09:00:00');

-- 修改职员的基本工资：
-- 
--              财务部  4000
-- 
--              技术部  6000
-- 
--              市场部  2000
-- 
--              行政部  3500
-- update t_demo_employee set emp_salary=4000 where emp_dept='财务部';
-- update t_demo_employee set emp_salary=6000 where emp_dept='技术部';
-- update t_demo_employee set emp_salary=2000 where emp_dept='市场部';
-- update t_demo_employee set emp_salary=3500 where emp_dept='行政部';

#修改职员的绩效工资，自定义
-- update t_demo_employee set emp_perf_salary=3000 where emp_id>1 && emp_id<6;
-- update t_demo_employee set emp_perf_salary=2500 where emp_id=9 or emp_id=10;

#查询技术部男性职员的数据；
-- select * from t_demo_employee where emp_dept='技术部' and emp_gender='男';

#创建表时，设置外键约束
-- drop table if exists t_demo_emp;
-- create table t_demo_emp(
--     emp_id int,
--     dept_id int,
--     primary key(emp_id),
--     constraint fk_dept_emp_0001 foreign key(dept_id) references t_demo_dept(dept_id)
-- );

#删除外键约束
#alter table t_demo_emp drop foreign key fk_dept_emp_0001;

#表创建后，添加外键
#alter table t_demo_emp add constraint fk_dept_emp_0002 foreign key(dept_id) references t_demo_dept(dept_id);

#alter table t_demo_dept add unique(dept_number)

#order by
#按工资升序排序
#select * from t_demo_employee order by emp_salary desc, emp_birthday asc;


#复合查询
#select emp_name, emp_gender, emps.emp_salary from (select * from t_demo_employee) as emps;


#子查询
#查询出ID为3、4、5的职员数据
#select * from t_demo_employee where emp_id=3 or emp_id=4 or emp_id=5;
#select * from t_demo_employee where emp_id in(3,4,5);
#select * from t_demo_employee where dept_id in(select dept_id from t_demo_dept where dept_name='技术部');

#exsits
#select * from t_demo_employee where exists(select * from t_demo_dept where dept_name='技术部');

#select * from t_demo_employee where false;

#查询出技术部工资最高职员，修改职位为“部门经理”
-- update t_demo_employee set emp_posit='部门经理' 
--     where emp_id in(select emp_id from (select emp_id from t_demo_employee 
--         order by emp_salary+emp_perf_salary desc limit 1) emps);

#统计所有职员的工资信息
#select count(*), sum(emp_salary), avg(emp_salary), max(emp_salary), min(emp_salary) from t_demo_employee;

#统计部门工资数据
-- select dept_id 部门ID, emp_gender 性别, count(*) 人数, sum(emp_salary+emp_perf_salary) 总工资,
--      avg(emp_salary+emp_perf_salary) 平均工资 from t_demo_employee group by dept_id, emp_gender;

#having
#按部门统计工资数据，筛选出部门ID=3的数据
-- select dept_id 部门ID, count(*) 人数, sum(emp_salary+emp_perf_salary) 总工资,
--      avg(emp_salary+emp_perf_salary) 平均工资 from t_demo_employee 
--           group by dept_id having dept_id=3; #having 后的列必须是group by后指定的列

#统计部门总工资>15000的工资数据
-- select dept_id 部门ID, count(*) 人数, sum(emp_salary+emp_perf_salary) 总工资,
--      avg(emp_salary+emp_perf_salary) 平均工资 from t_demo_employee 
--           group by dept_id having sum(emp_salary+emp_perf_salary)>15000;

#统计技术部的工资数据
-- select dept_id 部门ID, count(*) 人数, sum(emp_salary+emp_perf_salary) 总工资,
--      avg(emp_salary+emp_perf_salary) 平均工资 from t_demo_employee 
--            group by dept_id having dept_id in(
--                select dept_id from t_demo_dept where dept_name='技术部');

#查询出每个部门工资最高职员，修改职位为“部门经理”

#查询出每个部门工资最高职员的ID
-- select emp_id from t_demo_employee where concat(dept_id,'_',emp_salary+emp_perf_salary) 
--      in(select concat(dept_id,'_',max(emp_salary+emp_perf_salary)) 
--           from t_demo_employee group by dept_id);

#SELECT concat('abc','efg','****');
#select * from t_demo_employee where 1 in(1,3);

#修改职位为“部门经理”
-- update t_demo_employee set emp_posit='部门经理' where 
--        concat(dept_id,'_',emp_salary+emp_perf_salary) 
--            in (select * from (select concat(dept_id,'_',
--                    max(emp_salary+emp_perf_salary)) 
--                from t_demo_employee group by dept_id) as a);

#排除重复项
#select distinct emp_name from t_demo_employee;

#操作符 BETWEEN ... AND 会选取介于两个值之间的数据范围。
#select * from t_demo_employee WHERE emp_birthday between '1990-04-28' and '1995-02-28';
#select * from t_demo_employee WHERE emp_birthday>='1990-04-28' and emp_birthday<='1995-02-28';

#like与通配符 实现模糊查询
#select * from t_demo_employee where emp_name like '王%';
#select * from t_demo_employee where emp_name like '王__';
#select * from t_demo_employee where emp_name like '%三%';

#正则表达式
#select * from t_demo_employee where emp_name REGEXP '^张[^A-Za-z0-9]*$';

#等值连接
#select * from t_demo_dept d, t_demo_employee e where d.dept_id=e.dept_id;

#内连接
#select * from t_demo_dept d inner join t_demo_employee e on d.dept_id=e.dept_id where emp_gender='女';

#外连接
#左外连接   保证查询出左边表所有行
#select * from t_demo_dept d left outer join t_demo_employee e on d.dept_id=e.dept_id; 
#右外连接   保证查询出右边表所有行
#select * from t_demo_dept d right join t_demo_employee e on d.dept_id=e.dept_id;
#全连接   保证查询出两边表所有行
#select * from t_demo_dept d full join t_demo_employee e on d.dept_id=e.dept_id; #mysql不支持
-- select * from t_demo_dept d left outer join t_demo_employee e on d.dept_id=e.dept_id
-- union
-- select * from t_demo_dept d right join t_demo_employee e on d.dept_id=e.dept_id;

#自然连接  保证表中有相同列名、类型的列，若未相同的，返回笛卡尔集。
select * from t_demo_dept natural join t_demo_employee;






























