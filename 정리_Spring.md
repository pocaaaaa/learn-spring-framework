### 강한결합 vs. 느슨한 결합 
> 결합 : 무언가를 변경하는 데 얼마나 많은 작업이 관련되어 있는지에 대한 측정. <br/>
> -> 엔진은 차에 결합되어 있다. <br/>
> -> 하지만, 바퀴는 차에 느슨하게 결합되어 있다.
> 결합은 훌륭한 소프트웨어를 구축하는 데 중요하다. 
> 많은 것들은 변화를 겪고 이러한 이유로 느슨한 결합을 사용해야 한다. 
> 가능한 코드를 적게 변경하면서 기능을 변경할 수 있어야 한다. <br/><br/>

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
