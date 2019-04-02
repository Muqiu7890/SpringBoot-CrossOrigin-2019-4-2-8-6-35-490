## Spring Boot Restful

### 练习描述
- 在`UserController`中实现一个接口满足以下要求
  1. 实现一个GET请求，查出所有的用户信息
  2. 接口访问地址：（/api/users）
  3. 使用注解：@CrossOrigin实现跨域请求 
```
package com.example.SpringBootRestful.controller;

public class UserController {
    //todo: write code
}

```

### 环境描述
- java8
- Intellij-IDEA

### 如何开始
- 克隆模版库
- 启动项目，若出现 Tomcat started on port(s): 8080 (http) 字样
- 打开`web/index.html`页面后输出如下内容，说明项目启动成功。
```
使用注解@CrossOrigin实现跨域
还没有跨域，赶快去跨域吧

```


### 输出规范
-  在`UserController`中按照练习描述实现（api/users）接口。
-  在浏览器中打开`web/index.html`页面后输出如下内容，说明项目跨域成功。
```
使用注解@CrossOrigin实现跨域
[{"id":1,"name":"小明"},{"id":2,"name":"小红"},{"id":3,"name":"小花"}]

```
-  并且在项目根目录中添加` web/index.html `在浏览器打开的截图
