# LearnJava – Quiz Submission

Implements a 5-question OOP quiz via two endpoints:

- `GET /api/lessons/{lessonId}/questions` — loads questions (no correct answers
  exposed)
- `POST /api/quiz/submit` — grades answers, updates streak, triggers break
  prompt after every third completion, and unlocks the next lesson on pass (≥
  70%)

Built with Spring Boot 3, Spring Data JPA, and H2 in-memory database.

**To run:** `mvn spring-boot:run` then open `http://localhost:8080`

H2 console: `http://localhost:8080/h2-console` (JDBC URL:
`jdbc:h2:mem:learnjavadb`, username `sa`, no password)

Performance test plan:
`src/test/resources/performancetest/LearnJava_Performance_Test.jmx`
