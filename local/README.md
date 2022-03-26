# Local
该服务是为了说明不连接配置中心，采用本地配置的方式启动服务。

不是很推荐这种将配置拷贝到本地的方式，将配置散落在服务中会提高后期修改运维的成本

## 说明
首先先关闭启动连接配置中心，通过下面的配置（bootstrap.yml）：
```yaml
# 关闭配置中心
spring:
  cloud:
    config:
      enabled: false
```

/config/common 存储了框架公共配置；

两种方式引用:
一种是将框架中的配置文件复制到config目录；
另一种是在启动时加载框架中的配置,如：-Dspring.config.additional-location=classpath:/config/common/
然后按照下面的方式进行加载
```
spring:
    profiles:
        include:
          - common
          - common-actuator
          - common-application
          - common-db
          - common-esb
          - common-log
          - common-mq
          - common-oauth
          - common-rc
          - common-redis
```
尽量部署一个稳定的配置中心。

## License

See the [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0) file for details.