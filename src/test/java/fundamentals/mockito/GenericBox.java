package fundamentals.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import sdacademy.fundamentalstesting.Calculator;


import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GenericBox {

    @Mock
    Calculator calculator = new Calculator();

    @Test
    public void verifyThatDivisionWasCalled() {
        // given
        when(calculator.add(Mockito.eq(1), Mockito.eq(2)))
                .thenReturn(2);

        //when
        calculator.add(2, 5);

        // then
        verify(calculator)
                .add(anyInt(), anyInt());
    }
}
