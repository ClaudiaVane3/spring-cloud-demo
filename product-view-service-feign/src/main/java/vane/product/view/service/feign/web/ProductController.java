package vane.product.view.service.feign.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vane.product.view.service.feign.pojo.Product;
import vane.product.view.service.feign.service.ProductService;

@Controller
public class ProductController {

  @Autowired ProductService productService;

  @RequestMapping("/products")
  public Object products(Model m) {
    List<Product> ps = productService.listProducts();
    m.addAttribute("productList", ps);
    return "products";
  }
}
