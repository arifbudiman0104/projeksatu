package praktikum.satu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import praktikum.satu.access.Mydata;
import praktikum.satu.access.MydataJpaController;
import praktikum.satu.access.Mydetail;
import praktikum.satu.access.MydetailJpaController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        try {
            MydataJpaController ctr = new MydataJpaController();
            Mydata data = new Mydata();
            MydetailJpaController ctrl = new MydetailJpaController();
            Mydetail detail = new Mydetail();

//            dta.setId(1);
//            dta.setNama("Arif Budiman Arrosyid");
//
//            ctr.create(dta);
            detail.setNik("3481080303830002");
            data.setNama("Arif");
            data.setMydetail(detail);

            ctrl.create(detail);
            ctr.create(data);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
