package de.schmidtdennis.validatorpattern.model;

import lombok.Data;

import java.util.Date;

@Data
public class AddCatRequest {

    private Long id;
    private String name;
    private Long age;
    private Date birthday;
    private Date registerDay;

}
