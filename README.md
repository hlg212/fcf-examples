# FCF-examples
 基于 [FCF](https://github.com/hlg212/FCF) 框架的例子工程

## 工程如何启动
所有的例子工程都是按照微服务的设计，本地不存储配置，默认情况下是需要连接到”配置中心“。

如果还没有部署微服务环境，可以将框架默认配置下载到本地（参考: [不连接配置中心](https://github.com/hlg212/fcf-examples/local) ），然后进行启动;

建议配置都存储到配置中心，否则后期对于配置的管理会比较麻烦；

## 快速开始

### 1. 下载运行[配置中心](https://github.com/hlg212/FCP/tree/master/config)

*注意： 也可不运行配置中心，将配置拷贝到服务中

这里建议启动配置中心， 方便后续的服务
```
git clone https://github.com/hlg212/FCP.git
```
##### cmd 
```
cd ./FCP
mvn install 
cd config 
mvn install
cd service-config/target
java -jar service-config-exec.jar
```

默认情况下端口为8181

*请注意，这个只是为了演示，所以配置中心的配置存放在本地

*正常的环境会配置svn或者git存储配置


### 2. 设置配置中心地址
建议采用host方式;
##### 配置host
window: 打开添加 C:\Windows\System32\drivers\etc\hosts 
```text
127.0.0.1  fcf.config.com
```

##### 直接指定
打开项目配置 curdie\service-curdie\src\main\resources
```yaml
fcf:
  config:
    uri: http://localhost:8181/config/svn
```
或者通过参数传入 
``
-Dfcf.config.uri=http://localhost:8181/config/svn
``

### 3. 下载运行任何例子
如：[零代码、增、删、改、查、导入、导出](https://github.com/hlg212/fcf-examples/tree/master/curdie)

```
git clone https://github.com/hlg212/fcf-examples.git
```

##### cmd
```
cd ./fcf-examples
mvn install 
cd curdie 
mvn install
cd service-curdie/target
// 
java -jar service-curdie-exec.jar

//如果没有配置host
java -jar service-curdie-exec.jar -Dfcf.config.uri=http://localhost:8181/config/svn

```

##### idea 
open -> fcf-examples

选择 pom.xml 右击 Add as Maven Project

选择 curdie/pom.xml 右击 Add as Maven Project

运行 service-curdie Application

![image](https://raw.githubusercontent.com/hlg212/fcf-examples/master/images/run_application.png)

4. 打开swagger页面
```
http://localhost:8080/curdie/swagger-ui.html
```

## 模块介绍
- [不连接配置中心](https://github.com/hlg212/fcf-examples/tree/master/local)
- [零代码、增、删、改、查、导入、导出](https://github.com/hlg212/fcf-examples/tree/master/curdie)
- [零代码、增、删、改、查](https://github.com/hlg212/FCP)
- [保存编写业务](https://github.com/hlg212/FCP)
- [自动填充](https://github.com/hlg212/FCP)
- [定时任务](https://github.com/hlg212/fcf-examples)
- [文件上传、下载](https://github.com/hlg212/fcf-examples)
- [业务增加缓存](https://github.com/hlg212/FCP)
- [缓存与业务分离](https://github.com/hlg212/FCP)
- [多服务集成](https://github.com/hlg212/FCP)
- [数据修改日志](https://github.com/hlg212/FCP)
- [自定义导入导出](https://github.com/hlg212/FCP)
- [swagger模拟登陆](https://github.com/hlg212/FCP)
- [服务之间调用](https://github.com/hlg212/FCP)
- [feign接口快速实现](https://github.com/hlg212/FCP)
- [feign接口泛型](https://github.com/hlg212/FCP)
- [调用链与业务日志](https://github.com/hlg212/FCP)
- [数据库版本控制](https://github.com/hlg212/FCP)
- [数据权限](https://github.com/hlg212/FCP)


## 交流反馈
* 交流请进群：
    * QQ： 643083402
    * 微信：
* 个人邮箱：xiaolaoban212@qq.com

## License

See the [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0) file for details.