import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    private static final double TEST_CASH_VALUE = 100;
    private static final int TEST_MILES_VALUE = 10000;
    
    private RewardValue rewardValueFromCash;
    private RewardValue rewardValueFromMiles;

    @BeforeEach
    void init() {
        rewardValueFromCash = new RewardValue(TEST_CASH_VALUE);
        rewardValueFromMiles = new RewardValue(TEST_MILES_VALUE);
    }

    @Test
    void shouldHaveCorrectCashValueWhenCreatedWithCash() {
        assertEquals(TEST_CASH_VALUE, rewardValueFromCash.getCashValue());
    }

    @Test
    void shouldHaveCorrectMilesValueWhenCreatedWithMiles() {
        assertEquals(TEST_MILES_VALUE, rewardValueFromMiles.getMilesValue());
    }

    @Test
    void shouldConvertCashToCorrectMilesValue() {
        int expectedMilesValue = (int) (TEST_CASH_VALUE / RewardValue.MILES_TO_CASH_CONVERSION_RATE);
        assertEquals(expectedMilesValue, rewardValueFromCash.getMilesValue());
    }

    @Test
    void shouldConvertMilesToCorrectCashValue() {
        double expectedCashValue = TEST_MILES_VALUE * RewardValue.MILES_TO_CASH_CONVERSION_RATE;
        assertEquals(expectedCashValue, rewardValueFromMiles.getCashValue());
    }
}
