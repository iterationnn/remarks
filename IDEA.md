一、全局设置（default settings）
（进入全局设置有两种方式：1.file-->other settings-->default settings；2.file-->close project）
1.修改Encoding为UTF-8：Editor-->File Encodings 
三处地方都改为UTF-8，同时勾选Transparent native-to……
2、鼠标加滚轮放大缩小：Editor-->General  勾选change font size……
3、方法与方法之间用线隔开：Editor-->General-->Appearance 勾选第五个
4、格式化代码多个空行留一个空行：Editor-->code style-->java 中点blank lines 将前三个2改为1
5、设置代码提示大小写不敏感：：Editor-->General-->code completion  将case sensitive completion设为none
6、设置自动导包:Editor-->General-->auto import 将insert imports on paste修改为all 同时把Add……和optimize这两个复选框勾上
7、鼠标停留显示相关文档：Editor-->General  将show quick documentation on mouse move的停留时间进行设置
8、sdk环境配置：setting-->project defaults-->project structure
9、调取快捷菜单栏;view-->勾选toolbar/tool buttons
10、调整性能：help-->edit custom vm options-->yes 设置xms1024m xmx2048m 第三行=500m
11、设置打开IDE不打开上次的项目：appearance & behavior-->system settings 取消勾选reopen last project on startup

二、安装插件
1、安装插件的方式:Default-->plugins
2.装IDEA时建议装的IDE Features Trainer（用于介绍怎么使用IDE的插件）由于不能联网未装

三、调试代码
1、F7，断点后一行一行执行会跳进方法
2、F8，断点后一行一行执行不会跳进方
3、F9，不会一行一行执行，会直接从一个断点跳到另一个断点

四、java EE相关设置
1、设置servlet版本：new project-->java-->java ee-->勾选底部java EE version相应版本 （点击web application后底部的versions就会有相应的改变）
2、部署到Tomcat：点击快捷菜单中的下拉列表选择edit configuration-->点击+-->点击Tomcat sever   同一个界面可以设置用什么浏览器打开
on update action 建议为redeploy   on frame deactivation建议为update classes resources
3、Maven配置：Default settings-->build，execution，deployment-->build tools-->Maven
Maven home directory用于指定Maven的安装路径
<localRepository>E:\Maven-repository</localRepository>
<mirror>
        <id>nexus-aliyun</id>
        <mirrorOf>*</mirrorOf>
        <name>Nexus aliyun</name>
        <url>http://maven.aliyun.com/nexus/content/groups/public</url>
    </mirror> 



十、其他
1、用IDE编码不需要手动保存
2、调出创建项目的主界面：file-->close project

