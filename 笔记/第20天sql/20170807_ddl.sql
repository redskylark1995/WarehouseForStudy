#select * from t_demo_student;
#��ѯѧ��������
#select * from t_demo_student;
#��ѯ������ݵĳ���
#SQL�����ִ�Сд
/*select stu_name,  char_length(stu_name) �ַ���, length(stu_name) �ֽ���, bit_length(stu_name) λ��,
    stu_gender, char_LENGTH(stu_gender) �ַ���, LENGTH(stu_gender) �ֽ���, bit_length(stu_gender) λ�� from t_demo_student;*/


#�жϱ��Ƿ���ڣ����ڽ���ɾ��
#drop table if exists t_demo_user;
#������
/*create table t_demo_user(
    user_id int primary key auto_increment,
    user_name varchar(50),
    user_gender varchar(1),
    user_birthday date,
    create_time datetime
);
*/
#�޸ı�
#�޸ı���
#alter table t_demo_students rename t_demo_stu;
#�鿴��Ľṹ
#desc t_demo_stu;

#����ֶ�
#alter table t_demo_user add temp1 varchar(50);
#alter table t_demo_user add temp2 varchar(50), add temp3 varchar(50);
#ɾ���ֶ�
#alter table t_demo_user drop temp1;
#alter table t_demo_user drop temp2, drop temp3;

#alter table t_demo_user add column(temp2 varchar(50), temp3 varchar(50));
#alter table t_demo_user drop temp2, drop temp3;

#�޸��ֶ�
#alter table t_demo_user add column(temp1 int, temp2 bigint, temp3 float);

#�޸�����
#alter table t_demo_user change temp11 temp1 double;
#�޸�����
#alter table t_demo_user modify temp2 varchar(20);
#alter table t_demo_user modify temp2 varchar(32), modify temp3 varchar(32), add temp4 double;
#alter table t_demo_user modify temp4 int not null;

#��ձ��е�����, ɾ��������
#truncate table t_demo_user;

#ɾ����
drop table t_demo_user;















