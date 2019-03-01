package dao.mapper;

import entity.OrderMapExt;
import entity.OrdersExt;

import java.util.List;

public interface OrdersExtMapper {

    List<OrdersExt> findOrderAndUser();

    List<OrderMapExt> findOrderAndUserRstMap();
}
