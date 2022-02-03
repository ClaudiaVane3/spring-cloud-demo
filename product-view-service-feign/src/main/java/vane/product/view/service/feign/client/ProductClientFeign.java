package vane.product.view.service.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import vane.product.view.service.feign.pojo.Product;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {

  @GetMapping("/products")
  List<Product> listProducts();
}
