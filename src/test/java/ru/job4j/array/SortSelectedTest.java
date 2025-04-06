package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortArrayLengthIsFive() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayLengthIsThree() {
        int[] data = new int[] {6, 4, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 6, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayLengthIsEightAndReverseSorted() {
        int[] data = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWithNegativeNumbers() {
        int[] data = new int[] {-2, -6, -5, -1, -3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-6, -5, -3, -2, -1};
        assertThat(result).containsExactly(expected);
    }
}