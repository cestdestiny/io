##  linux VFS
### 常见的文件类型
-：文件
d:目录
l:连接 硬链接 软连接
b:块设备
















## linux 命令

df 查看每个文件挂载在哪个磁盘

mount 挂载设备
umount 
stat 查看文件元数据
ln 创建连接（硬链接，软连接）

dd 生成一个文件
losetup 挂到硬盘上

ldd bash 查看bash的依赖

pcstat -pid $$ 查看pagecache情况。

/proc/$$/fd
$$ $BASHPID 当前进程的id号

重定向
< 输出   > 输入
fd: 0 标准输入 1 标准输出 2 错误


pstree 显示进程树

sysctl  

netstat -natp 查看所有tcp连接
-n 格式化host port
-a 显示所有在监听和未监听的socket
-t tcp
-p pid

nc host port  连接指定服务器

strace -ff -o out 打印所有进程的用户态、内核态调用的日志，文件名 out.pid

ps -a 查看所有进程号

lsof -p pid 显示指定pid所有的fd信息

tcpdump -nn -i etho port 9090 抓取 etho网卡9090端口的数据包

jps 获取进程号