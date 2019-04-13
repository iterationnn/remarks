### 一、使用git的一般步骤是：

1.先在远端建立仓库  2.再在本地克隆下来   3.然后在克隆下来的仓库中创建（或者把项目复制进来）或者完善项目

### 二、解决本地库提交远端库出现库不相容的情况

1.在本地项目的根目录下进入cmd，连接远端库，以下两条命令都可以连接远端库：
git remote add origin git@github.com:yourName/repositoryname.git
git remote add origin https://github.com/yourName/repositoryname.git
2.使用命令拉取远端库与本地库进行合并：git pull origin master --allow-unrelated-histories
3.然后就可以正常使用gitTortoise正常进行推送远端库的操作了

### 三、不知如果远端库没有任何文件的情况下，本地库推送远端库是否会发生不相容的情况？
