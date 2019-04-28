#select * from t_demo_student;
#查询学生的数据
#select * from t_demo_student;
#查询获得内容的长度
#SQL不区分大小写
/*select stu_name,  char_length(stu_name) 字符数, length(stu_name) 字节数, bit_length(stu_name) 位数,
    stu_gender, char_LENGTH(stu_gender) 字符数, LENGTH(stu_gender) 字节数, bit_length(stu_gender) 位数 from t_demo_student;*/


#判断表是否存在，存在将其删除
#drop table if exists t_demo_user;
#创建表
/*create table t_demo_user(
    user_id int primary key auto_increment,
    user_name varchar(50),
    user_gender varchar(1),
    user_birthday date,
    create_time datetime
);
*/
#修改表
#修改表名
#alter table t_demo_students rename t_demo_stu;
#查看表的结构
#desc t_demo_stu;

#添加字段
#alter table t_demo_user add temp1 varchar(50);
#alter table t_demo_user add temp2 varchar(50), add temp3 varchar(50);
#删除字段
#alter table t_demo_user drop temp1;
#alter table t_demo_user drop temp2, drop temp3;

#alter table t_demo_user add column(temp2 varchar(50), temp3 varchar(50));
#alter table t_demo_user drop temp2, drop temp3;

#修改字段
#alter table t_demo_user add column(temp1 int, temp2 bigint, temp3 float);

#修改列名
#alter table t_demo_user change temp11 temp1 double;
#修改属性
#alter table t_demo_user modify temp2 varchar(20);
#alter table t_demo_user modify temp2 varchar(32), modify temp3 varchar(32), add temp4 double;
#alter table t_demo_user modify temp4 int not null;

#清空表中的数据, 删除所有行
#truncate table t_demo_user;

#删除表
drop table t_demo_user;















