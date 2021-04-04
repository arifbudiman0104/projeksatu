package praktikum.satu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import praktikum.satu.access.Mydata;
import praktikum.satu.access.MydataJpaController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        try {
            MydataJpaController ctr = new MydataJpaController();
            Mydata dta = new Mydata();

            dta.setId(1);
            dta.setNama("Arif Budiman Arrosyid");
            
            ctr.create(dta);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
