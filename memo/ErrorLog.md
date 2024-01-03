### Process finished with exit code 0 
> * '프로그램이 정상적으로 실행되었고 성공적으로 종료되었음을 나타낸다' 라는 메세지와 관련있지만, Spring Boot 실행 후 바로 종료되면서 정상 실행이 안되었음. 
> * 실행은 정상적으로 되었지만 application이 내장 톰캣에 올라가지 못한 것.
> * 해결방법 : Spring Boot는 웹 애플리케이션을 실행하기 위해 내장 톰캣을 기본적으로 제공해주기 때문에 의존성을 추가해주면 된다.
    <br/> implementation 'org.springframework.boot:spring-boot-starter-web' (build.gradle에 추가)
> * Spring Boot에서 "spring-boot-starter-web" 의존성을 사용하면 내장 톰캣(Embedded Tomcat)이 자동으로 설정되고 실행됨. 
> * "org.springframework.boot:spring-boot-starter-web" 의존성을 추가하지 않아 내장 톰캣에 애플리케이션이 올라가지 않아서 "Process finished with exit code 0" 발생한 것 
> * [출처] https://hoehen-flug.tistory.com/40