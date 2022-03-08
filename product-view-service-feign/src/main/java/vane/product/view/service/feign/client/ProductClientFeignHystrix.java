package vane.product.view.service.feign.client;

import org.springframework.stereotype.Component;
import vane.product.view.service.feign.pojo.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign {
  @Override
  public List<Product> listProducts() {
    List<Product> result = new ArrayList<>();
    result.add(new Product(0, "er, product-data-service is not available now...", 0));
    return result;
  }
}
