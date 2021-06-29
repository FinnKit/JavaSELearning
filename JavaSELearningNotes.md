# JavaSE学习笔记
链接：https://www.bilibili.com/video/BV1bt411S7fr
Java基础视频 刘意
2019-12-2 第一次 2021-6-19 第二次
## Day1 基础知识铺垫
### 计算机基础知识
计算机作用：科学计算，数据（所有东西都可以看作数据）处理，自动控制，计算机辅助设计，人工智能，多媒体应用，计算机网络
计算机硬件组成：CPU，主板，内存，电源，主机箱，硬盘，显卡，键盘，鼠标，显示器
计算机软件：系统软件（Windows，Linux，Mac，Android，iOS）和应用软件（QQ，WeChat）
软件开发：借助开发工具和计算机语言（C，C++，C#，Java）来使用特定数据组织计算机数据和指令
人机交互：交互方式:图形化界面，命令行方式
键盘功能键：Tab（缩进），Shift，Ctrl，Alt（组合键），Window，PrtSc
### 常用的DOS命令
打开DOS窗口控制台:1)按Shift+右键：powershell；2）开始-运行-cmd；3）win+R
命令：
盘符切换：d:
目录的进入：cd javase(单级进入)；cd javase\day1(多级进入)
目录的回退：cd..(单级退出)；cd\(多级退出)
清屏：cls
退出：exit
创建目录：md hhhh
删除文件：del（只能删除文件，无法删除文件夹） del a.mp3; del * .txt
删除文件夹：rd hhh（带内容文件不能删除，只能先将内容删除）rd /s hhh(删除带内容文件夹),rd /s /y (忽略选择选项)
### Java语言历史
Java之父： James Gosling
1. Java常用版本:JDK1.4.2		JDK5		JDK7
2. Java语言的特点：有很多小特点，重点在两个:开源，跨平台
Java跨平台：针对不同的操作系统（Win，Linux，Mac等）通过专门的虚拟机JVM来是实现
3. Java语言的开发平台：JavaSE（最基础），JavaME—嵌入式开发（如Android），JavaEE（通过浏览器访问）
4. JDK，JRE，JVM作用及关系：
作用:
JVM：保证Java语言跨平台
JRE：Java程序的运行环境
JDK：Java程序的开发环境
关系：
JDK：JRE + tools
JRE：JVM + class Libraries
JDK下载：官网：www.oracle.com（安装建议不要有中文，特殊符号，空格，保持目录统一）
开发工具：txt,notepad++,Eclipse,MyEclipse
开发程序：JDK下bin中开发工具来开发
### 第一段程序
```java
class HelloWordl{
	public static void main(String[] args){
		System.out.println(“HelloWorld”);
}
}
```

1. Java程序的最基本单位是类，所以要定义一个类：class + 类名
2. Java程序要想执行，必须有main方法：public static void main(String [] args)
3. 简单的输出：System.out.println(“xxx”);
   注意：Java中区分大小写；
### Java程序的开发执行流程
1. 编写java源程序（.java）
2. 通过命令行javac命令编译生成.class字节码文件 ：javac xx.java
3. 通过java命令运行.class文件: java xx(类名)
<img src="pic\JavaDevelop.png" alt="JavaDevelop"  />

### 环境变量配置
1. path环境变量：为了使在任意路径下都可以使用该目录下的可执行文件.exe
方案一：找到jdk文件夹中/bin文件目录；在path变量（此电脑-高级设置-环境变量）中添加该路径
方案二：
新建：找到系统变量-新建变量（JAVA_HOME）-变量值：D:\develop\tool\Java\jdk1.7.0_72
修改：path变量-添加-%JAVA_HOME%\bin;
<img src="pic\JavaHome.png" alt="JavaHome"  />

2. classpath环境变量配置（仿照path环境变量做的，）
	为了在指定路径下可以执行java命令，运行字节码文件(.class)。
	若有多个路径，则可用；隔开，查找顺序是从前到后的顺序。
	
3. path与classpath区别
	Path环境变量中记录的是可执行文件（如.exe文件）所在的路径；
	Classpath模仿path环境路径，记录的是java类可执行文件（如.class文件）所在的路径。
	
4. SubLimeText开发工具
    进行java代码编写，进行新建选项的设置。
    使用：新建txt，修改后缀.java，然后用SubLimeText打开。

> 注意：安装最新版的时，中文注释通常不会通过编译，会出现乱码，使得编译不通过，因此需要安装GBK转换包，详细过程见：https://www.cnblogs.com/wxdblog/p/7992854.html


## Day2 Java基础语法-1
任何语言基础语法基本都是一样的
关键字，标识符，注释，常量，变量
### 关键字
含义：Java语言赋予特定含义的单词（50个左右）
特点：
1. 全部小写 	public void static（注意：main不是）
2. goto, const作为保留字
3. 类似于Notepad++，SublimeText高级记事本对关键字有特殊颜色标记
### 标识符
概述：给类，接口，方法等起名字使用的字符序列
组成规则：
1. 英文字母全部小写（如main）
2. 数字字符
3. $和\_ 
注意事项：
1. 不能以数字开头
2. 不能是java中的关键字
3. 区分大小写
	常见的命名规则——见名知意
	1.  包的命名：（其实就是文件夹，把相同类名区分开）
		全部小写
		单级：liuyi
		多级：cn.itcast
	2. 类或接口命名：
		一个单词：单词首字母大写：Student
		多个单词：每个单词首字母大写：StudentAge
	3. 方法或变量：
		一个单词：单词首字母小写(main)
		多个单词：从第二个单词开始，每个单词首字母大写(studentAge)
	4. 常量
		一个单词：全部大写（PI）
		多个单词：每个字母都大写，用\_隔开（STUDENT\_MAX\_AGE）

### 注释
概述：用于解释说明程序的文字，主要是给别人或者给自己的
分类与格式：
单行注释：// 
多行注释：/\*\*/
注意：单行注释可以嵌套，而多行注释不能嵌套
文档注释：被javadoc工具解析，生成一个说明书，格式为/\*\* \*/
注意：一定要写注释，通过注释把自己的思想整理出来，然后用代码去实现。
<img src="pic\note.png" alt="Note"  />

注释的作用：
	A：帮助提高代码的可读性；
	B：帮助来调试代码
### 常量
概述：在程序执行过程中其值不可以发生改变
分类：
	A:字面值常量
	B:自定义常量
		final int x = 10;
字面值常量：
1. 字符串常量（用””括起来）：”HelloWorld”
2. 整数常量（所有整数）：100
3. 小数常量（所有小数）：12.3
4. 字符常量（用’’括起来）：’a’
5. 布尔常量：true和false（只能小写）
6. 空常量：null
<img src="pic\constant.png" alt="constant"  />

### 进制
概述
<img src="pic\jinzhi.png" alt="jinzhi"  />  

分类：
	A:二进制：由0，1组成，以0b开头
	B:八进制：由0,1,2…7组成，以0开头
	C:十进制：由0,1…9组成，整数默认为十进制
	D:十六进制；由0,1…9,a,b,c,d,e,f(大小写均可)，以0x开头
1. 其他进制到十进制转换
<img src="pic\toDecimal.png" alt="toDecimal"  />

2. 十进制到其他进制转换
<img src="pic\fromDecimal.png" alt="fromDecimal"  />

3. 二进制到十进制快速转换
<img src="pic\twoTo8.png" alt="twoTo8"  />

4. x进制到y进制转换
<img src="pic\xtoy.png" alt="xtoy"  />

### 常量中有符号数据表示法（原码，反码 ，补码）
在计算机内，有符号数有三种表示法：原码，反码和补码。
	所有数据的运算都是采用补码进行的。
A:原码
二进制定点表示法，最高位为符号位（0为正，1为负），其余为数值位
B:反码
正数反码与原码相同，负数反码是符号位除外对其原码逐位取反.
C:补码
整数补码与原码相同，负数补码是在反码末位+1

### 变量
概念：在程序执行过程中，其值在一定范围（指数据类型）内发生改变的量
#### 变量的组成规则：
A:必须对其进行限定
	用数据类型限定
B:在运算的时候，不可能是拿着这个空间去运算，而我们真正运算时使用的是该空间的值，就给这个空间起一个名字叫变量。
	起变量名
C:即使有数据类型，即有了这个空间，这个空间没有值，就属于垃圾空间，没有任何意义，故而需要进行初始化。
	初始化值
定义变量的格式：
	A：数据类型 变量名 = 初始化值
	B：数据类型 变量名；
	       变量名 = 初始化值
	C：在一行建议只定义一个变量，可以定义多个（用”,”隔开），但不建议
注意：这个初始化值可以先没有，但是在运算之前必须进行初始化

#### 数据类型
Java语言是强类型语言，对于每一种数据都定义了明确的具体数据类型，在内存中分配了不同大小的内存空间。

分类：
A:基本数据类型
1. 数值型：
	1）整数类型（byte,short,int,long）
	类型			占用字节数		范围
	byte				1			-128-127
	short				2			-2^15-2^15-1
	int					4			-2^31-2^31-1
	long				8			-2^63-2^63-1
	2）浮点类型（float,double）
	类型			占用字节数		范围
	float		  	    4			-3.403e38-3.403e38
	double		  	    8			-1.465e308-1.798e308
2. 字符型：char			      2
3. 布尔型：boolean			1(不确定)	

> 1. 整数默认：int；小数（浮点数）默认：double
> 2. 长整型后缀用L或l（不建议用l，因为像”1”）;
>     单精度浮点型flout用F或者f标记，建议用F

B:引用数据类型
1. 类：class		
2. 接口：interface
3. 数组：[]


#### 使用变量的时候要注意的问题
A：作用域
变量定义在一个大括号内，是一个局部变量，在一个大括号内不能同时定义同名的变量
B：初始化值
没有初始化值的变量不能直接使用；建议在定义时就给值

#### 关于数据转化
一般来说，我们在进行数据运算时，要求参与运算的数据类型必须一致
注意：boolean类型不能转化为其他的数据类型
默认转化：
	byte,short,char-int-long-float-double
	byte,short,char之间互相互转化，参与运算首先转化为int类型（系统默认转化）

强制转换：
	目标数据类型 变量  = (目标数据类型) (被强制转换的数据) 

>1. 若转换的数据不是运算，而是单个，则不需要括号
>2. 不要随意的去使用强制转换，因为它隐含了精度损失问题

例1：默认数据转换

<img src="pic\DataType.png" alt="DataType"  />

<img src="pic\DataTypeResult.png" alt="DataTypeResult"  />


byte c = a + b;//错误
因为：a + b运算后自动实现默认数据转化，转化为int型(占8个字节)，所以转化为byte（占1个字节），则会损失精度。
更改：byte c = (byte) (a + b); //进行强制数据转换

例2：

```java
double d = 12.345;
float f = d;
```

第二句出错，变量d的数据类型是double（占8个字节），而float占4个字节，所以会损失精度

例3：
```java
float f1 = (float)12.345;
float f2 = 12.345F;
```
上面两个语句的区别：
F1 实际上会损失精度，因为12.345首先会自动进行默认转换double（占8个字节），然后进行强制转换为float（占4个字节）
而f2本身是float，不会出现损失精度问题

例4：
```java
byte b1 = 3,b2 = 4,b;
b = b1 + b2;
b = 3 + 4;
```
第二句会编译出错，因为变量运算会自动进行默认数据类型转化为int（占8个字节），而b是定义是byte（占1个字节），所以会损失精度，出现错误。

例5：
```java
byte b = 130;
```
该语句是错误的，因为byte占一个字节，范围为-128-127，而130超了范围。
修改为：
```java
byte b = (byte)130;
```
进行强制转换，因为在计算机数据运算中都是以补码的形式进行的，所以需要进行补码转化，然后再转化为原码，注意最高为符号位，且正数的原码，反码，补码都是相同的；
而负数的原码，反码为原码除最高位外按位取反；补码：反码加一
		原码（2个字节）				补码
130 	 	0000 0000 1000 0010     	 0000 0000 1000 0010
将前三个字节进行截掉
补码（负数）		反码		原码
1000 0010		1000 0001		1111 1110
则为-126（注意最高位为符号位）

<img src="pic\DataTypeDemo1.png" alt="DataTypeDemo1"  />

#### 字符与字符串参与运算
1. 通过字符和一个整数相加，是将字符转化为ASCII码然后与整数相加，最后是一个ASCII码值，即一个整数值
要记住三个值：’a’(97);		‘A’(65)	‘0’(48)
2. 字符串数据和其他数据做+，结果字符串类型；这里的+不是加法运算，而是字符串连接符
3. 字符串运算顺序：从左到右
```java
System.out.println("Hello" + 'a' + 1);
System.out.println('a' + 1 + "Hello");
System.out.println(5 + 5 + "= 5 + 5");
System.out.println("5 + 5 = " + 5 + 5);
```

<img src="pic\CharDemo.png" alt="CharDemo"  />

#### 补充的一些问题
1. 在定义Long或者Float类型变量的时候，要加L或F
整数默认是int类型，浮点数默认是double
byte，short在定义的时候，他们接受的其实是一个int类型的值
这个是需要自己做一个数据检测的，若不在它们的范围内，就需要排除

2. byte值的问题
```java
byte b1 = 127;
byte b2 = (byte)128; //-128
byte b3 = (byte)129; //-127
byte b4 = (byte)130; //-126
```
byte的范围：-128 ~127
128: 	1000 0000
-128:	1000 0000 （这里的1既是符号位，也是数值位）

3. 数据类型转换之默认转换
byte,short,char -- int -- long -- float -- double
long：8个字节
float：4个字节
A：它们底层的存储结构不同
B：float表示的数据范围比long的范围更大
long：2^63-1
float：3.4\*10^38

4. Java语言中的字符char可以存储一个中文汉字吗？为什么？
可以，因为Java语言中的字符占用2个字节
Java语言采用的是Unicode编码

## Day3 Java基础语法-2
运算符：算术运算符（+,-,\*,\/,%,++,--），赋值运算符（），比较运算符，逻辑运算符，位运算符，三目运算符 

### 算术运算符
+，-，\*，\/，%，++，--
\/ ：整除是取商
%：取余
> 如果想要小数，只要进行默认转换，即乘以1.0即可得到，也就是必须把数据变化为浮点数类型。

++，--运算符：对变量进行自增/自减
1. 单独使用：
放在操作数的前面还是后面效果都是一样（这种用法是我们比较常见的）
```java
int x = 4;
int y = 3;
x++;
--y;
System.out.println("x:"+x);
System.out.println("y:"+y);
```

> x: 5	y: 2

2. 参与运算使用
放在操作数之前，先自增或自减，然后再参与运算；
放在操作数之后，先参与运算，然后再自增或自减；
```java
int x = 4;
int y = 3;
int z1 = x++;
int z2 = --y;
```
> z1 = 4	z2  =  2

> 自增/自减只是针对变量的，常量是不行的（常量是不可改变的）

###  运算符的优先级（从高到低）

<img src="pic\OperatorPriority.png" alt="OperatorPriority"  />

> 1. ++，--，！高于乘除
> 2. +，-高于移位，高于关系运算符，高于逻辑运算符，高于&&，||
> 3. 运算时从左到右的

```java
int x = 4;
int y = (x++) + (++x) + (x*10);
```
> 分析：y = 4 + 6 + 60
> x : 6	y : 70

> 自加与自减参与运算时的顺序
> 放在操作数之前，先自增或自减，然后再参与运算；
> 放在操作数之后，先参与运算，然后再自增或自减；

### 加号的用法
1. 加法
2. 正号
3. 字符串连接符

### 赋值运算符
基本的赋值运算符：=
	把=右边的数据赋值给左边（注意优先级在最后面）
扩展的赋值运算符：+=，-=，\*=，\/=，%=
	+=把左边和右边做加法，然后赋值给左边
> 扩展的赋值运算符，其实隐含了一个强制类型转换

例1：
```java
short s = 1;
s = s + 1;
System.out.println(s);
```
> 报错：可能损失精度（s = s + 1）
> 分析：这里变量参与运算，会自动进行默认转换，即转换为int型（占4个字节）；而s为short型（占2个字节），会损失精度

```java
short s = 1;
s += 1;
System.out.println(s);
```
> 分析：扩展的赋值运算符隐函了一个强制类型。
> s += 1等价于s = (s的数据类型) (s + 1);
> s = 2；

### 关系运算符
比较运算符：== ， !=,<,>,<=,>=
> 比较运算符的结果都是boolean型，也就是true/false
> 而布尔boolean型无法进行数据转换

### 逻辑运算符
&：与：同真才为真
|：或：同假才为假
^：异或：相同为假，相反为真
!：非：按位取反
&&：与，左边为假，右边不考虑直接为假
||：或，左边为真，右边不考虑直接为真
特点：逻辑运算符用于连接布尔型表达式
表达式：用运算符把常量或变量连接起来的式子：
	算术表达式：a + b
	比较表达式：a == b
> 1. 逻辑运算符用于连接布尔型表达式
> 2. java中6<x<9应写成：x > 6 && x < 9
> 3. 开发中常用的运算符：&&，||，！

### 位运算符
&：与运算：按位，同1才为1
|：或运算：按位，同0才为0
^：异或运算：按位，不同才为1（^异或的特点）
~：反码：按位，1变0，0变1
<<：左移，空位补0
\>>：右移：被移位二进制最高位为0，则空位补0；若最高位为1，则空位补1
\>>>：无符号右移，无论最高位为0还是1，空位补0
特点：
^异或的特点：一个数据对另一个数据异或两次，则该数据本身不变
例1：实现两个整数变量交换
```java
int a = 3, b = 4;
```
方法一：使用中间变量（第三变量）
```java
int c = a;
a = b;
b = c;
```
方法二：使用位运算符：异或来实现
```java
a = a ^ b;
b = a ^ b;
a = a ^ b;
```
方法三：用变量相加的做法
```java
a = a + b;
b = a - b;
a = a - b;
```
方法四：一句话搞定
```java
b = (a+b) - (a=b);
```
例2：求3的反码
```java
byte a = 3;
byte b = ~a;
```
> a的原码（反码，补码）：0000 0011
> ~a的补码：1111 1100
> ~a的反码：1111 1011
> ~a的原码：1000 0100（-4）

例3：求-24>>2 与 -24>>>2
```java
byte a = -24;
b = a >> 2;
c = a >>> 2;
```
> Java在处理byte、short、char的移位操作前，会先将其转型成int类型，然后在进行操作！特别地，当对这三者使用<<=、>>=和>>>=时，其实是得到对移位后的int进行低位截断后的结果！

> a的原码：10000000 00000000 00000000 00011000
> a的反码：11111111 11111111 11111111 01100111
> a的补码：11111111 11111111 11111111 11101000

> a >> 2
> 补码：11111111 11111111 11111111 11111010(00)
> 反码：11111111 11111111 11111111 11111001
> 原码：10000000 00000000 00000000 00000110（-6）

> a >>> 2
> 补码：00111111 11111111 11111111 11111010(00)
> 反码：00111111 11111111 11111111 11111010
> 原码：00111111 11111111 11111111 11111010（1073741818） 

> 一般而言，通常使用有符号移位来优化算法，代替乘除

### 三目（元）运算符
1. 单目运算符：~3
2. 双目运算符：3 + 4
3. 三目运算符：
格式：比较表达式 ? 表达式1 : 表达式2;
比较表达式：结果是一个boolean类型
执行类型：
根据比较表达式的计算返回一个true或false；
如果是true，就把表达式1作为结果；
如果是false，就把表达式2作为结果

例1：比较三个整数的大小
```java
int a = 2, b = 10, c = 1;
int temp = (a > b) ? a : b;
int max = (temp > c) ? temp : c;
//一步搞定
int max = (a > b) ? ((a>c)?a:c) : ((b>c)?b:c);
```
> max = 10

例2：比较两个数是否相等
```java
int m = 100, n = 20;
boolean flag = (m==n)?true:flase;
```
> flag = flase

### 键盘录入
为了让程序的数据更符合开发的数据，我们就加入了键盘录入，让程序更灵活一下。那么，我们如何实现键盘数据的录入呢？
步骤:
1. 导包
格式：import java.util.scanner;
位置：在class上面
2. 创建键盘录入对象
格式：Scanner sc = new Scanner(System.in);
3. 通过对象获取数据
int x = sc.nextInt();//大写I
```java
//导包
import java.util.Scanner;

class DataCompare{
	public static void main(String[] args){
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第1个数字");
		//利用对象录入数据
		int x = sc.nextInt();
		System.out.println("请输入第2个数字");
		int y = sc.nextInt();
		System.out.println("请输入第3个数字");
		int z = sc.nextInt();
		int max = (x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("max:"+max);
	}
}
```
## Day4 Java基础语法-3
### 流程控制语句
含义：可以控制程序的执行流程
分类：
1. 顺序结构
2. 选择结构
3. 循环结构
顺序结构：从上往下，依次执行
选择结构：If语句；switch语句
### 选择结构
分类：if语句；switch语句
#### if语句
1. 格式1:
if(比较表达式){
	语句体;
}
2. 格式2：
If(比较表达式){
			语句体1;
}else {
	语句体2;
}
3. 格式3：
If(比较表达式1){
	语句体1;
}else if(比较表达式2){
	语句体2;
}else if(比较表达式3){
	语句体3;
}
…
else {
	语句体n+1;
}

> 1. if(b != 100);这里其实是有语句体的，只不过是空语句体
> 2. 比较表达式无论简单还是复杂，结果必须是boolean类型
> 3. if语句控制的语句体如果是一条语句，大括号可以省略；
> 若是多条语句，就不能省略，建议永远不要省略；
> 4. 三元（三目）运算符与if判断语句的区别
> 区别：三元运算符实现的，都可以采用if语句实现，反之不成立；
> 但当if语句控制的操作是一个输出语句的时候就不能；主要是因为三元运算符是一个运算符，运算符操作完毕就应该有一个结果，而不是一个输出。
> 5. if语句可以实现嵌套

例1：判断一个数是否为偶数
```java
/*
	需求：通过键盘键入数字，并且判断该数字是否为偶数
*/
//导包
import java.util.Scanner;
class DataEven{
	public static void main(String[] args){
		//新建一个新对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		//利用对象存储到变量中
		int DataScanner = sc.nextInt();
		if(DataScanner % 2 == 0){
			System.out.println(DataScanner + "是一个偶数");
		}else{
			System.out.println(DataScanner + "不是一个偶数");
		}
	}
}
```
例2：输入一个数据成绩，判断该成绩的等级
90-100:优秀；80-90：良；70-80：中等；60-70：及格
60以下：不及格
> 虽然程序可以满足基本要求，但可能别人在使用的时候，不会按照你要求的数据给出了。所以在做一个程序的基本测试的时候，一定要考虑这样的几个问题：
> 正确数据，错误数据，边界数据
```java
if(score >= 90 & score <= 100){
	System.out.println(score + "成绩属于优秀");
}else if(score >= 80 & score < 90){
	System.out.println(score + "成绩属于良好");
}else if(score >= 70 & score < 80){
	System.out.println(score + "成绩属于中等");
}else if(score >= 60 & score < 70){
	System.out.println(score + "成绩属于及格");
}else{
	System.out.println("输入的成绩有误");
}
```
> 这里使用逻辑运算符为&

if语句的使用场景：
1. 针对表达式是一个boolean类型的判断
2. 针对一个范围的判断

#### switch选择结构
语句格式：
switch(表达式){
	case 值1:
		语句体1;
		break;
	case 值2:
		语句体2;
		break;
	…
	default:
		语句体2;
		break;
}

格式的解释：
表达式:这个地方的取值是有限定的：
1. byte,short,char,int
2. JDK5以后可以是枚举
3. JDK7以后可以是字符串
case：后面跟的是要和表达式进行比较的值
语句体：要执行的代码
break：表示中断，结束的意思，可以控制switch语句的结束
default：当所有的值都和表达式不匹配的时候，就执行default控制的语句，其实就是它就相当于if语句的else

> 1. case后面只能是常量，不能是变量，而且多个case后面的值不能出现相同的
> 2. default可以省略吗？
> 可以省略，但不建议，因为它的作用是对不正确的情况给出提示。
> 特殊情况：case就可以把值固定，A,B,C,D
> 3. break可以省略吗？
> 可以省略，但是结果可能不是我们想要的。会出现一个现象：case穿透，最终我们建议不要省略
> 4. switch语句的结束条件
> A：遇到break就结束了
> B：执行到末尾就结束，defalut若不放在末尾则也可能出现穿透，建议也要带上break

例1：键盘输入一个数，进而判断对应的星期
```java
import java.util.Scanner;

class SwitchDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int data = sc.nextInt();
		switch(data){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("输入的数据有误");
				break;
		}
	}
}
```

例2：case穿透
```java
switch(week){
	case 1:
		Sysetem.out.println(星期一);
	case 2:
		Sysetem.out.println(星期二);
	case 3:
		Sysetem.out.println(星期三);
		break;
}
```
> 若输入1，则会出现星期一，星期二，星期三

例3：dafalut的位置与break省略问题
```java
int x = 2, y = 3;
switch(x){
	default:
		y++;
		break;
	case 3:
		y++;
	case 4:
		y++;
}
```
> x与case后面的常量进行判断，没有匹配的，则执行default后面的语句，然后遇到break，跳出switch
> y = 4
```java
int x = 2, y = 3;
switch(x){
	default:
		y++;
	case 3:
		y++;
	case 4:
		y++;
}
```
> x与case后面的常量进行判断，没有匹配的，则执行default后面的语句，由于没有break，则顺序执行，出现了case穿透
> y = 6

例4：利用case穿透实现判断季节：春夏秋冬
```java
switch(month){
	case 12:
	case 1:
	case 2:
		System.out.println("冬");
		break;
	case 3:
	case 4:
	case 5:
		System.out.println("春");
		break;
	case 6:
	case 7:
	case 8:
		System.out.println("夏");
		break;
	case 9:
	case 10:
	case 11:
		System.out.println("秋");
	default:
		System.out.println("输入的月份有误");
}
```
#### if语句与switch语句的区别
If语句：
> 1. 针对结果是boolean类型判断
> 2. 针对一个范围的判断
> 3. 针对几个常量的判断

Switch语句
> 针对几个常量的判断

### 循环结构
分类：for语句，whilet语句，do…while语句
组成：
1. 初始化语句
2. 判断条件语句（判断是否执行循环体）
3. 循环体语句
4. 控制条件语句（执行完一次循环体之后，执行控制条件语句，以确保循环体在合适时候结束循环）
#### for语句
格式：
for(初始化语句;判断条件语句;控制条件语句){
	循环体语句;
}
执行流程：
1. 先执行初始化语句
2. 执行判断条件语句，看结果是ture还是false
若true则继续执行循环体语句
若false则结束循环结构
3. 执行完一次循环体语句后，执行控制条件语句
4. 回到2
> 1. 判断条件语句无论简单还是复杂，结果都是boolean
> 2. 循环体语句若是一条语句，大括号可以省略；若多条，不能省略，建议永远不要省略

例1：求1-100的和
```java
int sum = 0;
for(int x = 1; x <= 100; x++){
	sum += x;
}
```
> for的初始化语句中需要定义变量int，进行初始化

例2：求1-100偶数和
```java
int evenSum = 0;
for(int x = 2; x <= 100; x += 2){
	evenSum += x;
}
```
例3：求输入数据的阶乘（10以内）
```java
//从键盘中导入一个数字
Scanner sc = new Scanner(System.in);
System.out.println("请输入10以内的数字");
int num = sc.nextInt();
//判断数字是否输入正确
if(num >= 1 && num <= 10){
	//计算其阶乘
	int data  = num;
	for(int x = num - 1; x >= 1; x--){
		data *= x;
	}
	System.out.println("输入的数字" + num + "的阶乘为：" + data);
}
else{
			System.out.println("输入的数字有误");
}
```
例4：求水仙花数（参考\Code\Day4\ForDemo3.java）
```java
//初始化
double sum = 0;
// 判断水仙花
System.out.println("水仙花数有：");
for(int num = 100; num <= 999; num++){
	double onesDigit = num % 10;
	double tensDigit = num / 10 % 10;
	double hundredsDigit = num / 100;
	sum = Math.pow(onesDigit, 3) + Math.pow(tensDigit, 3) + Math.pow(hundredsDigit, 3);
	if(sum == num){
	System.out.println(num);
	}
}
```
> 水仙花数有：
> 153
> 370
> 371
> 407

> 水仙花指一个三位数，其各位数字的立方和等于该数
> 注意不能使用^，这个是异或的意思
> 立方的简单方法：a\*a\*a，或调用库函数：Math.pow(a,3)（但要注意其数据类型是double）

#### while语句
基本格式：
while(判断条件语句) {
	循环语句;
}
扩展格式：
初始化语句;
while(判断条件语句){
	循环体语句;
	控制条件语句;
}

#### for循环和while循环的区别
使用区别：若你想在循环结束后，继续使用控制条件的那个变量，用while循环，否则用for循环。
因为变量及早从内存中消失，可以提高内存的使用效率
如for(int x =10;..;… ){…} 执行完这个for循环后，变量x的内存会自动释放，故而在下一个for循环中或其他场景下依然可以使用x这个变量

> 其实还有一种场景的理解：
>若是在一个范围的，用for循环非常明确；
>若是不明确要做多少次，用while循环较为合适。
>如吃葡萄

例：现有一张纸，厚度为0.01m,请问折叠多少次，可以保证厚度不低于珠穆朗玛峰的高度（8848m）（参考\Code\Day4\WhileDemo.java）
```java
int height = 1, num = 0;
while(height < 884800){
	height *= 2;
	num++;
}
System.out.println("一共需要折"+num+"次");
```
> 一共需要折20次

> 注意，这里的小数0.01变换为整数1，而相应最后比较结果为884800（int占4个字节，范围为-2^31-2^31-1，即-2147483648~2147483647）

#### do…whike语句
基本格式：
do {
	循环体语句;
}while(判断条件语句);
扩展格式：
初始化语句;
do {
	循环体语句;
	控制条件语句;
}while(判断条件语句);

#### 循环语句do…while与for,while的区别
do…while循环至少执行一次循环体
而for，while循环必须先判断条件是否成立，然后是否看是否执行循环体语句
使用循环的顺序：
优先考虑for,其次考虑while,最后考虑do…while

> 一定要注意控制条件语句控制的那个变量的问题，不要弄丢了，否则就容易陷入死循环。
> 两种最常用的死循环的格式：
> while(true){…}
> for(;;;)

例1：打印九九乘法表（参考\Code\Day4\Demo1.java）
1\*1=1
1\*2=2	2\*2=4
1\*3=3	2\*3=6	3\*3=9
```java
// 初始化乘积的结果
int num = 0;
for(int i = 1; i <= 9; i++){
	for(int j = 1; j <= i; j++){
		num = j * i;
		System.out.print(j+"*"+i+"="+num+'\t');
	}
	System.out.print('\n');
}
```
> println():打印后换行;print()：打印后不换行
> print输出需要有间隔可以使用”\t”：tab
> \转移字符：
> ’\t’:tab键的位置
> ‘\r’回车
> ‘\n’换行

### 跳转控制语句
> Java中goto是保留字，目前不能使用。虽然没有goto语句可以增强程序的安全性，但是也带来很多不便，比如说，想实现跳转到某个语句的。
为了弥补以上缺陷，Java提供了break，continue，return来实现控制语句的跳转和中断。
break：中断
continue：继续
return：返回

#### break语句
中断的意思
使用场景：
1. switch语句中
2. 循环语句中
	需要加入if判断

> 离开上面两个场景，无意义

如何使用？
1. 跳出单层循环
2. 跳出多层循环
	要想实现这个效果，就必须知道一个东西，带标签的语句
	带标签语句格式：标签名: 语句

#### continue语句
使用场景：
	在循环语句中
离开上述使用场景没有意义

continue作用：
	单层循环对比break，区别：
		break退出当前循环
		continue退出本次循环
	也可以带标签使用

例：break与continue区别：break退出当前循环；continue退出本次循环（参考\Code\Day4\BreakContinueDemo1.java与BreakContinueDemo2.java）
```java
class BreakContinueDemo1{
	public static void main(String[] args){
		for(int x = 0; x < 10; x++){
			if(x == 3){
				break;
			}
			System.out.print(x + "\t");
		}
	}
}
```
>0	1	2
```java
class BreakContinueDemo2{
	public static void main(String[] args){
		for(int x = 0; x < 10; x++){
			if(x == 3){
				continue;
			}
			System.out.print(x + "\t");
		}
	}
}
```
>0	1	2	4	5	6	7	8	9

#### return语句
作用：返回
其作用不是结束循环的，而是结束方法的。
例（参考\Code\Day4\ReturnDemo1.java）
```java
class ReturnDemo1{
	public static void main(String[] args){
		for(int x = 0; x < 10; x++){
			if(x == 3){
				System.out.print("退出");
				return;
			}
			System.out.println(x);
		}
		System.out.println("over");
	}
}
```
> 0
> 1
> 2
> 退出

练习：
小芳的妈妈每天给她2.5元钱，她都会存起来，但是
每当这一天是存钱的第五天或者5的倍数的话，她都会花去6元钱
请问：经过多少天，小芳才可以存到100元钱
```java
class Demo2{
	public static void main(String[] args){
		double money = 0;
		int day = 0;
		while(money < 100){
			money += 2.5;
			day++;
			if(day % 5 == 0){
				money -= 6;
			}
		}
		System.out.println("经过"+day+"天，小芳才可以存到100元钱");
	}
}
```
> 经过74天，小芳才可以存到100元钱


