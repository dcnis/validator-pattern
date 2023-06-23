package de.schmidtdennis.validatorpattern.validators;

import de.schmidtdennis.validatorpattern.enums.CatType;
import de.schmidtdennis.validatorpattern.model.AddCatRequest;
import de.schmidtdennis.validatorpattern.validators.handler.ragdoll.RagDollAddValidator;
import de.schmidtdennis.validatorpattern.validators.handler.siamese.SiameseAddValidator;
import org.springframework.stereotype.Service;

@Service
public class ValidationRouter {

    public AbstractAddValidator getValidator(AddCatRequest request){
        if(request.getType().equals(CatType.RAGDOLL)){
            return new RagDollAddValidator();
        }
        if(request.getType().equals(CatType.SIAMESE)){
            return new SiameseAddValidator();
        }

        throw new IllegalArgumentException("CatType not supported");
    }
}
