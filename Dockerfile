FROM openjdk:8u191-jre-alpine3.8

RUN apk add curl jq

WORKDIR /usr/share/finance-auto

#add libs and compiled jars.
ADD target/finance-automation.jar finance-automation.jar

ADD target/finance-automation-tests.jar finance-automation-tests.jar

ADD target/libs libs

#adding suite files
ADD *_suite.xml .

ADD healthcheck.sh healthcheck.sh

ENTRYPOINT sh healthcheck.sh