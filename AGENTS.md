# BoxCommunity Hub API — Agent Guide

## Build & Run
- **Build**: `./mvnw.cmd clean install` (Maven wrapper, Java 17)
- **Run**: `./mvnw.cmd spring-boot:run`
- **Test**: `./mvnw.cmd test` (single smoke test: `BoxCommunityHubApiApplicationTests.contextLoads`)
- **DB**: PostgreSQL (configure in `application.properties` — currently placeholder)

## Codind Conventions
- For backend components: prefer Java 17 with SpringBoot
- For frontend components: prefer JS with React framework. 
- Single quotes.
- Follow clean code principles (DRY, KISS, SOLID, etc.)
- Use semicolons.
- JSDoc is mandatory.

## Architecture
- **Pattern**: DDD + Hexagonal architecture + Vertical slicing
- **Structure per bounded context** (auth, booking, box, ClassSession, exercise, facility, membership, result, users, wod):
  - `domain/` — entities + value objects (VOs in `domain/vo/`)
  - `application/` — use cases / services (currently empty)
  - `infrastructure/` — persistence / adapters (currently empty)
- **Main class**: `com.personal.box_community_hub.BoxCommunityHubApiApplication`

## Code Style
- **Lombok** is on the classpath — prefer `@Data`, `@Builder`, `@Value` on entities/VOs
- **VOs** should be `@Value` + `@Builder` (immutable pattern)
- **Entities** should use `@Data` (or `@Getter`/`@Setter`)
- **Naming**: PascalCase for classes, camelCase for fields; VOs use `_` separator (e.g., `User_EmailVO`, `BookingDateVO`) — follow existing convention
- **Existing bugs to avoid** (don't replicate these patterns):

## Testing
- JUnit 5 + Spring Boot test annotations
- Currently one smoke test; add tests under `src/test/java/com/personal/box_community_hub/`
- Follow hexagonal test patterns: `*Test.java` per service, `*RepositoryTest.java` for persistence

## Key Dependencies (from pom.xml)
- Spring Boot 4.0.3, Spring MVC, Spring Data JPA, Spring Security, Validation, PostgreSQL, Lombok
- No code quality plugins configured yet
