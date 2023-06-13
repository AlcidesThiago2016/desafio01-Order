package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private OrderService orderService;
    public double shipment(Order order){

        double temporary = 20.0;

        if (order.getBasic() < 200 && order.getBasic() >= 100.0){
            temporary = 12.0;
        } else if (order.getBasic() >= 200.0){
            temporary = 0.0;
        }
        return temporary;
    }
}
