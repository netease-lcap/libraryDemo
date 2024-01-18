# libraryDemo
Demo of developing dependency libraries for code-wave extensions

开发指南：
https://community.codewave.163.com/CommunityParent/fileIndex?filePath=40.%E6%89%A9%E5%B1%95%E4%B8%8E%E9%9B%86%E6%88%90%2F10.%E6%89%A9%E5%B1%95%E5%BC%80%E5%8F%91%E6%96%B9%E5%BC%8F%2F30.%E6%9C%8D%E5%8A%A1%E7%AB%AF%E6%89%A9%E5%B1%95%E5%BC%80%E5%8F%91%2F10.%E4%BE%9D%E8%B5%96%E5%BA%93%E5%BC%80%E5%8F%91%2F10.%E6%9C%8D%E5%8A%A1%E7%AB%AF%E4%BE%9D%E8%B5%96%E5%BA%93%E5%BC%80%E5%8F%91%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8.md&version=3.3

## Installation
执行jar/nasl-nasl-metadata-maven-plugin-1.3.0/install.bat或install.sh，安装低代码依赖库打包插件。
```bash
mvn install:install-file -Dfile="nasl-metadata-maven-plugin-1.3.0.jar" -DpomFile="pom.xml"
```
## 结构说明
### basic-基础依赖库demo
### dubbo_biz_demo-dubbo业务依赖库demo
低代码ide中使用dubbo服务时，需要先引入低代码提供的spring-boot-starter-dubbo-tool基础dubbo依赖库。在此基础上，业务方可以编写多个调用dubbo方法的业务依赖库。
### filter-过滤器依赖库demo
### redis-基础redis依赖库（低代码官方基础依赖库初版）
### redis_replayprotect-redis重放攻击保护依赖库demo
redis业务依赖库demo，防重放实例。
低代码ide中使用redis服务时，需要先引入低代码提供的redis-template-tool基础redis依赖库。在此基础上，业务方可以编写多个调用dubbo方法的业务依赖库。
tips：当前低代码限制依赖的所有的包都不能是snapshot版本。（包括递归到的所有依赖包）

