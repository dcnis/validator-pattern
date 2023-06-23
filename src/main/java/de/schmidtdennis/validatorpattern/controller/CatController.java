package de.schmidtdennis.validatorpattern.controller;

import de.schmidtdennis.validatorpattern.model.AddCatRequest;
import de.schmidtdennis.validatorpattern.service.CatService;
import de.schmidtdennis.validatorpattern.validators.AddValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/cat")
public class CatController {

    @Autowired
    private CatService catService;

    @Autowired
    private AddValidator addValidator;

    @PostMapping("/add")
    public Boolean addCat(AddCatRequest request){
        addValidator.validate(request);
        return catService.addCat(request);
    }

}
