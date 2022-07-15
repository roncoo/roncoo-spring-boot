# roncoo-spring-boot

## 说明

* Spring Boot官方提供了很多第三方的框架集成，但是在国内还有很多优秀的框架没有进行集成，因此领课决定进行对Spring官方没有支持的框架进行集成，这样也方便大家的使用。
* 为了方便使用，我们已经把其发布在Maven的中央库，可以直接引用

## 更新

* 2022-07-15 升级shiro的版本到1.7.1
* 2021-09-16 升级MinIO的版本到8.3.0
* 2021-03-03 优化增加MinIO和FastDFS的启用开关
* 2021-02-20 集成MinIO，并升级xxl-job的版本
* 2021-01-20 集成FastDFS，并升级Spring Boot的版本
* 2020-11-16 修复xxl-job本地启动产生端口冲突的bug
* 2019-12-16 升级xxl-job版本到2.1.2
* 2019-12-09 集成xxl-job并升级Spring Boot的版本，移除druid，因为官方已经集成，这里不再维护
* 2019-01-05 升级Spring Boot的版本
* 2017-11-07 集成Shiro并升级Spring Boot的版本
* 2017-04-20 集成国内优秀的数据链接池Druid

## 使用说明
```
<dependency>
    <groupId>com.roncoo</groupId>
    <artifactId>roncoo-spring-boot-starter-minio</artifactId>
    <version>建设使用最新版</version>
</dependency>

<dependency>
    <groupId>com.roncoo</groupId>
    <artifactId>roncoo-spring-boot-starter-fastdfs</artifactId>
    <version>建设使用最新版</version>
</dependency>

<dependency>
    <groupId>com.roncoo</groupId>
    <artifactId>roncoo-spring-boot-starter-xxl-job</artifactId>
    <version>建设使用最新版</version>
</dependency>

<dependency>
    <groupId>com.roncoo</groupId>
    <artifactId>roncoo-spring-boot-starter-shiro</artifactId>
    <version>建设使用最新版</version>
</dependency>
```
