LearnJava – Quiz Submission Feature

Implements POST /api/quiz/submit — a REST endpoint that evaluates a learner's
5-question quiz for a Java OOP lesson. The backend validates answers, calculates
score, updates progress and streak, and determines whether a break prompt should
trigger.

Built with Spring Boot 3, Spring Data JPA, and H2 in-memory database. To run:
mvn spring-boot:run then POST to http://localhost:8080/api/quiz/submit. See H2
console at http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:learnjavadb).
