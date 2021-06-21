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


## Java基础语法-1
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
<img src="pic\twoto8.png" alt="twoto8"  />

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
	目标数据类型 变量  = (目标数据类型) (被转换的数据) 

>1. 若转换的数据不是运算，而是单个，则不需要括号
>2. 不要随意的去使用强制转换，因为它隐含了精度损失问题

![DataType](pic\DataType.png)

![DataTypeResult](pic\DataTypeResult.png)

