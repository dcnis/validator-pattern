package de.schmidtdennis.validatorpattern.service;

import de.schmidtdennis.validatorpattern.model.AddCatRequest;
import org.springframework.stereotype.Service;

@Service
public class CatService {

    public Boolean addCat(AddCatRequest request) {

        return true;
    }
}
