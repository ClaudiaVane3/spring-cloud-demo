package vane.product.view.service.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ProductClientRibbon {

  @Autowired private RestTemplate restTemplate;

  public List getProductList() {
    return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products", List.class);
  }
}
