package de.schmidtdennis.validatorpattern.validators.handler.ragdoll;

import de.schmidtdennis.validatorpattern.enums.CatType;
import de.schmidtdennis.validatorpattern.model.AddCatRequest;
import de.schmidtdennis.validatorpattern.validators.AbstractAddValidator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class RagDollAddValidator extends AbstractAddValidator {

    @Override
    public void validate(AddCatRequest request){

        if(request.getType().equals(CatType.RAGDOLL)){
            throw new IllegalArgumentException("CatType is not supported");
        }

        if(request.getId() != null){
            throw new IllegalArgumentException("Id must be null");
        }

        if(StringUtils.isBlank(request.getName())){
            throw new IllegalArgumentException("Name cannot be blank");
        }

        if(request.getAge() == null || request.getAge() < 0){
            throw new IllegalArgumentException("Age cannot be null");
        }

        if(request.getBirthday() == null){
            throw new IllegalArgumentException("Birthday cannot be null");
        }

        if(request.getRegisterDay() == null){
            throw new IllegalArgumentException("RegisterDay cannot be null");
        }

        if(request.getBirthday().after(request.getRegisterDay())){
            throw new IllegalArgumentException("Birthday cannot be after registerDay");
        }

    }

}
