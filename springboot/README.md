# springboot
 不使用FCF提供的模板工程
 
 比如采用springboot的工程，然后引入框架包

 本例子只是为了说明项目内部存在自己的构建相关的控制时如何引用FCF；

## POM
引用依赖；

```xml
<dependency>
    <groupId>io.github.hlg212.fcf</groupId>
    <artifactId>fcf-starter</artifactId>
    <version>${fcf.version}</version>
</dependency>
```
因为存在可能冲突的包，需要再加上下面的配置
```xml
    <dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>21.0</version>
        </dependency>
    </dependencies>
</dependencyManagement>
```

## 代码复制
将 [curdie](https://github.com/hlg212/fcf-examples/tree/master/curdie)  代码复制到本工程，然后启动;
