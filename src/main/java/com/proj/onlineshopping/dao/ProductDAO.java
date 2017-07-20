package com.proj.onlineshopping.dao;

import com.proj.onlineshopping.entity.Product;
import com.proj.onlineshopping.model.PaginationResult;
import com.proj.onlineshopping.model.ProductInfo;

public interface ProductDAO {

public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
}
