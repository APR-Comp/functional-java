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

    

