FROM pronter/jce-java
MAINTAINER Chris<chiuchunkin@gmail.com>

VOLUME /tmp
COPY ./target/order-ms-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT [ "java","-agentlib:jdwp=transport=dt_socket,address=5005,suspend=y,server=y", "-jar", "-Djava.security.egd=file:/dev/./urandom", "/app.jar" ]

EXPOSE 8295 10848
