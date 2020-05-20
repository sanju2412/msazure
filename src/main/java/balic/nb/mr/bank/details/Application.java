/**
 * 
 */
package balic.nb.mr.bank.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author User
 *
 */

@SpringBootApplication(scanBasePackages =  "balic.nb.mr.bank.details")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}