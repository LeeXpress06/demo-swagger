package com.shiblee.demoswagger;

import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@Tags(

)
@RestController
public class Controller {

     Database database = new Database();

    @PostMapping("/save")
    public String save(String name){

        return database.savedName(name);

    }

    @GetMapping("/{id}")
    public String getName(@PathVariable int i){

        return database.getName(i);
    }

}
