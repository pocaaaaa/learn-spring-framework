package com.in28minutes.learnspringframework2.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {

}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
    public static void main(String[] args) {
        try(var context =
            new AnnotationConfigApplicationContext
                (BeanScopesLauncherApplication.class)) {

            // 동일한 Bean이 검색됨. (해시코드가 동일함)
            // 기본적으로 Spring Framework에서 생성되는 모든 Bean은 싱글톤.
            // Bean을 요청할 때마다 같은 인스턴스가 반환됨.
            // 싱글톤은 Spring Ioc 컨테이너당 객체 인스턴스가 딱 하나.
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            // 새로운 해시코드 값이 나타나고, 이 특정한 Bean의 새 인스턴스를 얻게됨.
            // @Scope의 value를 PROTOTYPE과 같도록 설정하면 Spring Framework에 Bean을 요청할 때마다 Bean 인스턴스가 새로 생성됨.
            // 프로토타입에서는 Spring IoC 컨테이너당 객체 인스턴스가 여러 개일 수 있다.
            // Spring 컨테이너에서 Bean을 요청할 때마다 특정한 Bean의 새 인스턴스를 생성.
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
