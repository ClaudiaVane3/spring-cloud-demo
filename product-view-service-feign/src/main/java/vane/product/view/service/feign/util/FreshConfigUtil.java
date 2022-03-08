package vane.product.view.service.feign.util;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;

public class FreshConfigUtil {

  public static void main(String[] args) {
    HashMap<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/json; charset=utf-8");
    System.out.println("refreshing config-server... please be patient ;)");
    String result =
        HttpUtil.createPost("http://localhost:8012/actuator/bus-refresh")
            .addHeaders(headers)
            .execute()
            .body();
    System.out.println("result : " + result);
    System.out.println("refreshing completed");
  }
}
