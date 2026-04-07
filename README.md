# SPRING PLUS


## 🚀 Spring Boot Expert Assignment: Legacy to Security
이 프로젝트는 기존의 커스텀 Filter와 Argument Resolver 기반 인증 시스템을 Spring Security로 전환하고, JPA 성능 최적화 및 테스트 코드를 보완한 과제 결과물입니다.

### 📌 주요 구현 사항 (Level 1 & 2)
#### 1. Spring Security 전환 (Core)
기존의 JwtFilter와 AuthUserArgumentResolver를 수정하고, Spring Security의 표준 방식을 도입했습니다.

- SecurityConfig 구현: BCryptPasswordEncoder를 통한 비밀번호 암호화 및 SecurityFilterChain 설정.

- @AuthenticationPrincipal: 커스텀 리졸버 대신 Spring Security의 어노테이션을 사용하여 AuthUser 객체 주입.

#### 2. JPA 성능 및 기능 개선
- N+1 문제 해결: Comment 조회 및 Todo 상세 조회 시 Entity Graph와 Join Fetch를 사용하여 쿼리 최적화.

- QueryDSL 도입: 복잡한 JPQL 쿼리를 QueryDSL로 전환하여 타입 안정성 확보 및 동적 쿼리(날짜 범위, 날씨 조건) 대응.

- Cascade 설정: 할 일(Todo) 저장 시 작성자가 담당자(Manager)로 자동 등록되도록 cascade = CascadeType.PERSIST 적용.

#### 3. 테스트 코드 신뢰성 확보
MockMvc 통합: @WebMvcTest 환경에서 GlobalExceptionHandler와 SecurityContext가 정상 동작하도록 설정하여 컨트롤러 테스트 성공.

예외 케이스 검증: 존재하지 않는 데이터 조회 시 커스텀 예외(InvalidRequestException) 발생 및 HTTP 상태 코드(400) 반환 검증.
