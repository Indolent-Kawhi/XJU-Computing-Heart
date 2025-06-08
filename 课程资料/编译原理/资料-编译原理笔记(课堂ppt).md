



##  Compilers

### 题型分布

综合体：1.NFA - DFA 2.语法树 3.LL1分析 4.LRK分析

计算题：1.文法和语言 2.中间代码 3.正规式NFA等价转换 4.参数传递 5.语义子程序 属性文法 6.划分基本块 画出流图



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212223514.png" alt="image-20221212223513662" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212233849.png" alt="image-20221212233848145" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212233906.png" alt="image-20221212233905273" style="zoom:50%;" />

![image-20221212233932341](https://gitee.com/lynbz1018/image/raw/master/img/20221212233933.png)



### 参考书目

![image-20220829125342280](https://gitee.com/lynbz1018/image/raw/master/img/20220829125343.png)



![image-20220829125355326](https://gitee.com/lynbz1018/image/raw/master/img/20220829125356.png)



### 课程简介

* 主要讲十章

![image-20220829125732456](https://gitee.com/lynbz1018/image/raw/master/img/20220829125733.png)

* 课时分配

![image-20220829125815134](https://gitee.com/lynbz1018/image/raw/master/img/20220829125816.png)



## Week 1

`2022/8/29`

## 一、引论

#### 1.1翻译程序 定义

* 翻译程序：将源程序转换成目标程序的程序，是汇编程序，编译程序以及各种变换程序的总称。
* 编译程序：将高级语言翻译成**低级语言程序**（汇编语言或机器语言）
* 目标程序：可以是介于源程序和机器语言之间的**“中间语言”**

![image-20220829131235765](https://gitee.com/lynbz1018/image/raw/master/img/20220829131236.png)

![image-20220829131307914](https://gitee.com/lynbz1018/image/raw/master/img/20220829131308.png)

​      

* **目标程序**：对源程序逐条解释执行，**不生成目标代码**
* 翻译程序：汇编程序、编译程序、解释程序

![image-20220829132019695](https://gitee.com/lynbz1018/image/raw/master/img/20220829132020.png)

* 编译程序 - C语言

![image-20220829133656523](https://gitee.com/lynbz1018/image/raw/master/img/20220829133657.png)

* 解释程序 - python

![image-20220829133726403](https://gitee.com/lynbz1018/image/raw/master/img/20220829133727.png)

* 编译-解释程序 Java

![image-20220829133948287](https://gitee.com/lynbz1018/image/raw/master/img/20220829133949.png)



##### 课堂习题

* **汇编程序**相对编译程序**工作更简单**

* **解释程序**跟适合**规模较小**的程序

****

#### 1.2编译过程和编译程序的结构

* 编译过程： 将高级语言翻译成**等价目标程序**的过程。
  * 词法分析 - 语法分析 - 语义分析 - 中间代码生成 - 代码优化 - 目标代码生成

![image-20220829134435727](https://gitee.com/lynbz1018/image/raw/master/img/20220829134436.png)

##### 编译过程

##### 1.词法分析 

* 分析和识别出来单词
* 输出单词列表

![image-20220829135400433](https://gitee.com/lynbz1018/image/raw/master/img/20220829135401.png)



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220905124205.png" alt="image-20220905124203945" style="zoom:33%;" />



##### 2.语法分析



![image-20220829140137430](https://gitee.com/lynbz1018/image/raw/master/img/20220829140138.png)



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220905123109.png" alt="image-20220905123108750" style="zoom:33%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220905123521.png" alt="image-20220905123519929" style="zoom:33%;" />



##### 3.语义分析

* 进行语义审查

* 这个10的高精度转化就是语义分析完成的

![image-20220829140837932](https://gitee.com/lynbz1018/image/raw/master/img/20220829140838.png)



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220905123315.png" alt="image-20220905123314797" style="zoom:25%;" />



##### 4.中间代码的生成

* 便于优化
* 便于移植

![image-20220829141045430](https://gitee.com/lynbz1018/image/raw/master/img/20220829141046.png)

* 例题

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220829141215.png" alt="image-20220829141214117" style="zoom: 50%;" />

##### 5.代码优化

* 为了得到高质量（省时间、省空间）的程序。



##### 6.目标代码生成

* 绝对指令代码：直接装入内存中确定的位置
* 可重定位的指令代码：需要时装入内存
* 汇编指令代码



![image-20220829141522431](https://gitee.com/lynbz1018/image/raw/master/img/20220829141523.png)



* 结构图
  * 六个阶段 八个功能

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220905120634.png" alt="image-20220905120633613" style="zoom: 33%;" />



##### 表格管理 出错处理

表格管理：表示编译程序具有表格管理功能1

出错处理： 语义错误不一定能全部找到

![image-20220905120549955](https://gitee.com/lynbz1018/image/raw/master/img/20220905120551.png)

##### Def

###### 遍

遍：从头到尾扫描一次成为一遍

![image-20220905121613610](https://gitee.com/lynbz1018/image/raw/master/img/20220905121614.png)

###### 前端后端

前端：与源程序有关的部分，即编译过程的前五个部分

后端：与目标机有关的部分，即目标程序代码生成和优化

![image-20220905121921576](https://gitee.com/lynbz1018/image/raw/master/img/20220905121922.png)

##### 编译程序结构

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220905122431.png" alt="image-20220905122430127" style="zoom:50%;" />





## Week 2

`2022/9/5`

## 二、文法和语言



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220905125441.png" alt="image-20220905125439945" style="zoom:33%;" />



#### 2.1语言概述

* 语言：是在某个特定的字母表上的符号串组成的集合。
  * 是由句子组成的集合，是由一组记号组成的集合。



* 语法：构成语言句子的各个记号之间的组合规律
* 语义：表示各个记号的特定含义
* 语用：表示在各个记号所出现的行为中，它的来源、使用和影响



* 形式语言：只考虑语法

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220905131036.png" alt="image-20220905131035200" style="zoom:50%;" />



#### 2.2符号和符号串

* 字母表：符号的非空有限集合
* 符号：字母表中的元素，不能分解的最小单位
* 符号串：字母表中符号组成的任何又穷序列
* 符号串集合：字母表上的符号串组合成的集合

* 空串：不包含任符号的符号串

​     

* 前缀： abc，前缀有 **空串**、a、ab、abc

* 后缀、子串
* 真前缀，真后缀：不和自身相等的非空前缀或后缀



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220905132344.png" alt="image-20220905132342997" style="zoom:50%;" />



##### 符号串的运算

###### 闭包

![image-20220905134632685](https://gitee.com/lynbz1018/image/raw/master/img/20220905134633.png)





#### 2.3文法和语言的形式定义

语言的描述可以是**生成**或**识别**方式

**生成**：BNF范式是一种元语言，用来描述其它语言。

**大写字母A B ... 为非终结符**

{}  可重复

[] 可选项

![image-20220905140949034](https://gitee.com/lynbz1018/image/raw/master/img/20220905140950.png)

**识别**的方式描述语言

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220919120605.png" alt="image-20220919120604532" style="zoom:67%;" />

##### 文法定义

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220919121220.png" alt="image-20220919121219500" style="zoom:80%;" />

##### 推导定义

有一个文法，存在一对属于V*的任意符号，使得v和w在串头和串尾加上那一对符号后分别等于那个文法

则说w是v的直接推到

![image-20220919121823646](https://gitee.com/lynbz1018/image/raw/master/img/20220919121824.png)

* <u>直接推到</u>  *+: 至少一步推到*     ***: 0步或至少一步推到**

![image-20220919123119778](C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220919123119778.png)

**例子**

```markdown
Vn = {A, B};  // 定义大写字母是非终结符 Vt = {a, b}; S = A;
B->a 推导出 Bb => ab
```

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220919122540426.png" alt="image-20220919122540426" style="zoom:50%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220919124411.png" alt="image-20220919124410070" style="zoom:67%;" />

##### 句型 句子 语言

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220919130517.png" alt="image-20220919130515978" style="zoom:80%;" />

当一个语言是无穷的时候一定是**递归**实现的

如果一个语言可以有两种文法表示，则这两个文法称为**等价文法**

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220919140531284.png" alt="image-20220919140531284" style="zoom:67%;" />



#### 2.4文法和语言的分类

* 0型文法，没有要求
* 1型文法，要求右边串长**大于等于**左边

* 2型文法，<u>左部只有一个非终结符</u> `所有的大写字符 A B C ... 都是非终结符`

* 3型文法，右部没有非终结符，有的话就只有一个终结符B，在右边为右线性

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220926120451.png" alt="image-20220926120449831" style="zoom: 67%;" />



#### 2.5上下文无关文法及其语法树

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220926123511911.png" alt="image-20220926123511911" style="zoom:67%;" />

![image-20220926125123247](https://gitee.com/lynbz1018/image/raw/master/img/20220926125124.png)

**语法树**

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220926125533.png" alt="image-20220926125532003" style="zoom:80%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220926125602949.png" alt="image-20220926125602949" style="zoom:80%;" />

短语 - 简单短语 - 句柄

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20220926130317.png" alt="image-20220926130316141" style="zoom:80%;" />

##### 必考题 例题

![image-20220926132559539](https://gitee.com/lynbz1018/image/raw/master/img/20220926132600.png)

**注意括号也要写**

![image-20220926140046355](https://gitee.com/lynbz1018/image/raw/master/img/20220926140047.png)



##### 文法二义性

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220926140400764.png" alt="image-20220926140400764" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20220926141118410.png" alt="image-20220926141118410" style="zoom:80%;" />



#### 2.6句型分析

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221010122203.png" alt="image-20221010122202354" style="zoom:67%;" />



**多余规则**

![image-20221010123603874](https://gitee.com/lynbz1018/image/raw/master/img/20221010123605.png)

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221010124554897.png" alt="image-20221010124554897" style="zoom:67%;" />

**有害规则**

![image-20221010123614897](https://gitee.com/lynbz1018/image/raw/master/img/20221010123616.png)



## 三、词法分析

**Week7**

`2022/10/10`



<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221010124809071.png" alt="image-20221010124809071" style="zoom: 50%;" />



<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221010125330852.png" alt="image-20221010125330852" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221010125556333.png" alt="image-20221010125556333" style="zoom:67%;" />

### 3.2单词的描述工具

##### 正规式

![image-20221010130205052](https://gitee.com/lynbz1018/image/raw/master/img/20221010130206.png)



**例子**

![image-20221010130957321](https://gitee.com/lynbz1018/image/raw/master/img/20221010130958.png)

![image-20221010131119796](https://gitee.com/lynbz1018/image/raw/master/img/20221010131120.png)



##### 正规文法转化成正规文法

*是闭包

![image-20221010131802622](https://gitee.com/lynbz1018/image/raw/master/img/20221010131803.png)



正规式转化成正规文法

![image-20221010135031950](https://gitee.com/lynbz1018/image/raw/master/img/20221010135033.png)

### 3.3自动机

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221010135422095.png" alt="image-20221010135422095" style="zoom:50%;" />

##### 有穷自动机

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221010135637682.png" alt="image-20221010135637682" style="zoom: 67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221010140437.png" alt="image-20221010140436736" style="zoom:67%;" />



从起始 到终结点 路径就是字符串

若一个点既是初态点又是终态点，则空串是该自动机可接受

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221010140845.png" alt="image-20221010140844781" style="zoom: 67%;" />

例题

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221010141448942.png" alt="image-20221010141448942" style="zoom:67%;" />



##### 不确定的有穷自动机

![image-20221010141519639](https://gitee.com/lynbz1018/image/raw/master/img/20221010141520.png)



注意：初态有一个**从外边的射入弧**，终态有一个**同心圆**

![image-20221017120203745](https://gitee.com/lynbz1018/image/raw/master/img/20221017120204.png)





##### NFA转换成等价的DFA

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221017121257.png" alt="image-20221017121256155" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221017122234193.png" alt="image-20221017122234193" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221017122357236.png" alt="image-20221017122357236" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221017123557807.png" alt="image-20221017123557807" style="zoom:67%;" />

###### 例题

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221017124854389.png" alt="image-20221017124854389" style="zoom:67%;" />

##### DFA的简化

![image-20221017125248644](https://gitee.com/lynbz1018/image/raw/master/img/20221017125249.png)



**注意：** 一个集合 经过相同符号后到达相同的转态 也可以合并为一个

![image-20221017130340352](https://gitee.com/lynbz1018/image/raw/master/img/20221017130341.png)



##### 必考题 例题

![image-20221017133827031](https://gitee.com/lynbz1018/image/raw/master/img/20221017133828.png)

##### 正规式和有穷自动机的转换

<u>如果正规式是闭包</u> 空弧不能任意省略掉

![image-20221017140356227](https://gitee.com/lynbz1018/image/raw/master/img/20221017140357.png)

![image-20221017135751392](https://gitee.com/lynbz1018/image/raw/master/img/20221017135752.png)

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221017140216502.png" alt="image-20221017140216502" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221017141650.jpg" alt="b8aa0aa34ba432d4afec6db218698df" style="zoom: 50%;" />

![image-20221024123225957](https://gitee.com/lynbz1018/image/raw/master/img/20221024123227.png)

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221024123510.png" alt="image-20221024123509542" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221024123902519.png" alt="image-20221024123902519" style="zoom:67%;" />

![image-20221024124758524](https://gitee.com/lynbz1018/image/raw/master/img/20221024124759.png)

![image-20221024124942452](https://gitee.com/lynbz1018/image/raw/master/img/20221024124943.png)





## 四、语法分析

![image-20221024125540323](https://gitee.com/lynbz1018/image/raw/master/img/20221024125541.png)

### LL(1)文法

![image-20221024130518069](https://gitee.com/lynbz1018/image/raw/master/img/20221024130519.png)

##### FIRST集合

![image-20221024132109236](https://gitee.com/lynbz1018/image/raw/master/img/20221024132110.png)



###### 例题

可以推到出空 - 就FIRST去空  -- 都能推导出来空就并上一个空

不能推导出空 - 就写一个不写后边的

![image-20221024134021492](https://gitee.com/lynbz1018/image/raw/master/img/20221024134023.png)



##### FOLLOW集合

![image-20221024140616133](https://gitee.com/lynbz1018/image/raw/master/img/20221024140617.png)

![image-20221024140917192](https://gitee.com/lynbz1018/image/raw/master/img/20221024140918.png)

###### 例题

FOLLOW(S), 看右部有哪些有S

有S的右部，看S的右边，如果能推导出空就用First去空并上左边的Follow

不能推到出空就是S右边的First

![image-20221031122041898](https://gitee.com/lynbz1018/image/raw/master/img/20221031122129.png)

![image-20221024141423288](https://gitee.com/lynbz1018/image/raw/master/img/20221031122031.jpg)



##### SELECT集合

![image-20221031122511313](https://gitee.com/lynbz1018/image/raw/master/img/20221031122512.png)

![image-20221031122948632](https://gitee.com/lynbz1018/image/raw/master/img/20221031122949.png)

###### 例题

![image-20221031123653076](https://gitee.com/lynbz1018/image/raw/master/img/20221031123654.png)



#### 消除左递归 提取左公因子

![image-20221031132601309](https://gitee.com/lynbz1018/image/raw/master/img/20221031132602.png)

![image-20221031133739121](https://gitee.com/lynbz1018/image/raw/master/img/20221031133740.png)



#### 表驱动分析法

![image-20221031134702339](https://gitee.com/lynbz1018/image/raw/master/img/20221031134703.png)



##### 题型

先进行改写 - 判别是否是LL1文法

![image-20221031134940838](https://gitee.com/lynbz1018/image/raw/master/img/20221031134942.png)

![image-20221031135030886](https://gitee.com/lynbz1018/image/raw/master/img/20221031135032.png)

![image-20221031135132049](https://gitee.com/lynbz1018/image/raw/master/img/20221031135133.png)

![image-20221031140406186](https://gitee.com/lynbz1018/image/raw/master/img/20221031140407.png)



##### 例题

![image-20221107122842881](https://gitee.com/lynbz1018/image/raw/master/img/20221107122952.png)

![76a5e3e7eb16d243fd4998a0783a614](https://gitee.com/lynbz1018/image/raw/master/img/20221107122851.jpg)

**蓝色部分还要并上FOLLOW(S),**



### 作业

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221108203921921.png" alt="image-20221108203921921" style="zoom:80%;" />



![f40d668141bfc195b9b5d39fd3b656e](https://gitee.com/lynbz1018/image/raw/master/img/20221108204006.jpg)



![image-20221108203951833](https://gitee.com/lynbz1018/image/raw/master/img/20221108203953.png)



![2f284ac3cc377de938ffde5a8df4250](https://gitee.com/lynbz1018/image/raw/master/img/20221108203958.jpg)



## 五、自低向上优先分析

### 自底向上语法分析

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221107124307.png" alt="image-20221107124306394" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221107124407.png" alt="image-20221107124406018" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221107124655.png" alt="image-20221107124654224" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221107124702.png" alt="image-20221107124701162" style="zoom:67%;" />



### 算符优先分析

只考虑终结符，忽视非终结符

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221107124755.png" alt="image-20221107124754404" style="zoom: 50%;" />

#### 算符文法

OG 算符文法

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221107125254.png" alt="image-20221107125252349" style="zoom:67%;" />

<=> 符号里面都有一个dot

a优于b，a优先级等于b，并不能说明a b 的关系

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221107130002.png" alt="image-20221107130001675" style="zoom: 80%;" />

算符文法中，任意两个终结符之间**至多**有一种算符优先关系称为**算符优先文法**

a 优先 b， b 优先 a，a  b, b a顺序不一样

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221107131217154.png" alt="image-20221107131217154" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221107131403100.png" alt="image-20221107131403100" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221107131413848.png" alt="image-20221107131413848" style="zoom:80%;" />

**第一步**：求firstvt和lastvt

![image-20221107132308354](https://gitee.com/lynbz1018/image/raw/master/img/20221107132310.png)

**第二步**：算符优先关系表的构造

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221107133919.png" alt="image-20221107133917161" style="zoom: 80%;" />

**第三步**：算符优先分析算法

栈顶元素a 和 要进入的元素b 没有关系 -> 报错

​											 a<b a=b小于或等于 -> 进栈

a>b 规约，往栈底找等于的话就一直找，知道找到一个Xi-1 < Xi, 左部出站，右部进栈

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221107135120.png" alt="image-20221107135118024" style="zoom:80%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221107140223.png" alt="image-20221107140222126" style="zoom:80%;" />

##### 例题

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221114122602.png" alt="image-20221114122441234" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221114122558.png" alt="image-20221114122453497" style="zoom:67%;" />



### 最左素短语

短语、至少一个终结符、除自身不包含其他素短语

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221114123344.png" alt="image-20221114123342981" style="zoom: 80%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221114123627133.png" alt="image-20221114123627133" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221114125849006.png" alt="image-20221114125849006" style="zoom:80%;" />



## 六、LR分析

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221114130108.png" alt="image-20221114130107430" style="zoom: 50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221114130740662.png" alt="image-20221114130740662" style="zoom: 50%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221114130911170.png" alt="image-20221114130911170" style="zoom:50%;" />



<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221114133615281.png" alt="image-20221114133615281" style="zoom:67%;" />

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221114132431121.png" alt="image-20221114132431121" style="zoom: 50%;" />

##### LR(0)文法

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221114134242397.png" alt="image-20221114134242397" style="zoom:67%;" />

#### 例题

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221114135336.png" alt="image-20221114135334384" style="zoom:80%;" />

是LR(0)文法

<img src="C:%5CUsers%5Clyn95%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20221114140103188.png" alt="image-20221114140103188" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221121120702.png" alt="image-20221114141723174" style="zoom:67%;" />

![d8080c12e082e124a2b44b343259d9a](https://gitee.com/lynbz1018/image/raw/master/img/20221114141742.jpg)

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221121121739.png" alt="image-20221121121732490" style="zoom:50%;" />

规约看产生式的右部有几个就弹出几个，然后左部入栈，然后看goto(左边的转态栈号和符号栈)是谁就入状态栈

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221121122933.png" alt="image-20221121122932381" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221121122949.png" alt="image-20221121122942531" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221121130112.png" alt="image-20221121130110909" style="zoom:50%;" />



#### SLR(1)

![image-20221121130740767](https://gitee.com/lynbz1018/image/raw/master/img/20221121130741.png)



看移进和左部follow都是空

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221121131050.png" alt="image-20221121131049667" style="zoom: 67%;" />



##### 例题

![066d73670ea682eb8a62151aa9c343e](https://gitee.com/lynbz1018/image/raw/master/img/20221121135946.jpg)![image-20221121135255889](https://gitee.com/lynbz1018/image/raw/master/img/20221121135257.png)

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128121729.png" alt="image-20221128121728198" style="zoom:67%;" />

![image-20221121140845253](https://gitee.com/lynbz1018/image/raw/master/img/20221121140846.png)



![ff92534e9090a41917f825a29563ddf](https://gitee.com/lynbz1018/image/raw/master/img/20221121140854.jpg)



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128121531.png" alt="image-20221128121530485" style="zoom:67%;" />



#### LR(1)分析

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128122519.png" alt="image-20221128122517908" style="zoom:50%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128122452.png" alt="image-20221128122451661" style="zoom: 50%;" />

![](https://gitee.com/lynbz1018/image/raw/master/img/20221128123338.png)

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128130310.png" alt="image-20221128130308986" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128131225.png" alt="image-20221128131223881" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128131236.png" alt="image-20221128131235702" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128132100.png" alt="image-20221128132059429" style="zoom:50%;" />



#### LALR(1)

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128133354.png" alt="image-20221128133353275" style="zoom: 50%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221201130715.png" alt="image-20221201130714656" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221201130620.png" alt="image-20221201130617781" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128133430.png" alt="image-20221128133429183" style="zoom:50%;" />



### 总结

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128133604.png" alt="image-20221128133603562" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128133920.png" alt="image-20221128133919576" style="zoom:50%;" />



## 七、语法制导翻译和中间代码生成

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128134450.png" alt="image-20221128134449548" style="zoom: 33%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128134458.png" alt="image-20221128134457624" style="zoom: 33%;" />



### 7.1属性文法

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128134916.png" alt="image-20221128134915339" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128135157.png" alt="image-20221128135155943" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128140342.png" alt="image-20221128140341674" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128140349.png" alt="image-20221128140348064" style="zoom:50%;" />

### 7.2语法制导翻译

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221128140425.png" alt="image-20221128140423979" style="zoom: 50%;" />

![image-20221205115850593](https://gitee.com/lynbz1018/image/raw/master/img/20221205115851.png)

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205120359.jpg" alt="894a3b57e12d92242c6785cb42a0e61" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205121146.png" alt="image-20221205121145191" style="zoom:67%;" />



### 7.3中间代码生成

主要掌握中间代码的表示形式

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205121411.png" alt="image-20221205121410104" style="zoom:50%;" />



#### 逆波兰式 必考

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205121929.png" alt="image-20221205121928354" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205122140.png" alt="image-20221205122139636" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205123023.png" alt="image-20221205123022023" style="zoom: 67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205123426.png" alt="image-20221205123425011" style="zoom:50%;" />

先改写为if语句

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205124902.png" alt="image-20221205124901654" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205125252.png" alt="image-20221205125251103" style="zoom:50%;" />

#### 三元式

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205125649.png" alt="image-20221205125648109" style="zoom:50%;" />

任意跳转的用/ ，4用的是/ 不是1

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205125819.png" alt="image-20221205125818907" style="zoom:50%;" />

for循环要改写成if语句加上goto语句， 

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205130555.png" alt="image-20221205130554147" style="zoom:50%;" />

##### 树形表示

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205130718.png" alt="image-20221205130717302" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205130725.png" alt="image-20221205130723993" style="zoom:50%;" />

##### 间接码表

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205131220.png" alt="image-20221205131219005" style="zoom:50%;" />



### 四元式

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205131540.png" alt="image-20221205131538923" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205131737.png" alt="image-20221205131736173" style="zoom:50%;" />



## 八、符号表

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205132136.png" alt="image-20221205132135151" style="zoom:67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205132323.png" alt="image-20221205132322552" style="zoom:50%;" />

![image-20221205133108815](https://gitee.com/lynbz1018/image/raw/master/img/20221205133109.png)

![image-20221205133146657](https://gitee.com/lynbz1018/image/raw/master/img/20221205133147.png)

![image-20221205133236895](https://gitee.com/lynbz1018/image/raw/master/img/20221205133237.png)

![image-20221205133245405](https://gitee.com/lynbz1018/image/raw/master/img/20221205133246.png)



## 九、存储

![image-20221205133701012](https://gitee.com/lynbz1018/image/raw/master/img/20221205133702.png)

![image-20221205133806944](https://gitee.com/lynbz1018/image/raw/master/img/20221205133808.png)





<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205133937.png" alt="image-20221205133936324" style="zoom: 80%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205134428.png" alt="image-20221205134427003" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221205134852.png" alt="image-20221205134851278" style="zoom:67%;" />

![image-20221205135055958](https://gitee.com/lynbz1018/image/raw/master/img/20221205135057.png)



### 9.3参数传递

![image-20221205140436171](https://gitee.com/lynbz1018/image/raw/master/img/20221205140437.png)



这个存储4分，存储策略2分

![image-20221205141133362](https://gitee.com/lynbz1018/image/raw/master/img/20221205141134.png)



## 代码优化

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212211312.png" alt="image-20221212211310805" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212211750.png" alt="image-20221212211749430" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212211815.png" alt="image-20221212211814549" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212211905.png" alt="image-20221212211904219" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212212125.png" alt="image-20221212212124052" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212212216.png" alt="image-20221212212215471" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212212457.png" alt="image-20221212212455926" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212212658.png" alt="image-20221212212657558" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212213542.png" alt="image-20221212213541444" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212213722.png" alt="image-20221212213616113" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212213715.png" alt="image-20221212213714145" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212213811.png" alt="image-20221212213809738" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212213935.png" alt="image-20221212213934078" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212214057.png" alt="image-20221212214055796" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212214308.png" alt="image-20221212214307389" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212215215.png" alt="image-20221212215214005" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212215438.png" alt="image-20221212215437796" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212221425.png" alt="image-20221212221423940" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212221503.png" alt="image-20221212221502181" style="zoom: 67%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212221826.png" alt="image-20221212221825188" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212222001.png" alt="image-20221212221959960" style="zoom:50%;" />



<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212222347.png" alt="image-20221212222346175" style="zoom: 50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212223147.png" alt="image-20221212223146157" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212222858.png" alt="image-20221212222857755" style="zoom:50%;" />

<img src="https://gitee.com/lynbz1018/image/raw/master/img/20221212223130.png" alt="image-20221212223129646" style="zoom:50%;" />