package de.schmidtdennis.validatorpattern.validators;

import de.schmidtdennis.validatorpattern.model.AddCatRequest;

public abstract class AbstractAddValidator{

    public abstract void validate(AddCatRequest request);

}
