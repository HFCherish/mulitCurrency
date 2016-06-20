import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class MoneyTest {

    @Test
    public void shouldMultiplyTheValueOfTheCurrency() {
        Money five = Money.dollar(5);
        assertThat( five.times(2), is(Money.dollar(10)));
        assertThat( five.times(3), is(Money.dollar(15)));
    }

    @Test
    public void testEquality() {

        assertThat(Money.dollar(5), is(equalTo(Money.dollar(5))));
        assertThat(Money.dollar(5), is(not(equalTo(Money.dollar(6)))));
        assertThat(Money.franc(5), is(equalTo(Money.franc(5))));
        assertThat(Money.franc(5), is(not(equalTo(Money.franc(6)))));
        assertThat(Money.dollar(6), is(not(equalTo(Money.franc(6)))));

    }

    @Test
    public void testCurrency() {
        assertThat(Money.dollar(1).currency(), is("USD"));
        assertThat(Money.franc(1).currency(), is("CHF"));

    }
}
