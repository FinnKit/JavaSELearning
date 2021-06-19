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
3. 类似于Notepad++高级记事本对关键字有特殊颜色标记
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
![note](pic\note.png)

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

