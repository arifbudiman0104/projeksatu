/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.satu.access;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Arif Budiman Ar
 */

@Controller
public class AccessController {
    @GetMapping("/forms")
    public String newForm(){
        return "newdata";
    }

//    @GetMapping("/add")
//    public String newData(HttpServletRequest request, Model model) {
//        String namaBaru = request.getParameter("nama");
//        MydataJpaController ctrl = new MydataJpaController();
//            Mydata data = new Mydata();
//            data.setNama(namaBaru);
//            ctrl.create(data);
//        try {
//            MydataJpaController ctrl = new MydataJpaController();
//            Mydata data = new Mydata();
//            data.setNama(namaBaru);
//            ctrl.create(data);
//            model.addAttribute("result", "Data tersimpan");
//        } catch (Exception e) {
//            model.addAttribute("result", "Gagal simpan");
//        }
//        model.addAttribute("result", "Update database selesai");
//        return "form";
//    }
}