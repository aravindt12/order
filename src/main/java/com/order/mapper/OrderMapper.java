package com.order.mapper;

import com.order.dto.OrderDTO;
import com.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO mapOrderToOrderDTO(Order order);
    Order mapOrderDTOToOrder(OrderDTO orderDTO);
}
