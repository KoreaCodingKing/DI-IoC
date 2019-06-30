package com.example03;

import com.example03.context.SimpleApplicationContext;
import com.example03.service.OrderService;
import com.example03.util.SequenceGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world! 헬로 월드다 아주 이세계에 온걸 뭐이리 환영 하는지
 *
 *
 * 이 소스는 Ioc 컨테이너가 @Bean을 생성하는 get Bean을 하는 순서를 적어 놓았습니다.
 * 지금 흐름대로 흘러 가는걸 이해 하면 됩니다.
 * 백문이 불여 일타 흐름을 기억하고 이 패턴을 외워야 하기에 타자 치는걸 추천 5번 정도 프로젝트를 만들며
 *
 * 그리고 내일 물어 볼 문제
 *
 * OrerServiceImpl class를 보면 위에 //@Service @primary 가 주석 처리 되어있습니다. 이 주석을 해제 하게 되면
 * 생성 순서가 바뀔것 입니다. 생성 순서가 왜 바뀌는지 설명 해 주시면 됩니다.
 * 그리고 primary를 주석 처리 하고 실행하면 에러가 뜰텐데 왜 에러가 발생 하는지 내일 말해 주시면 됩니다.
 *
 * 이걸 이해하면 의존성 흐름을 그래도 이해 한걸 꺼에요
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("-------------- Main Start -------------------");
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleApplicationContext.class);
        System.out.println("-------------- Main : ApplicationContext 생성 종료");

        System.out.println("--------OrderService getBean: start0----------------------------");
        OrderService service=context.getBean(OrderService.class);
        System.out.println("--------OrderService getBean : 종료 -------------------------------\n");
        System.out.println("--------Service.addOrder 실행 -------------------------------------");
        service.addOrder("kh Han", "0x12345678",100.0);
        System.out.println("--------Service.addOrder 종료 -------------------------------------\n");

        System.out.println("7) service_sequenceGenerator is : "+service.getSequenceGenerator());
        System.out.println("8) service is : "+service.toString());

        System.out.println("---------generator.getBean 실행------------------------------------");
        SequenceGenerator generator = context.getBean(SequenceGenerator.class);
        System.out.println("---------getnerator.getBean 종료----------------------------------\n");
        System.out.println("9) NextSequence:"+generator.getSequence());
        System.out.println("Hell o?");
    }
}
