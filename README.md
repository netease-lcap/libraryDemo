# libraryDemo
Demo of developing dependency libraries for code-wave extensions

开发指南：
https://community.codewave.163.com/CommunityParent/fileIndex?filePath=40.%E6%89%A9%E5%B1%95%E4%B8%8E%E9%9B%86%E6%88%90%2F10.%E6%89%A9%E5%B1%95%E5%BC%80%E5%8F%91%E6%96%B9%E5%BC%8F%2F30.%E6%9C%8D%E5%8A%A1%E7%AB%AF%E6%89%A9%E5%B1%95%E5%BC%80%E5%8F%91%2F10.%E4%BE%9D%E8%B5%96%E5%BA%93%E5%BC%80%E5%8F%91%2F10.%E6%9C%8D%E5%8A%A1%E7%AB%AF%E4%BE%9D%E8%B5%96%E5%BA%93%E5%BC%80%E5%8F%91%E6%8C%87%E5%8D%97.md&version=3.3

## Installation
执行jar/nasl-nasl-metadata-maven-plugin-1.3.0/install.bat或install.sh，安装低代码依赖库打包插件。
```bash
mvn install:install-file -Dfile="nasl-metadata-maven-plugin-1.3.0.jar" -DpomFile="pom.xml"
```
## 结构说明
