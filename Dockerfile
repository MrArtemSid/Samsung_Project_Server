FROM openjdk:22

WORKDIR /usr/src/app

COPY leaderboard.jar .

EXPOSE 8080
CMD ["java", "-jar", "leaderboard.jar"]


