#数值函数
#绝对值
#select abs(2), abs(0), abs(-2);

#十进制转换成其他进制
#select bin(8), oct(8), hex(8), hex(17);

#设置的正负性
#select sign(-1),sign(-2),sign(0),SIGN(1),SIGN(2);

#获得0~1的随机数
#select rand()*100, ceiling(rand()*100);

#四舍五入
#select round(100.256), round(100.256, 2), round(100.246, 1), round(100.256, 5), round(159.256, -2);

#截取数值
#select truncate(156.265, 2), truncate(156.265,0), truncate(156.265, -1);

#数值格式化
#select format(156.265, 2), format(156.265, 5), format(156.265, -1), format(80156.265, 2);
#select format(156.265, 2)+100;
#select concat('￥',format(156.256, 2));

#算术运算符
#select 3+2, 3-2, 3*2, 3/2, 3%2, mod(3, 2);


#字符函数
#字符串平均
#select concat('abc','ABC'),concat_ws(',','abc','ABC','Tom','Lily');

#大小写转换
#select upper('abcABC'), LOWER('abcAbc');

#搜索返回第一次出现的下标，从1开始
#select instr('abcAbcdcaef','Abc'); #不区分大小写
#select LOCATE('Abc', 'abcAbcdcaef'), LOCATE('Abc', 'abcAbcdcaef', 3);

#获得字符串首部指定个数字符
#select left('http:www.baidu.com', 4);

#获得字符串尾部指定个数字符
#select right('http:www.baidu.com', 3);

#取出前后空格
#select ltrim('   hello    '), rtrim('   hello    '), trim('   hello    ');

#截取字符串
-- select substr('helloworld!',6), substr('helloworld!',6,5), 
--     substring('helloworld!',6), substring('helloworld!',6,5);

#替换字符串
#select replace('How are you! How old are you!', 'are', 'IS');
#select insert('How are you! How old are you!', 14, 7, 'How');

#反向字符串
#select reverse('How are you!');

#返回重复指定次数的字符串
#select repeat('吃饭了!', 3);

#字符串转换成数值
-- select '123a'+100, cast('123' as BINARY), 
--     cast('123' as SIGNED INTEGER),
--     cast('123' as signed), cast('-123' as signed),
--     cast('123' as unsigned), cast('-123' as unsigned);

#select '112'+100, '112'-100, '112'*100, '112'/100;


#日期函数

#返回当前日期时间
#select sysdate(), now(), curdate(), curtime();

#获得年月日时分秒

-- select year('1994-12-21 14:25:23')年,
--       month('1994-12-21 14:25:23')月,
--       day('1994-12-21 14:25:23')日,
--       quarter('1994-6-21 14:25:23')季度;


#修改时间
#select now(), date_add(date_add(now(), interval '2-2' YEAR_MONTH), interval '10 2:2:30' DAY_SECOND);


#select DATE_FORMAT(now(), '%Y年%m月%d日 %h:%i:%s.%f');

#时间格式化
#select date_format(now(), '%Y年%m月%d日 %H:%i:%s.%f %w');
-- %Y   年（4位数字）
-- %m   月
-- %d   天
-- %H   小时（24小时制）
-- %i   分
-- %s   秒
-- %f   毫秒
-- %w   星期
-- %p   上、下午

#控制函数

#if函数

#计算两个日志间的时间差
#select datediff(now(), '2010-01-01'), TO_DAYS(now())-TO_DAYS('2010-01-01');

#若第一个参数，计算出的结果为真，返回第二个参数的值；反之，返回第三个参数的值
#select if(TIMESTAMPDIFF(year, '1998-08-11', now())>=18, '成年', '未成年');

#IFNULL(arg1,arg2)函数， 如果arg1不是空，返回arg1，否则返回arg2
#select emp_name, ifnull(emp_salary, '没有工资') emp_salary from t_demo_employee;
#select emp_name, ifnull(emp_salary, 0) emp_salary from t_demo_employee;

#NULLIF(arg1,arg2)函数， 如果arg1=arg2返回NULL；否则返回arg1
#select emp_name, ifnull(nullif(emp_perf_salary, 0), '没有绩效') from t_demo_employee;

#查询基本工资为null的行数据
#select * from t_demo_employee where ifnull(emp_salary, '￥')='￥';



#克隆表
-- create table t_demo_emp_2 
--      select * from t_demo_employee;

#查询人名全是中文的行数据
#select * from t_demo_emp_2 where emp_name regexp '张[u0391-uFFE5]*'; #存在问题，未查询出满意的结果
#select * from t_demo_emp_2 where length(emp_name)=char_length(emp_name)*3; 
#select * from t_demo_emp_2 where hex(emp_name) regexp '[[:<:]](e[4-9][0-9a-f]{4}){2,3}[[:>:]]';
#select hex('1'), hex('A'), hex('中');

























