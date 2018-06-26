FROM openjdk:8-jdk
 
WORKDIR /home

ARG confenv
ARG dev_meta

ENV confenv=${confenv}
ENV dev_meta=${dev_meta}

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY ./ ./

EXPOSE 2224

CMD java -jar -Dapp.id=microserver-vue-element -Denv=${confenv} -Ddev_meta=${dev_meta} -Dapollo.cluster=default target/microserver-vue-element.jar
