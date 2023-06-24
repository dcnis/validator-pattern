package de.schmidtdennis.validatorpattern.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class CatServiceTest {

    @InjectMocks CatService testee;

    @Test
    public void testSingleDigit(){
        // GIVEN

        // WHEN
        String id = String.format("MA%08d", 1);

        // THEN
        Assertions.assertThat(id).isEqualTo("MA00000001");
    }

    @Test
    public void test(){
        // GIVEN

        // WHEN
        String id = String.format("MA%08d", 1);

        // THEN
        Assertions.assertThat(id).isEqualTo("MA00000001");
    }

}