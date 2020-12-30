# spaceDatabase
A  REST api for tracking building access

project status: active development
## Requirments
JDK 11+, Gradle, MAMP

## Quick Start
install maven https://maven.apache.org/install.html
check for maven version
```mvn -v```

install JDK 8+ https://openjdk.java.net/install/
check for jdk version
```java -version```

install MAMP & setup Database https://www.mamp.info/en/downloads/

after install:
- open MAMP
- start MAMP server
- click MAMP webstart navigate to Tools>phpmyadmin
- create database New>Add user account
- username=spaceDatabase hostname=localhost password=spaceDatabase
- check "Create database with same name and grant all privileges"
- click Go

##### Install
```mvn install```
##### Run
```mvn spring-boot:run``` 
## REST API 
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/a05ab87ebb364ace1eff)