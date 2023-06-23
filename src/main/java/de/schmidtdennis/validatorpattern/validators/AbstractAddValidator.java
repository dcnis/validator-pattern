package de.schmidtdennis.validatorpattern.validators;

import de.schmidtdennis.validatorpattern.model.AddCatRequest;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractAddValidator{

    public abstract void validate(AddCatRequest request);

}
