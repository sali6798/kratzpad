package com.kratzpad.leaf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeafController {

    @RequestMapping("/api/leaf")
    public Leaf getLeaf(){
        var leaf = new Leaf("My Note");
        return leaf;
    }
}
