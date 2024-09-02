import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import utils.Main;

public class MainTest {
    @Test
    @Tag("task:1")
    @DisplayName("Implemented the analyzeInts method")
    public void implemented_expected_analyzeInts() {
        assertThat(
            new Main()
            .analyzeInts(
                10, 8, new int [] {6, -3, 5, 0, 12, 3, 3, 9}))
                .isEqualTo(0.5);
        assertThat(
            new Main()
            .analyzeInts(
                28, 12, new int [] {6, -3, 5, 0, 12, 3, 3, 9, 10, 9, 6, 25}))
                .isEqualTo(7.0/12.0);
        assertThat(
            new Main()
            .analyzeInts(
                6, 12, new int [] {6, -3, 5, 0, 12, 3, 3, 9, 10, 9, 6, 25}))
                .isEqualTo(2.0/12.0);
    }

    @Test
    @Tag("task:2")
    @DisplayName("Implemented the getSlope method")
    public void implemented_expected_getSlope() {
        assertThat(
            new Main()
            .slopeMathGetSlope(5, 4))
                .isEqualTo(5.0/4.0);
        assertThat(
            new Main()
            .slopeMathGetSlope(2, 4))
                .isEqualTo(2.0/4.0);
        assertThat(
            new Main()
            .slopeMathGetSlope(-2, 4))
                .isEqualTo(-2.0/4.0);
    }

    @Test
    @Tag("task:2")
    @DisplayName("Implemented the isOnLine method")
    public void implemented_expected_isOnLine() {
        assertThat(
            new Main()
            .slopeMathIsOnLine(5, -2, 5, 4, -17))
                .isEqualTo(true);
        assertThat(
            new Main()
            .slopeMathIsOnLine(5, -2, -25, 40, 30))
                .isEqualTo(false);
    }

    @Test
    @Tag("task:3")
    @DisplayName("Implemented the bagApples method")
    public void implemented_expected_bagApples() {
        assertThat(
            new Main()
            .bagApples(
                10.0, 0.5, new double [] {6.0, 3.0, 5.0, 0.4, 12.0, 3.0, 3.0, 9.0}))
                .isEqualTo(2);
        assertThat(
            new Main()
            .bagApples(
                28.0, 1.2, new double [] {6.0, 3.0, 5.0, 0.2, 12.0, 3.0, 3.0, 9.0, 10.0, 9.0, 6.0, 25.0}))
                .isEqualTo(5);
        assertThat(
            new Main()
            .bagApples(
                6.0, 12.0, new double [] {6.0, 0.03, 5.0, 0.2, 12.0, 3.0, 3.0, 9.0, 10.0, 9.0, 6.0, 25.0}))
                .isEqualTo(0);
        assertThat(
            new Main()
            .bagApples(
                42.0, 12.0, new double [] {6.0, 0.03, 5.0, 0.2, 12.0, 3.0, 3.0, 9.0, 10.0, 9.0, 6.0, 25.0}))
                .isEqualTo(7);
    }

    @Test
    @Tag("task:4")
    @DisplayName("Implemented the getCheck method")
    public void implemented_expected_getCheck() {
        assertThat(
            new Main()
            .getCheck(159))
                .isEqualTo(2);
        assertThat(
            new Main()
            .getCheck(283415))
                .isEqualTo(6);
    }

    @Test
    @Tag("task:4")
    @DisplayName("Implemented the getNumberOfDigits method")
    public void implemented_expected_getNumberOfDigits() {
        assertThat(
            new Main()
            .getNumberOfDigits(159))
                .isEqualTo(3);
    }

    @Test
    @Tag("task:4")
    @DisplayName("Implemented the getDigit method")
    public void implemented_expected_getDigit() {
        assertThat(
            new Main()
            .getDigit(159, 1))
                .isEqualTo(1);
           
    }

    @Test
    @Tag("task:4")
    @DisplayName("Implemented the isValid method")
    public void implemented_expected_isValid() {
        assertThat(
            new Main()
            .getDigit(159, 1))
                .isEqualTo(1);
    }
}
