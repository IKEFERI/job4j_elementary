package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void sumTwoPositiveNumbers() {
        int excepted = 14;
        int result = Counter.sum(2, 5);
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void sumTwoNegativeNumbers() {
        int excepted = -9;
        int result = Counter.sum(-4, -2);
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void sumZeroAndPositiveNumber() {
        int excepted = 3;
        int result = Counter.sum(0, 2);
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void sumStartNegativeAndFinishPositive() {
        int excepted = 5;
        int result = Counter.sum(-1, 3);
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void sumStartGreaterThanFinish() {
        int excepted = 0;
        int result = Counter.sum(10, 1);
        assertThat(result).isEqualTo(excepted);
    }
}