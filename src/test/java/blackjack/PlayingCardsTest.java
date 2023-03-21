package blackjack;

import nextstep.blackjack.Number;
import nextstep.blackjack.PlayingCard;
import nextstep.blackjack.PlayingCards;
import nextstep.blackjack.Shape;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PlayingCardsTest {

    @Test
    @DisplayName("카드합이 21인 경우 블랙잭이다")
    void test1() {
        List<PlayingCard> playingCards = Arrays.asList(new PlayingCard(Number.TEN, Shape.CLOVER),
                new PlayingCard(Number.A, Shape.HEART));

        PlayingCards cardNumbers = new PlayingCards(playingCards);

        System.out.println("asdf"+cardNumbers);

        assertThat(cardNumbers.isBlackJack()).isTrue();
    }

    @Test
    @DisplayName("Ace 카드만 4개 뽑았다면 총합은 14이다.")
    void test2() {
        List<PlayingCard> playingCards = Arrays.asList(
                new PlayingCard(Number.A, Shape.CLOVER),
                new PlayingCard(Number.A, Shape.DIAMOND),
                new PlayingCard(Number.A, Shape.SPADE),
                new PlayingCard(Number.A, Shape.HEART));

        PlayingCards cardNumbers = new PlayingCards(playingCards);

        assertThat(cardNumbers.sumCardNumber()).isEqualTo(14);
    }
}
