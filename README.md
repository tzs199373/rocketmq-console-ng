# RocketMQ-Console-Ng

## How To Install

### With Docker

- get docker image

```
mvn clean package -Dmaven.test.skip=true docker:build
```

or

```
docker pull styletang/rocketmq-console-ng
```

- run it (change namesvrAddr and port yourself)

```
docker run -e "JAVA_OPTS=-Drocketmq.namesrv.addr=127.0.0.1:9876 -Dcom.rocketmq.sendMessageWithVIPChannel=false" -p 8080:8080 -t styletang/rocketmq-console-ng
```

### Without Docker

require java 1.7

```
mvn spring-boot:run
```

or

```
mvn clean package -Dmaven.test.skip=true
java -jar target/rocketmq-console-ng-1.0.0.jar
```

#### Tips

- if you download package slow,you can change maven's mirror(maven's settings.xml)

  ```
  <mirrors>
      <mirror>
            <id>alimaven</id>
            <name>aliyun maven</name>
            <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
            <mirrorOf>central</mirrorOf>        
      </mirror>
  </mirrors>
  ```

- if you use the rocketmq < 3.5.8,please add -Dcom.rocketmq.sendMessageWithVIPChannel=false when you start rocketmq-console-ng(or you can change it in ops page)

- change the rocketmq.config.namesrvAddr in resource/application.properties.(or you can change it in ops page)

## UserGuide

[English](https://github.com/apache/incubator-rocketmq-externals/blob/master/rocketmq-console/doc/1_0_0/UserGuide_EN.md)

[中文](https://github.com/apache/incubator-rocketmq-externals/blob/master/rocketmq-console/doc/1_0_0/UserGuide_CN.md)

## Contact

- Issue / Pull Request
- You can join us and make a contribute for rocketmq-console.

[RocketMQ Contact](http://rocketmq.apache.org/about/contact/)

#### Mailing Lists

DEV dev@rocketmq.incubator.apache.org

USERS users@rocketmq.incubator.apache.org