package vane.eureka.server;

import cn.hutool.core.net.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

  public static void main(String[] args) {

    String port = "8761";

    if (!NetUtil.isUsableLocalPort(Integer.parseInt(port))) {
      System.err.print("port " + port + " has been occupied");
      System.exit(1);
    }
    new SpringApplicationBuilder(EurekaServerApplication.class)
        .properties("server.port=" + port)
        .run(args);
  }
}
