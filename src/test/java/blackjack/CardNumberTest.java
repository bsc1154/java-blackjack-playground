package blackjack;

import nextstep.blackjack.CardNumber;
import nextstep.blackjack.Number;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardNumberTest {
    @Test
    @DisplayName("CardNumber가 ACE일 시 1 또는 11값을 반환한다.")
    void test1() {
        CardNumber cardNumber = new CardNumber(Number.A);
        int aceNumber = cardNumber.getAceNumber(10);
        Assertions.assertThat(aceNumber).isEqualTo(11);
    }
}
