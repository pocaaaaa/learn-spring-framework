package com.in28minutes.learnspringframework2.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {
    // [의존성 주입]
    // 1. field 주입 : 생성자나 수정자가 없음. 의존성은 리플렉션을 사용하여 주입된 것.
    //    @Autowired
    //    Dependency1 dependency1;
    //    @Autowired
    //    Dependency2 dependency2;

    // 2. Setter 주입
    //    Dependency1 dependency1;
    //    Dependency2 dependency2;
    //
    //    @Autowired
    //    public void setDependency1(Dependency1 dependency1) {
    //        System.out.println("Setter Injection - setDependency1");
    //        this.dependency1 = dependency1;
    //    }
    //
    //    @Autowired
    //    public void setDependency2(Dependency2 dependency2) {
    //        System.out.println("Setter Injection - setDependency2");
    //        this.dependency2 = dependency2;
    //    }

    // 3. 생성자 주입
    //  - @Autowired가 의무가 아니다.
    //  - Spring 팀은 생성자 주입을 추천
    //  - Spring 팀이 생성자 기반 주입을 추천하는 이유는 모든 초기화가 하나의 메소드에서 발생하기 때문.
    //  - 초기화가 완료되면 Bean을 사용할 준비가 된 것.
    Dependency1 dependency1;
    Dependency2 dependency2;

    //@Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection - YourBusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " + dependency1 +" and " + dependency2;
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

/**
 * @ComponentScan 을 별도로 지정하지 않으면 스캔되는 대상은 현재 패키지가 된다.
 * 상위의 3개의 class에 @Component를 적용하면 Spring은 자동으로 우리에게 Bean을 생성해줌.
 */

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        try(var context =
            new AnnotationConfigApplicationContext
                (DepInjectionLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
