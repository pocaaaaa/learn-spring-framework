### @Primary
> * 같은 인터페이스의 구현체 클래스 두 개 이상으로 빈으로 등록되었을때 사용.
> * 여러 빈이 있을 때 기본적으로 선택될 빈에 @Primary 어노테이션을 붙여주면 자동적으로 해당 빈이 선택된다.

### @Qualifier
> * 같은 인터페이스의 구현체 클래스 두 개 이상으로 빈으로 등록되었을때 사용.
> * Qualifier 어노테이션은 빈에 추가 구분자를 붙여주는 방법으로 생성자에게 해당 구분자를 명시하면 그 구분자를 가진 빈을 주입해준다.

### @Primary vs. @Qualifier
> * 스프링은 기본적으로 자동보다 수동으로 지정한 것이 높은 우선 순위를 갖음.
> * 자동적으로 빈을 선택해주는 @Primary보다 명시적으로 지정하는 @Qualifier 어노테이션이 우선 순위를 가짐.

### @Configuration
> * 설정파일을 만들기 위한 어노테이션 또는 Bean 을 등록하기 위한 어노테이션이다. 
> * Bean 을 등록할 때 싱글톤(singleton)이 되도록 보장해줌 => 만들어진 객체는 다시 생성하지 않음.
> * 스프링 컨테이너에서 Bean 을 관리할 수 있게 됨.

### @Bean
> * @Bean 어노테이션은 메소드가 Spring IoC 컨테이너에서 관리할 새 객체를 인스턴스화, 구성 및 초기화하는데 사용된다. 
> * 이는 <beans/> XML configuration 과 동일한 역할을 수행함.

### @Component
> * @Component는 개발자가 직접 작성한 Class를 Bean으로 등록할 수 있도록 해주는 어노테이션.

### @ComponentScan
> * @ComponentScan은 스프링 3.1부터 도입된 어노테이션. 
> * ComponentScan은 스프링이 직접 클래스를 검색해서 Bean으로 등록해주는 기능. 
> * 설정 클래스에 빈으로 등록하지 않아도 원하는 클래스를 빈으로 등록할 수 있으므로 설정 코드가 크게 줄어듬. 
> * 스프링이 검색해서 빈으로 등록할 수 있으려면 @Component 어노테이션을 붙여야 함.

### @Autowired
> * 스프링 컨테이너에 등록한 빈에게 의존관계주입이 필요할 때, DI(의존성 주입)을 도와주는 어노테이션
> * 스프링 컨테이너에 빈들을 모두 등록한 후에, 의존성 주입 단계가 이루어지는데 이 때 @Autowired 어노테이션이 부여된 메서드가 실행되며 필요한 인스턴스를 주입.
> * @Autowired는 총 3가지 방법으로 실현이 가능한데, 생성자/수정자(setter)/필드를 사용할 수 있다.

### @Lazy
> * Lazy 어노테이션은 초기화를 지연시키는 어노테이션. 
> * Spring은 기본적으로 즉시 초기화를 기본값으로 가지고 있음.
> * Lazy 어노테이션을 적용하게 되면 해당 클래스 객체를 사용하려고 할 떄 초기화가 되어 사용하게 된다.
> * @Component를 사용하는 모든 클래스나 Bean에 어노테이션을 적용한 모든 메서드에서 Lazy를 사용할 수 있음.
> * @Lazy는 권장되지 않고, 자주 사용되지 않는다. 
> * 기본적으로 즉시 초기화를 추천.
> * @Configuration 클래스에 Lazy를 적용하면 @Configuration 클랫 내의 모든 @Bean 메서드가 지연 초기화됨.
> * 지연 초기화를 사용하는 경우 애플리케이션이 시작될 떄 Spring 구성 오류는 발생하지 않고, 런타임 오류가 발생함.

### @Scope
> * 스프링 프레임워크에서 빈(Bean) 객체의 생성 및 소멸 시점과 라이프사이클을 관리하는 것 중에 하나가 스코프(Scope) 라고 함.
> * 스코프는 빈 객체의 생성 범위를 지정하며, 해당 범위에서만 빈 객체를 공유하고 관리.
> * 스코프의 종류 : Singleton, Prototype, Request, Session, GlobalSession
> 1) Sigleton : <br/>
> 스프링 컨테이너에서 생성되는 빈 객체는 기본적으로 singleton 스코프로 생성. <br/>
> 따라서 singleton 스코프를 사용하는 빈은 애플리케이션 전역에서 공유됨. <br/>
> 기본값이며, 별도의 설정 없이도 사용할 수 있음. 
> 2) Prototype : <br/>
> Prototype 스코프를 지정하면 빈 객체를 요청할 떄마다 새로운 인스턴스가 생성됨. <br/>
> 따라서 빈 객체를 공유하지 않고 독립적으로 사용할 수 있음. 
> 3) Request : <br/>
> Request 스코프를 지정하면 웹 요청마다 새로운 인스턴스가 생성됨. <br/>
> 따라서 같은 웹 요청에서는 빈 객체를 공유하여 사용할 수 있지만, 다른 웹 요청에서는 별도의 인스턴스가 생성됨. <br/>
> 4) Session : <br/>
> Session 스코프는 HTTP 세션이 시작될 떄마다 새로운 객체를 생성함. <br/>
> 따라서 Session 스코프를 사용하는 빈은 각각의 HTTP 세션마다 독립적인 객체로 취급. <br/>
> 5) GlobalSession : <br/>
> GlobalSession 스코프는 Portlet 환경에서 사용됨. <br/>
> Portlet 애플리케이션 전체에서 공유할 수 있는 빈 객체를 생성 <br/>

### @Controller
> * 웹 애플리케이션과 REST API에서 컨트롤러를 정의하는데 사용.

### @Service
> * 보통 어노테이션한 클래스에 비지니스 논리가 있음을 나타냄. 
> * 클래스에 비지니스 논리가 있다면 @Component 대신 @Service를 사용. 

### @Repository
> * Bean이 데이터베이스와 통신하는 경우, 데이터를 저장하거나 검색하거나 조작하는 경우 @Component 대신 @Repository 어노테이션을 클래스에 사용.

### 스트레오타입 어노테이션 
> * @Component, @Service, @Controller, @Repository
> * 비즈니스 논리를 포함한 클래스를 만들 때는 @Service
> * 웹 컨트롤러 클래스를 만들 때는 @Controller 
> * 데이터베이스와 통신하는 클래스를 만들 때는 @Repository
> * 모두 해당하지 않을 때는 제네릭 어노테이션인 @Component 사용.
> * 구체적인 어노테이션을 사용하는게 좋음.
> <br/> 1) 구체적인 어노테이션을 사용하면 프레임워크에 자신이 의도했던 바를 더 자세히 나타낼 수 있음. 
> <br/> 2) 나중에 AOP (관점 지향 프로그래밍)를 사용하여 어노테이션을 감지하고 그 위에 부가적인 동작을 추가할 수 있음. 

### @PostConstruct
> * @PostConstruct 는 WAS 가 뜰 때 bean이 생성된 다음 딱 한번만 실행됨.
> * @PostConstruct 를 사용하여 기본 사용자라던가, 딱 한번만 등록하면 되는 key 값 등을 등록하여 사용할 수 있음.

### @PreDestroy
> * @PreDestroy 역시 Spring이 애플리케이션 컨텍스트에서 bean을 제거하기 직전에 단 한 번만 실행됨.

### @Named
> * @Autowired의 @Qualifier 와 비슷한 역할을 하는게 @Inject에서의 @Named. 
> * @Qualifier와 달리 @Named에는 bean id 을 지정하므로 @Autowired, @Qualifier를 사용할때에 비해 XML 설정 파일이 다소 짧아진다는 특징이 있음. 

### @Inject
> * @Inject는 @Autowired와 유사하게 주입하려고 하는 객체의 타입이 일치하는 객체를 자동으로 주입. 
> * @Autowired와 마찬가지로 필드, Setter에 사용할 경우 반드시 기본 생성자가 정의되어 있어야 함.

### @ConfigurationProperties
> * *.properties, *.yml 파일에 있는 property를 자바 클래스에 값을 가져와서 (바인딩) 사용할 수 있게 해주는 어노테이션