package calc;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;

public class CalcSteps {
    private Calculator calc;
    private int result;

    @Дано("я включил калькулятор")
    public void я_включил_калькулятор() {
        calc = new Calculator();
    }

    @Когда("я ввожу число {int}")
    public void я_ввожу_число(Integer int1) {
        calc.setInitialValue(int1);
    }

    @Когда("я добавляю число {int}")
    public void я_добавляю_число(Integer int1) {
        result = calc.add(int1);
    }

    @Тогда("результат должен быть {int}")
    public void результат_должен_быть(Integer expected) {
        Assert.assertEquals(expected.intValue(), result);
    }
}