/*create table t_demo_user(
    user_id int primary key auto_increment,
    user_name varchar(50),
    user_gender varchar(1),
    user_birthday date,
    create_time datetime
);*/
#���뵥������������
#insert into t_demo_user values(1,'Tom','��','1996-05-16',sysdate());
#���뵥��ָ��������
#insert into t_demo_user(user_name,user_gender,user_birthday) values('Tom','��','1996-05-16');
#������������
/*insert into t_demo_user(user_name,
    user_gender,user_birthday,create_time) values
        ('Jack','��','1996-10-16',sysdate()),
        ('Rose','Ů','1996-10-30',sysdate()),
        ('Davin','��','1996-12-23',sysdate());*/

#��ѯ�����е�����
#select * from t_demo_user;
#��ѯָ��������
#select user_name,user_gender from t_demo_user;
#������ѯ����ѯ����������������
#select * from t_demo_user where user_gender='Ů' or user_birthday<'1996-08-31';

#�޸�������ָ���е�����
#update t_demo_user set user_gender='��',create_time=sysdate(); 
#�޸�������������ָ���е�����
#update t_demo_user set user_gender='Ů' where user_name='Rose';

#ɾ����������������
#delete from t_demo_user;
#ɾ������������������
#delete from t_demo_user where user_id=8;

#delete from t_demo_user;
#truncate table t_demo_user;

select * from t_demo_user limit 1;












