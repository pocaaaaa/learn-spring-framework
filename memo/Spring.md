### 강한결합 vs. 느슨한 결합 
> * 결합 : 무언가를 변경하는 데 얼마나 많은 작업이 관련되어 있는지에 대한 측정. <br/>
>         -> 엔진은 차에 결합되어 있다. <br/>
>         -> 하지만, 바퀴는 차에 느슨하게 결합되어 있다. <br/>
> * 결합은 훌륭한 소프트웨어를 구축하는 데 중요하다. 
> * 많은 것들은 변화를 겪고 이러한 이유로 느슨한 결합을 사용해야 한다. 
> * 가능한 코드를 적게 변경하면서 기능을 변경할 수 있어야 한다. 

### Spring Bean
> * Spring Bean은 Spring IoC 컨테이너가 관리하는 자바 객체로서 컨테이너에 의해 생명주기가 관리되는 객체를 의미.
> * IoC 컨테이너 안에 들어있는 객체로 필요할 때마다 IoC 컨테이너에서 가져와서 사용한다.
> * 어노테이션인 @Bean을 사용하거나 xml 설정을 통해 일반 객체를 Bean으로 등록이 가능하다.
> * 즉, Spring 에서는 Bean은 ApplicationContext가 알고 있는 객체이며 ApplicationContext가 생성하고 직접 관리해주는 객체를 의미.
> * [출처] https://developer-ellen.tistory.com/198

### Spring Context
> * Bean의 확장 버전으로 Spring이 Bean을 다루기 좀 더 쉽도록 기능들이 추가된 공간.

### Spring Container 
> * Spring Bean과 수명 주기를 관리

### DI (Dependency Injection)
> * 의존성 주입(DI)은 객체를 직접 생성하지 않고 외부에서 가져와 사용하는 것. 
> * 직접 new 명령어를 사용하여 객체를 생성하지 않고, Spring의 DI 컨테이너가 관리. 
> * Constr injection (생성자 주입), Setter injection (세터 주입), Field injection (필드 주입)

### IOC (Inversion Of Control)
> * 제어의 반전. 
> * 제어권을 컨테이너 (프레임워크)가 가져간다는 뜻. 
> * 컨테이너(프레임워크)가 객체를 관리하고 객체의 생성을 책임지고, 의존성을 관리.
 
### CDI (Contextx and Dependency Injection)
> * 의존성 주입 (DI)을 자바 EE로 가져오는 자바 EE의 시도로 CDI의 목적은 의존성 주입 (DI) 수행 방법의 기본 표준화하는 것. 
> * CDI를 사용하기 위해서는 javax.inject 라이브러리를 사용. 
> * @Inject, @Named, @Singleton, @Qualifier 등을 사용.

### Auto-wiring
> * DI를 명시적으로 설정하지 않아도 container가 bean의 타입이나 이름을 이용하여 DI를 자동으로 수행하는 기능.

### 스프링 빈 생명주기 (Bean LifeCycle)
> * 스프링 컨테이너 생성  ->  스프링 빈 생성  ->  의존 관계 주입  ->  초기화 콜백  ->  사용  ->  소멸 콜백  ->  스프링 종료

### Logging Level 
> * trace, debug, info, warning, error, off

### JPA / Hibernate
> * JPA란 자바 ORM(Object Relational Mapping) 기술에 대한 API 표준 명세를 의미. 
> * JPA는 특정 기능을 하는 라이브러리가 아니고, ORM을 사용하기 위한 인터페이스를 모아둔 것.
> * JPA를 사용하기 위해서는 JPA를 구현한 Hibernate, EcpliseLink, DataNucleus 같은 ORM 프레임워크를 사용해야 함.
> * Hibernate는 JPA의 구현체 중 하나.
> * Hibernate는 SQL을 사용하지 않고 직관적인 코드(메소드)를 사용해 데이터를 조작할 수 있음.