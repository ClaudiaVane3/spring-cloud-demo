package vane.product.view.service.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vane.product.view.service.ribbon.client.ProductClientRibbon;

import java.util.List;

@Service
public class ProductService {
  @Autowired ProductClientRibbon productClientRibbon;

  public List getProductList() {
    return productClientRibbon.getProductList();
  }
}
