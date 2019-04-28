/*create table t_demo_user(
    user_id int primary key auto_increment,
    user_name varchar(50),
    user_gender varchar(1),
    user_birthday date,
    create_time datetime
);*/
#插入单行所有列数据
#insert into t_demo_user values(1,'Tom','男','1996-05-16',sysdate());
#插入单行指定列数据
#insert into t_demo_user(user_name,user_gender,user_birthday) values('Tom','男','1996-05-16');
#批量插入数据
/*insert into t_demo_user(user_name,
    user_gender,user_birthday,create_time) values
        ('Jack','男','1996-10-16',sysdate()),
        ('Rose','女','1996-10-30',sysdate()),
        ('Davin','男','1996-12-23',sysdate());*/

#查询所有列的数据
#select * from t_demo_user;
#查询指定列数据
#select user_name,user_gender from t_demo_user;
#条件查询，查询出满足条件的数据
#select * from t_demo_user where user_gender='女' or user_birthday<'1996-08-31';

#修改所有行指定列的数据
#update t_demo_user set user_gender='男',create_time=sysdate(); 
#修改满足条件的行指定列的数据
#update t_demo_user set user_gender='女' where user_name='Rose';

#删除表中所有行数据
#delete from t_demo_user;
#删除满足条件的行数据
#delete from t_demo_user where user_id=8;

#delete from t_demo_user;
#truncate table t_demo_user;

select * from t_demo_user limit 1;












