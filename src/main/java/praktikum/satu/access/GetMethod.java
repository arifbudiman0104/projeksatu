/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.satu.access;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Arif Budiman Ar
 */
@RestController
public class GetMethod {
    @ResponseBody
    @GetMapping("/test")
    public String getTest1() {
        return "Test ok";
    }
    
    @ResponseBody
    @GetMapping("/test/{number}")
    public String getTest2(@PathVariable(value = "number") int number) {
        return "Test ok " + number;
    }
}
