package vane.product.view.service.ribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vane.product.view.service.ribbon.service.ProductService;

import java.util.List;

@Controller
public class ProductController {
  @Autowired ProductService productService;

  @RequestMapping("/products")
  public Object products(Model model) {
    List productList = productService.getProductList();
    model.addAttribute("productList", productList);
    return "products";
  }
}
