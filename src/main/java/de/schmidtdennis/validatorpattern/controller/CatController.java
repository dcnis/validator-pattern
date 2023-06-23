package de.schmidtdennis.validatorpattern.controller;

import de.schmidtdennis.validatorpattern.model.AddCatRequest;
import de.schmidtdennis.validatorpattern.service.CatService;
import de.schmidtdennis.validatorpattern.validators.AbstractAddValidator;
import de.schmidtdennis.validatorpattern.validators.ValidationRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/cat")
public class CatController {

    @Autowired
    private CatService catService;

    @Autowired
    private ValidationRouter router;

    @PostMapping("/add")
    public Boolean addCat(AddCatRequest request){
        AbstractAddValidator addValidator = router.getValidator(request);
        addValidator.validate(request);
        return catService.addCat(request);
    }

}
