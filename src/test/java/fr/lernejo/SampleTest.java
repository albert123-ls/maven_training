package fr.lernejo;
import static org.junit.jupiter.api.Assertions.*;

import fr.lernejo.Sample;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void factTestWhenParameterIsPositif()
    {
        int n = 8;
        Sample sp = new Sample();
        int res = sp.fact(n);
        Assertions.assertThat(res).as("result of 8!").isEqualTo(40320);
    }

    @Test
    void factTestWhenParameterIsNegatif()
    {
        int n = -5;
        Sample sp = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sp.fact(n));
    }

    @Test
    void addTestOperation()
    {
        int a = 8;
        int b = 7;

        Sample sp = new Sample();
        Assertions.assertThat(sp.op(Sample.Operation.ADD, b, a)).as("result of 8 + 7").isEqualTo(15);
    }
}
