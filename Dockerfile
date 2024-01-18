FROM ubuntu:22.04
LABEL maintainer="Ridwan Shariffdeen <rshariffdeen@gmail.com>"

RUN apt-get update && apt-get upgrade -y && apt-get autoremove -y
ENV DEBIAN_FRONTEND=noninteractive
ENV LANG=C.UTF-8

# install required softwares
RUN apt update \
    && apt install -y  \
    build-essential \
    bzip2 \
    curl  \
    git  \
    maven \
    nano \
    openjdk-11-jdk  \
    openjdk-11-jdk-headless \
    openssh-client  \
    patch  \
    patchutils \
    python3  \
    software-properties-common  \
    time  \
    unzip  \
    vim  \
    wget  \
    && rm -rf /var/lib/apt/lists/*



# set env
ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64
ENV JAVA_ARGS -Xmx4g -Xms1g -XX:MaxPermSize=512m
ENV MVN_OPTS -Xmx4g -Xms1g -XX:MaxPermSize=512m

RUN mkdir /experiment
WORKDIR /experiment
RUN wget https://github.com/EvoSuite/evosuite/releases/download/v1.2.0/evosuite-1.2.0.jar
RUN wget https://github.com/EvoSuite/evosuite/releases/download/v1.2.0/evosuite-standalone-runtime-1.2.0.jar
RUN wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.1/junit-platform-console-standalone-1.10.1.jar
RUN wget https://repo1.maven.org/maven2/junit/junit/4.13/junit-4.13.jar
RUN wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
