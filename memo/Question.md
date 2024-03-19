### 섹션 2: Java Spring Framework 시작하기
#### 1. 다음 중 Spring 및 Spring Boot를 이용해 빌드할 수 있는 애플리케이션은 무엇입니까?
> * Spring 및 Spring Boot를 이용해 웹 애플리케이션, REST API, 풀 스택 등 다양한 애플리케이션을 빌드할 수 있습니다.

#### 2. 다음 중 Spring Bean과 생명주기를 관리하는 것은 무엇입니까 ?
> * Spring 컨테이너로 Spring Bean과 생명주기를 관리합니다. 
> * 1: Bean Factory: 기본 Spring 컨테이너 
> * 2: 애플리케이션 컨텍스트: 엔터프라이즈 기능을 사용하는 고급 Spring 컨테이너

#### 3. 웹 애플리케이션, REST API, 마이크로서비스에는 어떤 Spring IOC 컨테이너가 권장됩니까?
> * 대부분의 엔터프라이즈 애플리케이션에서 애플리케이션 컨텍스트를 사용합니다. 
> * 웹 애플리케이션과 REST API, 마이크로서비스 같은 웹 서비스에 애플리케이션 컨텍스트가 권장됩니다.

#### 4. 참 또는 거짓: Spring Bean은 Spring Framework가 관리하는 Java 객체입니다.
> * 참!
> * Spring Bean은 Spring Framework가 관리하는 Java 객체입니다. 
> * Spring은 IOC 컨테이너(Bean Factory 또는 애플리케이션 컨텍스트)를 사용해 이러한 객체를 관리합니다.

<br/>

### 섹션 3 : Spring Framework를 사용하여 Java 객체를 생성하고 관리하기
#### 1. 다음 중 Spring 팀이 권장하는 의존성 주입 유형은 무엇입니까?
> * 생성자 기반 (정답!) / 세터 기반 / 필드
> * 객체가 생성될 때 의존성이 자동으로 설정되므로 Spring 팀은 생성자 기반 주입을 권장합니다.

#### 2. Spring Framework는 어떤 방법으로 컴포넌트 클래스를 찾습니까?
> * 컴포넌트 스캔
> * Spring Framework는 패키지를 스캔해 컴포넌트 클래스를 찾습니다. - `@ComponentScan("com.in28minutes")`

#### 3. 서드 파티 라이브러리용으로 Bean을 인스턴스화하고 있습니다. 다음 중 Spring Bean 생성에 사용할 수 있는 접근법은 무엇입니까?
> * @Bean
> * 자체 애플리케이션 코드용으로 Bean을 인스턴스화할 때 @Component가 권장됩니다. 
> * Spring Security 설정 같은 서드 파티 라이브러리용으로 Bean을 인스턴스화할 때는 @Bean이 권장됩니다.

#### 4. @Qualifier와 @Primary 중 우선 순위가 높은 것은 무엇입니까?
> * @Qualifier
> * @Qualifier가 @Primary보다 우선 순위가 높습니다.

<br/>

### 섹션 4 : Spring Framework 고급 기능 살펴보기
#### 1. 다음 중 Spring Bean의 기본적인 초기화 방식은 무엇입니까?
> * 즉시 초기화 

#### 2. 컴포넌트 클래스에 @Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)을 추가했습니다. 다음 중 참인 설명은 무엇입니까?
> * Bean을 요청할 때마다 새로운 Bean 인스턴스가 생성됩니다. 
> * 싱글톤 - Spring IoC 컨테이너당 하나의 객체 인스턴스가 생성됩니다. 
> * 프로토타입 - Spring IoC 컨테이너에 여러 개의 객체 인스턴스를 생성할 수 있습니다.

#### 3. 다음 중 기본적인 Spring Bean 스코프는 무엇입니까?
> * 싱글톤

#### 4. 다음 중 참인 설명은 무엇입니까?
> * CDI는 규격입니다. Spring Framework는 CDI를 구현합니다.

#### 5. 다음 중 참인 설명은 무엇입니까?
> * Spring 어노테이션은 사용하기 편리합니다.

#### 6. 다음 중 Spring 스테레오타입 어노테이션이 아닌 것은 무엇입니까?
> * @Service, @Controller, @Repository와 @Component를 Spring 스테레오타입 어노테이션이라고 합니다.

#### 7. 다음 중 어노테이션된 클래스에 비즈니스 논리가 있음을 나타내는 특화된 @Component 어노테이션은 무엇입니까?
> * @Service
> 1) @Service - 어노테이션된 클래스에 비즈니스 논리가 있음을 나타냅니다. 
> 2) @Controller - 어노테이션된 클래스가 "컨트롤러"(예: 웹 컨트롤러)임을 나타냅니다. 웹 애플리케이션과 REST API에 컨트롤러를 정의하는 데 사용됩니다. 
> 3) @Repository - 어노테이션된 클래스가 데이터베이스에서 데이터를 검색하거나 조작하는 데 사용된다는 것을 나타냅니다.

#### 8. 다음 중 Spring 컨테이너로 관리하는 Bean을 생성함을 나타내는 것은 무엇입니까?
> 1) @ComponentScan - 컴포넌트를 찾기 위해 스캔할 특정 패키지를 정의합니다. 특정 패키지를 정의하지 않으면 이 어노테이션을 선언한 클래스의 패키지에서 스캔 작업이 수행됩니다. 
> 2) @Bean - Spring 컨테이너로 관리하는 Bean을 생성함을 나타냅니다.

#### 9. 다음 중 단일 값 의존성을 자동 연결할 후보가 다수일 경우 Bean에 우선 순위를 부여해야 함을 나타내는 것은 무엇입니까?
> 1) @Primary - 단일 값 의존성을 자동 연결할 후보가 다수일 경우 Bean에 우선 순위를 부여해야 함을 나타냅니다. 
> 2) @Lazy - Bean을 지연 초기화해야 한다는 의미입니다. @Lazy 어노테이션이 없으면 즉시 초기화됩니다. 
> 3) @Scope (value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) - Bean을 프로토타입으로 정의합니다. Bean을 참조할 때마다 새로운 인스턴스가 생성됩니다. 기본 스코프는 싱글톤으로 IOC 컨테이너당 하나의 인스턴스가 생성됩니다.

#### 10. 다음 중 초기화를 위해 의존성 주입을 수행한 후 실행할 메서드를 나타내는 것은 무엇입니까?
> 1) @PostConstruct - 초기화를 위해 의존성 주입을 수행한 후 실행할 메서드를 나타냅니다. 
> 2) @PreDestroy - 인스턴스가 컨테이너에 의해 제거되는 중이라는 콜백 알림을 수신하는 메서드를 나타냅니다. 일반적으로 보유 중인 리소스를 해제하는 데 사용됩니다.

#### 11. 다음 중 Jakarta Contexts & Dependency Injection(CDI) 어노테이션은 무엇입니까?
> * @Autowired 및 @Component는 Spring 어노테이션입니다. 
> * 중요한 CDI 어노테이션으로 @Inject(Spring의 Autowired와 유사), @Named(Spring의 Component와 유사)가 있습니다.

#### 12. 참 또는 거짓: Spring Framework에는 여러 개의 Spring 모듈이 있습니다.
> * 참!
> * Spring Framework에는 Spring 코어, Spring MVC, Spring JDBC, Spring 테스트 등 여러 개의 Spring 모듈이 있습니다.

#### 13. 참 또는 거짓: 각 애플리케이션에 사용할 모듈을 선택할 수 있습니다. Spring Framework의 모든 모듈을 사용할 필요는 없습니다.
> * 참!
> * 프로젝트에 사용할 Spring 모듈을 선택할 수 있습니다. 모두 사용할 필요는 없습니다.

#### 14. 참 또는 거짓: Spring은 새로운 Spring 프로젝트를 통해 계속 진화합니다.
> * 참!
> * Spring은 새로운 Spring 프로젝트를 통해 계속 진화합니다. 첫 번째 프로젝트는 Spring Framework입니다. 
> * 지난 20년 동안 새로운 Spring 프로젝트가 여럿 등장했으며, Spring Security, Spring Data, Spring Boot, Spring Cloud가 좋은 예입니다.

<br/>

### 섹션 5 : Spring Boot 시작하
#### 1. Spring Boot의 목적은 무엇입니까?
> * Spring Boot의 목적은 프로덕션 환경에 배포할 애플리케이션을 빠르게 빌드하도록 돕는 것입니다. 
> 1) 신속한 빌드를 돕는 기능 - Spring Initializr, Spring Boot Starter Project, Spring Boot 자동 설정, Spring Boot DevTools. 
> 2) 프로덕션 환경을 지원하는 기능 - 로깅, Profile, ConfigurationProperties, 모니터링(Spring Boot Actuator).

#### 2. 참 또는 거짓: Spring Boot 자동 설정의 자동화된 설정 덕분에 Spring 애플리케이션 빌드에 필요한 설정의 양이 감소합니다.
> * 일반적으로 Spring 앱에는 컴포넌트 스캔, 디스패처 서블릿, 데이터 소스, JSON 변환을 비롯한 여러 설정이 필요합니다. 
> * Spring Boot 자동 설정은 1) 클래스 경로의 프레임워크, 2) 기존 설정(어노테이션 등)을 기준으로 자동화된 앱 설정을 제공합니다.

#### 3. 참 또는 거짓: @SpringBootApplication 어노테이션은 다음 3가지 어노테이션을 결합한 것입니다. @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
> * 이 설명은 참입니다. 
> * 다음은 SpringBootApplication 코드에서 추출한 것입니다. @SpringBootConfiguration @EnableAutoConfiguration @ComponentScan public @interface SpringBootApplication

#### 4. 다음 중 프로덕션 환경에서 애플리케이션을 모니터링 및 관리하는 데 도움이 되는 것은 무엇입니까?
> * Spring Boot Actuator: 프로덕션 환경에서 애플리케이션을 모니터링 및 관리합니다. 다음과 같은 여러 엔드포인트를 제공합니다. 
> 1) beans - 앱의 전체 Spring Bean 리스트 
> 2) health - 애플리케이션 상태 정보 
> 3) metrics - 애플리케이션 메트릭 
> 4) mappings - 요청 매핑에 관한 세부 정보

#### 5. 다음 중 참이 아닌 설명은 무엇입니까?
> 1) Spring Framework의 핵심 기능은 의존성 주입니다. 
> 2) Spring Boot는 Starter Project와 자동 설정을 제공합니다. 
> 3) Spring MVC는 Actuator, Embedded Server, Profile, COnfigurationProperties 같은 비기능 요건(NFR)을 제공합니다. 
> * 답 : 3번 
> * Actuator, Embedded Server, Profile, ConfigurationProperties 같은 비기능 요건(NFR)을 제공하는 것은 Spring Boot(Spring MVC 아님)입니다.