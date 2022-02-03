package vane.product.view.service.feign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vane.product.view.service.feign.client.ProductClientFeign;
import vane.product.view.service.feign.pojo.Product;

@Service
public class ProductService {
  @Autowired ProductClientFeign productClientFeign;

  public List<Product> listProducts() {
    return productClientFeign.listProducts();
  }
}
