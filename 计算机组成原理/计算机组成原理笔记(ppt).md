





# 计算机组成原理

   

## Week1

`2022/8/31`

   

### 考核标准

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220831122943.png" alt="image-20220831122941989" style="zoom: 33%;" />

### 教学内容

* 讲解**单台**计算机**完整硬件系统**的**基本组成原理**与内部运行机制和系统结构的基本概念

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220831124627.png" alt="image-20220831124626694" style="zoom:50%;" />

* 内容结构

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220831125147.png" alt="image-20220831125146627" style="zoom:50%;" />

* 学时分配

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220831125420.png" alt="image-20220831125419020" style="zoom:50%;" />

### 第一章、概论

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220831125525.png" alt="image-20220831125524443" style="zoom: 33%;" />

#### 重点

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220831125636.png" alt="image-20220831125635765" style="zoom: 33%;" />

  

#### 1.计算机性能指标

##### 利用率、总线宽度

![image-20220831133616250](https://gitee.com/lynbz1018/image/raw/master/img/20220831133617.png)

#####    时钟周期、CPI

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220831131815.png" alt="image-20220831131813885" style="zoom:67%;" />

#####     MIPS

![image-20220831133535320](https://gitee.com/lynbz1018/image/raw/master/img/20220831133536.png)

##### CPI例题 ***

1. 例题1

![image-20220831134821111](https://gitee.com/lynbz1018/image/raw/master/img/20220831134822.png)

2. 例题2

![image-20220831135451281](https://gitee.com/lynbz1018/image/raw/master/img/20220831135452.png)

   

#### 2.计算机硬件系统

* 五大部件
  * 运算器、控制器、存储器、输入、输出

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220831140802.png" alt="image-20220831140800926" style="zoom:67%;" />

* 冯诺依曼结构

![image-20220831141507503](https://gitee.com/lynbz1018/image/raw/master/img/20220831141508.png)

##### 2.1运算器

* 如果有三个总线 两个输入一个输出 可以不用寄存器

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220907120530.png" alt="image-20220907120529299" style="zoom: 67%;" />

##### 2.2存储器



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220907122538.png" alt="image-20220907122536813" style="zoom:67%;" />



##### 2.3控制器



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220907123006.png" alt="image-20220907123005412" style="zoom:67%;" />



##### 程序计数器PC 

* **程序的第一条指**令位于PC程序计数器中
* 获取第一条指令后，**通过增量，能够使指令自动的执行**
* 在分析指令后才有数据的地址
* 数据地址在指令中，**但是执行的时间段不同**，所以指令和数据都是二进制编码 但不会混淆

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220907130754.png" alt="image-20220907130753198" style="zoom: 80%;" />

#### 3.计算机软件

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220907134614985.png" alt="image-20220907134614985" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220907134649679.png" alt="image-20220907134649679" style="zoom:33%;" />



<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220907134715412.png" alt="image-20220907134715412" style="zoom:67%;" />



##### Amdhal定律

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220907135037.png" alt="image-20220907135035851" style="zoom:67%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220907135303.png" alt="image-20220907135302308" style="zoom:50%;" />



#### 本章小结

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220907134231.png" alt="image-20220907134230050" style="zoom:67%;" />



*****

#### 课堂习题

1.  `1s/2G = 0.5ns`

![image-20220831134252059](https://gitee.com/lynbz1018/image/raw/master/img/20220831134253.png)

2. `250 * 2 = 500; 500 * 1.2 = 600 600 / 500 = 1.2`

![image-20220831140014307](https://gitee.com/lynbz1018/image/raw/master/img/20220831140015.png)

   

​    

****



## Week2

`2022/9/7`



### 第二章、运算方法和运算器



#### 1.大纲要点

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220907135534198.png" alt="image-20220907135534198" style="zoom: 67%;" />



<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220907135734548.png" alt="image-20220907135734548" style="zoom: 50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220907135750722.png" alt="image-20220907135750722" style="zoom: 67%;" />



#### 2.数据与文字的表示方法



<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220907140336404.png" alt="image-20220907140336404" style="zoom: 67%;" />



* 为甚要用二进制表示数据

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220914120206.png" alt="image-20220914120205262" style="zoom:50%;" />



#### 3.数据格式：定点表示法

* 小数点位置固定
  * 纯整数
  * 纯小数

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220914120701.png" alt="image-20220914120700456" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914120910358.png" alt="image-20220914120910358" style="zoom: 50%;" />



<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914121345485.png" alt="image-20220914121345485" style="zoom:50%;" />

##### 原码表示法

* 用0表示 + 
* 用1表示 -
* 用8位原码表示，整数前边+0 小数后边+0

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220914122024.png" alt="image-20220914122023827" style="zoom: 50%;" />

1. 0有两种表示 +0 -0
2. 定点小数：-1 < X < 1; 定点整数：-2^n < X < 2^n
3. 与真值对应关系简单；参与复杂运算需要将数值位和符号位分开考虑。

##### 补码表示法

* 正数不变
* 负数，定点小数[2 - |x|], 定点整数[2^n - |x|]
* 整数的补码数值位 原码按位取反再加1  **从左开始按位取反最后一个1和后边的不变**

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914125144472.png" alt="image-20220914125144472" style="zoom:50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914125811710.png" alt="image-20220914125811710" style="zoom:67%;" />

* +0 = -0 = 0000 零有唯一表示

* 补码表示范围可以表示 -1 和 2^n
  * 因为在补码中0的表示是唯一的 原码中0有两种表示
* 补码求原码 ，对补码在求一次补码

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914130521294.png" alt="image-20220914130521294" style="zoom: 80%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914131407113.png" alt="image-20220914131407113" style="zoom: 80%;" />

* 补码运算

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220914131650.png" alt="image-20220914131649413" style="zoom:67%;" />

##### 反码表示

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220914132045.png" alt="image-20220914132044271" style="zoom:50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914132101693.png" alt="image-20220914132101693" style="zoom:50%;" />

##### 移码表示

* 0的移码：1000

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914132406298.png" alt="image-20220914132406298" style="zoom:50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914132557074.png" alt="image-20220914132557074" style="zoom:50%;" />

##### Summary

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914134233122.png" alt="image-20220914134233122" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220914133335.png" alt="image-20220914133334067" style="zoom: 50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914133454862.png" alt="image-20220914133454862" style="zoom: 50%;" />

#### 4.浮点数

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220914140709.png" alt="image-20220914140707689" style="zoom:50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220914141324246.png" alt="image-20220914141324246" style="zoom:50%;" />

##### 规格化

* 保证浮点数表示的唯一性
* 位数0.5 < X < 1 二进制的是0.1

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220914141355.png" alt="image-20220914141354045" style="zoom:50%;" />

* 看**符号位和数值位异或是1** 则是规格化的

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220921121258704.png" alt="image-20220921121258704" style="zoom: 67%;" />

##### 表示范围

计算机表示的数都是**有限的**

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220921122010.png" alt="image-20220921122009688" style="zoom:67%;" />

###### 例题

最大正数和最小负数都是对应的

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220921123511861.png" alt="image-20220921123511861" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220921131316951.png" alt="image-20220921131316951" style="zoom:50%;" />

* 溢出问题

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220921124352.png" alt="image-20220921124351190" style="zoom:50%;" />

##### 数据格式 IEEE754

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220921125722.png" alt="image-20220921125721509" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220921125858583.png" alt="image-20220921125858583" style="zoom:50%;" />

**指数真值要加127变成阶码E**

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220921125502.png" alt="image-20220921125500947" style="zoom:67%;" />

###### 例题

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220921130358282.png" alt="image-20220921130358282" style="zoom: 67%;" />

###### 浮点数溢出计算

![image-20220928121203839](https://gitee.com/lynbz1018/image/raw/master/img/20220928121205.png)

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220928122408.png" alt="image-20220928122407389" style="zoom:80%;" />

#### 5.1定点数的加减运算

##### 补码加法 | 减法

* `[x]补 + [y]补 = [x + y]补`补码的加法 == 加后的补码
* 符号位参与运算

###### -X补码计算

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220921135558888.png" alt="image-20220921135558888" style="zoom:67%;" />

##### 溢出问题

* 两个正数加，变负数
* 两个负数加，变正数



* 双符号位检测

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220921141009570.png" alt="image-20220921141009570" style="zoom: 67%;" />

* 单符号位检测

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220921141302.png" alt="image-20220921141301077" style="zoom: 67%;" />

#### 5.2浮点数加减

![image-20221004123213865](https://gitee.com/lynbz1018/image/raw/master/img/20221004123215.png)

![image-20221004123328050](https://gitee.com/lynbz1018/image/raw/master/img/20221004123329.png)

![image-20221004123940581](https://gitee.com/lynbz1018/image/raw/master/img/20221004123941.png)

##### 例题

![image-20221005132253297](https://gitee.com/lynbz1018/image/raw/master/img/20221005132255.png)

![image-20221005132313489](https://gitee.com/lynbz1018/image/raw/master/img/20221005132315.png)



##### */浮点数乘除

![image-20221005135436755](https://gitee.com/lynbz1018/image/raw/master/img/20221005135437.png)



#### 6.机器数的移位运算

![image-20220928123205152](https://gitee.com/lynbz1018/image/raw/master/img/20220928123206.png)

用处：

`x = -101 1001； 求x/2的补码，就是求x的补码右移一位`

![image-20220928123124583](https://gitee.com/lynbz1018/image/raw/master/img/20220928123125.png)

**例题**

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220928125049492.png" alt="image-20220928125049492" style="zoom:67%;" />



#### 7.加法器

![image-20220928130731356](https://gitee.com/lynbz1018/image/raw/master/img/20220928130732.png)

##### **超前进位加法器**

可以并行计算

![image-20220928131453956](https://gitee.com/lynbz1018/image/raw/master/img/20220928131455.png)

c1是由 A0 B0 C0计算得来

计算速度很快

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220928131623274.png" alt="image-20220928131623274" style="zoom:80%;" />



### 2.3定点乘法运算

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220928133931284.png" alt="image-20220928133931284" style="zoom:67%;" />

**阵列乘法器**

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220928134251.png" alt="image-20220928134250608" style="zoom:67%;" />

**带符号的阵列乘法器**

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220928135157.png" alt="image-20220928135156268" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220928135345281.png" alt="image-20220928135345281" style="zoom:67%;" />

**例题**

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220928135904476.png" alt="image-20220928135904476" style="zoom:67%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220928135830.png" alt="image-20220928135829140" style="zoom:67%;" />



### 2.4定点除法运算

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220928140527896.png" alt="image-20220928140527896" style="zoom:50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220928140548305.png" alt="image-20220928140548305" style="zoom:80%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220928141321.png" alt="image-20220928141320313" style="zoom:67%;" />

### 2.5逻辑运算

`数据线一般是双向的，地址线是单向的`

![image-20221005121958029](https://gitee.com/lynbz1018/image/raw/master/img/20221005121959.png)

![image-20221005122903967](https://gitee.com/lynbz1018/image/raw/master/img/20221005122905.png)

![image-20221005124443158](https://gitee.com/lynbz1018/image/raw/master/img/20221005124444.png)



![image-20221005125706750](https://gitee.com/lynbz1018/image/raw/master/img/20221005125708.png)

![image-20221005130229591](https://gitee.com/lynbz1018/image/raw/master/img/20221005130231.png)



### 2.6流水线

![image-20221005140205690](https://gitee.com/lynbz1018/image/raw/master/img/20221005140206.png)

![image-20221005140217664](https://gitee.com/lynbz1018/image/raw/master/img/20221005140218.png)



## 第三章

![image-20221019134726261](https://gitee.com/lynbz1018/image/raw/master/img/20221019134727.png)

![image-20221019140640827](https://gitee.com/lynbz1018/image/raw/master/img/20221019140642.png)

![image-20221019140703276](https://gitee.com/lynbz1018/image/raw/master/img/20221019140704.png)

![image-20221019140852896](https://gitee.com/lynbz1018/image/raw/master/img/20221019140854.png)



存储周期：一次读写到下一次读写开始的时间，两次读写之间可能有等待间隔

主存连接在总线上可以被CPU直接访问，有RAM 和 ROM，大部分是RAM

外存不能直接被CPU访问



### 主存

覆盖式的写，非破坏性的读

只有写的时候会修改数据

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221026121213.png" alt="image-20221026121211965" style="zoom:67%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221026122705.png" alt="image-20221026122704704" style="zoom:67%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221026123105.png" alt="image-20221026123104110" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221026123318.png" alt="image-20221026123316858" style="zoom:67%;" />



### SRAM

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221026124639.png" alt="image-20221026124637962" style="zoom:67%;" />

![image-20221026130532418](https://gitee.com/lynbz1018/image/raw/master/img/20221026130533.png)

![image-20221026130542976](https://gitee.com/lynbz1018/image/raw/master/img/20221026130544.png)

![image-20221026130612295](https://gitee.com/lynbz1018/image/raw/master/img/20221026130613.png)



### DRAM

价格低、需要经常刷新

![image-20221026131551236](https://gitee.com/lynbz1018/image/raw/master/img/20221026131552.png)



![image-20221026132050372](https://gitee.com/lynbz1018/image/raw/master/img/20221026132051.png)

![image-20221026132343336](https://gitee.com/lynbz1018/image/raw/master/img/20221026132344.png)

![image-20221026132527998](https://gitee.com/lynbz1018/image/raw/master/img/20221026132529.png)

![image-20221026134558022](https://gitee.com/lynbz1018/image/raw/master/img/20221026134559.png)

![image-20221026134517298](https://gitee.com/lynbz1018/image/raw/master/img/20221026134518.png)



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221026134449.png" alt="image-20221026134448748" style="zoom:67%;" />



### ROM

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221026135812.png" alt="image-20221026135811662" style="zoom:67%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221026135737.png" alt="image-20221026135736452" style="zoom:67%;" />



### 扩展

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031200952.png" alt="image-20221031200950877" style="zoom:67%;" />





#### 位扩展

要工作都工作

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031201024.png" alt="image-20221031201023036" style="zoom:67%;" />

![image-20221031201044595](https://gitee.com/lynbz1018/image/raw/master/img/20221031201045.png)



#### 字扩展

同一时刻只能有一个工作

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031201113.png" alt="image-20221031201112199" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031201542.png" alt="image-20221031201541136" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031201649.png" alt="image-20221031201648467" style="zoom:67%;" />

#### 字位扩展

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031202033.png" alt="image-20221031202032081" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031202655.png" alt="image-20221031202654342" style="zoom:67%;" />

##### 练习

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031204525.png" alt="image-20221031204523793" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221031204636202.png" alt="image-20221031204636202" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031210005.png" alt="image-20221031210003660" style="zoom:80%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031210017.png" alt="image-20221031210016242" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221031210702285.png" alt="image-20221031210702285" style="zoom:67%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031211149.png" alt="image-20221031211148010" style="zoom:67%;" />

### 高速存储器

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031212346.png" alt="image-20221031212345096" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031212408.png" alt="image-20221031212407344" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031212603.png" alt="image-20221031212602069" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221031212552.png" alt="image-20221031212551508" style="zoom:67%;" />













## 第四章、指令系统

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221012114350.png" alt="image-20221012114349394" style="zoom:80%;" />

### **指令系统**

![image-20221012120857781](https://gitee.com/lynbz1018/image/raw/master/img/20221012120858.png)

![image-20221012121213558](https://gitee.com/lynbz1018/image/raw/master/img/20221012121214.png)



![image-20221012121547932](https://gitee.com/lynbz1018/image/raw/master/img/20221012121549.png)



### 指令格式

地址码可以指出参与操作的操作数的地址，也可以指出下一条指令的地址

![image-20221012123132467](https://gitee.com/lynbz1018/image/raw/master/img/20221012123133.png)



三地址指令

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221012123358322.png" alt="image-20221012123358322" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221012124441.png" alt="image-20221012124440766" style="zoom:80%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221012124934.png" alt="image-20221012124933401" style="zoom: 67%;" />



顺序类的指令，在寄存器的下一个

跳转类的指令，在操作码上指出了下一个指令的位置

![image-20221012130600737](https://gitee.com/lynbz1018/image/raw/master/img/20221012130601.png)

#### 指令长度

![image-20221012130832736](https://gitee.com/lynbz1018/image/raw/master/img/20221012130833.png)

![image-20221012131028859](https://gitee.com/lynbz1018/image/raw/master/img/20221012131029.png)



##### **例题**

###### 固定格式

![image-20221012131443683](https://gitee.com/lynbz1018/image/raw/master/img/20221012131444.png)

###### 可变格式

使用频率搞得使用操作码短的

使用频率低的使用操作码长的

![image-20221012131739059](https://gitee.com/lynbz1018/image/raw/master/img/20221012131740.png)

![image-20221012133236835](https://gitee.com/lynbz1018/image/raw/master/img/20221012133237.png)

![image-20221012134002128](https://gitee.com/lynbz1018/image/raw/master/img/20221012134003.png)

#### 操作数寻址

![image-20221012134351679](https://gitee.com/lynbz1018/image/raw/master/img/20221012134352.png)

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221012134504548.png" alt="image-20221012134504548" style="zoom:67%;" />

![image-20221012134851804](https://gitee.com/lynbz1018/image/raw/master/img/20221012134852.png)

解决操作数位数限制寻址范围的问题，但是效率会很慢

![image-20221012135453835](https://gitee.com/lynbz1018/image/raw/master/img/20221012135454.png)

![image-20221012135619876](https://gitee.com/lynbz1018/image/raw/master/img/20221012135621.png)

![image-20221012135840411](https://gitee.com/lynbz1018/image/raw/master/img/20221012135841.png)

![image-20221012140547923](https://gitee.com/lynbz1018/image/raw/master/img/20221012140549.png)

![image-20221012141029327](https://gitee.com/lynbz1018/image/raw/master/img/20221012141030.png)

![image-20221012141246629](https://gitee.com/lynbz1018/image/raw/master/img/20221012141247.png)

##### 寻址方式例子

MOV 单字长 R-R 源目可以使用16个通用寄存器

STO 单字长 R-S 源使用16个GR 目标（基址+变址 需要计算完地址再存）

LAD 双字长(16机器区两次) R-S  

![image-20221019124546813](https://gitee.com/lynbz1018/image/raw/master/img/20221019124548.png)

![image-20221019124554763](https://gitee.com/lynbz1018/image/raw/master/img/20221019124556.png)

![image-20221019125548167](https://gitee.com/lynbz1018/image/raw/master/img/20221019125549.png)

![image-20221019130546610](https://gitee.com/lynbz1018/image/raw/master/img/20221019130547.png)

![image-20221019130842358](https://gitee.com/lynbz1018/image/raw/master/img/20221019130843.png)



### 典型指令集

![image-20221019131524298](https://gitee.com/lynbz1018/image/raw/master/img/20221019131525.png)



**CRSC 28定**律：CISC中只有个20%的常用指令占据处理机的80%的时间

![image-20221019132619032](https://gitee.com/lynbz1018/image/raw/master/img/20221019132620.png)

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221019133915.png" alt="image-20221019133913964" style="zoom:67%;" />





## 第五章、中央处理机

### CPU的组成和功能

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102120701.png" alt="image-20221102120659746" style="zoom:67%;" />



取指令的时候不能进行数据读写

指令和数据没有放在一起 - **哈弗结构**

1. 由**PC**指出指令地址，暂存在**IR**中
2.  **CU**控制单元 译码后由**时序电路**发出不同的信号，**操作控制器**进行相应操作
3. ALU、通用寄存器组、数据缓冲寄存器、程序状态字寄存器

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221102121001179.png" alt="image-20221102121001179" style="zoom:67%;" />

#### CPU结构图

![image-20221102122459182](https://gitee.com/lynbz1018/image/raw/master/img/20221102122500.png)

#### CPU中的主要寄存器

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102123032.png" alt="image-20221102123031301" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102123042.png" alt="image-20221102123040865" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102123410.png" alt="image-20221102123408377" style="zoom:67%;" />

#### 控制器的组成

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102124457.png" alt="image-20221102124455934" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102125215.png" alt="image-20221102125214646" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102130040.png" alt="image-20221102130039150" style="zoom:67%;" />



### 指令周期

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102131623.png" alt="image-20221102131622626" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102131733.png" alt="image-20221102131732288" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102132505.png" alt="image-20221102132504102" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102133709.png" alt="image-20221102133707778" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140251.png" alt="image-20221102140250225" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140343.png" alt="image-20221102140341996" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140348.png" alt="image-20221102140347234" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140356.png" alt="image-20221102140355214" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140406.png" alt="image-20221102140404818" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140427.png" alt="image-20221102140425967" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140434.png" alt="image-20221102140433035" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140439.png" alt="image-20221102140438394" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140451.png" alt="image-20221102140449737" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140500.png" alt="image-20221102140459066" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140508.png" alt="image-20221102140506966" style="zoom: 50%;" />

#### 用方框图表示

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140516.png" alt="image-20221102140515515" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221102140523.png" alt="image-20221102140521965" style="zoom: 50%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221109123630.png" alt="image-20221109123627974" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221109124753662.png" alt="image-20221109124753662" style="zoom:67%;" />



### 时序产生器和控制方式

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221109125138869.png" alt="image-20221109125138869" style="zoom: 67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221109130232.png" alt="image-20221109130230269" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221109130745603.png" alt="image-20221109130745603" style="zoom:50%;" />



### 微程序控制器

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221109132245661.png" alt="image-20221109132245661" style="zoom: 67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221109132320724.png" alt="image-20221109132320724" style="zoom: 67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221109133240133.png" alt="image-20221109133240133" style="zoom:67%;" />

![image-20221109134851101](https://gitee.com/lynbz1018/image/raw/master/img/20221109134853.png)

![image-20221109134905194](https://gitee.com/lynbz1018/image/raw/master/img/20221109134907.png)



下址字段指出下一个指令地址

![image-20221109135818898](https://gitee.com/lynbz1018/image/raw/master/img/20221109135821.png)





#### 微程序控制技术

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221116121404.png" alt="image-20221116121403734" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221116121749.png" alt="image-20221116121748476"  />



相容性微操作，可以在同一个CPU周期内执行；

相斥，不能再同一个CPU周期内执行；

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116123111796.png" alt="image-20221116123111796" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116123502399.png" alt="image-20221116123502399" style="zoom:67%;" />



#### 微地址的形成方法

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116130019262.png" alt="image-20221116130019262" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221116130055.png" alt="image-20221116130054881" style="zoom:50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116130121822.png" alt="image-20221116130121822" style="zoom:67%;" />



#### 微指令格式

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221116130146.png" alt="image-20221116130145383" style="zoom:67%;" />



`11.16号12周ppt`

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116132454889.png" alt="image-20221116132454889" style="zoom:80%;" />

### 流水CPU

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221116133755.png" alt="image-20221116133754555" style="zoom:50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116134029816.png" alt="image-20221116134029816" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116134441132.png" alt="image-20221116134441132" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116134804008.png" alt="image-20221116134804008" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116134816008.png" alt="image-20221116134816008" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116135616646.png" alt="image-20221116135616646" style="zoom: 67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116135954790.png" alt="image-20221116135954790" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221116140333608.png" alt="image-20221116140333608" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221116141504.png" alt="image-20221116141502968" style="zoom:67%;" />

## 第六章、存储系统





#### 全相联映射

每一个主存块可以放到任意一个Cache块

标记位存放块号

比较Cache中的每一个块的标记位，直到匹配到了

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130120015.png" alt="image-20221130120014218" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130120449.png" alt="image-20221130120448576" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130120805.png" alt="image-20221130120804471" style="zoom:50%;" />



**优缺点**

空间利用率高；实现复杂，容量大使，查找麻烦

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130120901.png" alt="image-20221130120859979" style="zoom:50%;" />

#### 组相联映象

r = 1，每组有2块，叫2路组相联映射，

r = 2，每组4块，4路组相联映射

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130122115.png" alt="image-20221130122114282" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130122912.png" alt="image-20221130122911419" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130124444.png" alt="image-20221130124443304" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130124922.png" alt="image-20221130124921359" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130125159.png" alt="image-20221130125158644" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130130153.png" alt="image-20221130130152489" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130131641.png" alt="image-20221130131640271" style="zoom:67%;" />



### Cache替换策略

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130132135.png" alt="image-20221130132134863" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130132150.png" alt="image-20221130132149481" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130133456.png" alt="image-20221130133455265" style="zoom: 50%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130133909.png" alt="image-20221130133908614" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130134447.png" alt="image-20221130134446035" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130134835.png" alt="image-20221130134834128" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130134747.png" alt="image-20221130134746788" style="zoom:50%;" />

### 小结

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130134905.png" alt="image-20221130134904860" style="zoom:50%;" />



#### 多层次Cache存储器

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130135628.png" alt="image-20221130135627255" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221130141049.png" alt="image-20221130141048580" style="zoom:50%;" />



![image-20221130141446702](https://gitee.com/lynbz1018/image/raw/master/img/20221130141447.png)



## 总线系统

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207115308.png" alt="image-20221207115307179" style="zoom:50%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207115453.png" alt="image-20221207115452332" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207120504.png" alt="image-20221207120503265" style="zoom: 67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207120945.png" alt="image-20221207120943595" style="zoom: 67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207121354.png" alt="image-20221207121352990" style="zoom: 67%;" />

![image-20221207121708931](https://gitee.com/lynbz1018/image/raw/master/img/20221207121710.png)

#### 例题

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207121906.png" alt="image-20221207121904907" style="zoom:50%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207122640.png" alt="image-20221207122638947" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207124055.png" alt="image-20221207122658077" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207122718.png" alt="image-20221207122717557" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207122907.png" alt="image-20221207122905661" style="zoom:50%;" />



### PCI总线

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207123756.png" alt="image-20221207123754909" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207124047.png" alt="image-20221207124045993" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207124421.png" alt="image-20221207124419857" style="zoom:50%;" />





## 输入输出系统

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207125832.png" alt="image-20221207125830746" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207131030.png" alt="image-20221207131028883" style="zoom:50%;" />



CPU**的寻址能力和地址线总数有关**

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207134446.png" alt="image-20221207134445339" style="zoom:50%;" />

轮询起来每个设备之间是没有优先级的

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207135119.png" alt="image-20221207135118017" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207135452.png" alt="image-20221207135451600" style="zoom:50%;" />

数据传输不需要CPU的参与

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207135932.png" alt="image-20221207135931259" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207140940.png" alt="image-20221207140939233" style="zoom:50%;" />

第一种效率最低 完全串行

第二种 适合速度差异大 少量处理的

第三种适合 高速 大量的

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221207141425.png" alt="image-20221207141424728" style="zoom:50%;" />



#### 10.2程序中断控制技术

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214121545.png" alt="image-20221214121544181" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214121903.png" alt="image-20221214121902499" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214121953.png" alt="image-20221214121952779" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214122342.png" alt="image-20221214122341597" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214122840.png" alt="image-20221214122838988" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214123212.png" alt="image-20221214123211770" style="zoom:50%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214124528.png" alt="image-20221214124527654" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214131523.png" alt="image-20221214131522736" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214131507.png" alt="image-20221214131506338" style="zoom:50%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214133448.png" alt="image-20221214133447193" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214133505.png" alt="image-20221214133504364" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214133521.png" alt="image-20221214133520533" style="zoom:50%;" />







<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221214134501.png" alt="image-20221214134500220" style="zoom:50%;" />







