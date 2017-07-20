package com.proj.onlineshopping.dao;

import java.util.List;

import com.proj.onlineshopping.model.CartInfo;
import com.proj.onlineshopping.model.OrderDetailInfo;
import com.proj.onlineshopping.model.OrderInfo;
import com.proj.onlineshopping.model.PaginationResult;

public interface OrderDAO {
	
	public void saveOrder(CartInfo cartInfo);
	 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}
