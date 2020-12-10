# 环境
FROM centos
# 作者信息
MAINTAINER jwen "452321360@qq.com"

# 复制JDK环境
COPY jdk1.8.0_211 jdk1.8.0_211
# 配置环境变量
ENV JAVA_HOME=C:\Program Files\Java\jdk1.8.0_211
ENV PATH=$JAVA_HOME/bin:$PATH
ENV CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
# 拷贝jar
COPY springcloud-demo-1.0-SNAPSHOT.jar .
ADD springcloud-demo-1.0-SNAPSHOT.jar app.jar
COPY application.yml .
# 爆漏的端口号
EXPOSE 8081
# 执行命令
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=application.yml"]