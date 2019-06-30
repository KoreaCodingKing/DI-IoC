package com.example03.service;

import com.example03.util.BaseSequenceGenerator;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class OrderServiceImpl implements OrderService{
    //@Autowired
    private BaseSequenceGenerator sequenceGenerator;

    public BaseSequenceGenerator getSequenceGenerator()
    {
        return sequenceGenerator;
    }

    public OrderServiceImpl(){
        System.out.println("3) Bean_OrderService created : "+ this.toString());

    }

    /*public OrderServiceImpl(BaseSequenceGenerator sequenceGenerator){
    this.sequenceGenerator = sequenceGenerator;
    }

    public void setSequenceGenerator(BaseSequenceGenerator sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }*/

    @Override
    public void addOrder(String userId, String projectId, Double quantity) {
        System.out.println("4) Bean_OrderService is : "+ this.toString());
        System.out.println("5) Bean_OrderSerivecImpl_sequenceGenerator is : "+getSequenceGenerator() + "왜? getBean()을 안해줘서!");
        System.out.println("6) Added a new order");
    }

}
