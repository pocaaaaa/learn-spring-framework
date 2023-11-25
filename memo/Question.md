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