package com.shiblee.demoswagger;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        name ="Schema practice on model"
)
public class Model {

    @Schema(
            hidden = true
    )
    private String name;
    private String code;
    private long id;


}
