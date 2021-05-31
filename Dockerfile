FROM openjdk:8u191-jre-alpine3.8

WORKDIR /usr/share/finance-auto

#add libs and compiled jars.
ADD target/finance-automation.jar finance-automation.jar

ADD target/finance-automation-tests.jar finance-automation-tests.jar

ADD target/libs libs

#adding suite files
ADD *_suite.xml .

ENTRYPOINT java -cp finance-automation.jar:finance-automation-tests.jar:libs/* -DBROWSER=$BROWSER -DHUB_HOST=$HUB_HOST -DAPP_URL=$APP_URL org.testng.TestNG $SUITE_FILE
