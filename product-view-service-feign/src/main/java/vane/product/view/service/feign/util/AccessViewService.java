package vane.product.view.service.feign.util;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

public class AccessViewService {

  public static void main(String[] args) {
    while (true) {
      ThreadUtil.sleep(1000);
      access(8012);
      access(8013);
    }
  }

  public static void access(int port) {
    try {
      String html = HttpUtil.get("http://127.0.0.1:" + port + "/products");
      System.out.println(port + "地址的视图服务访问成功，返回大小是 " + html.length());
    } catch (Exception e) {
      System.err.println(port + " 地址的视图服务无法访问");
    }
  }
}
