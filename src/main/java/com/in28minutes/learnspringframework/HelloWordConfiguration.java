package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record : JDK16에 추가된 새로운 기능
// 레코드를 사용하면 setter, getter, 생성자 등을 만들 필요가 없다.
// 자동으로 생성.
record Person (String name, int age, Address address) { };

// Address - firstLine & City
record Address (String firstLine, String city) { };

@Configuration
public class HelloWordConfiguration {

    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); // name, age
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) { // name, age, address2
        return new Person(name, age, address3);
    }

    @Bean("address2")
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean("address3")
    public Address address3() {
        return new Address("Motinagar", "Hyderabad");
    }
}
