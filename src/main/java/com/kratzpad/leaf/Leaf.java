package com.kratzpad.leaf;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data

public class Leaf {

    private @Id Long id;
    private String title;
    private String content;

    private Leaf() {}

    public Leaf(String title) {
        this.id = 0L;
        this.title = title;
    }
}
