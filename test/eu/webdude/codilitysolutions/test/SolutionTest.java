package eu.webdude.codilitysolutions.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

class SolutionTest {

  static class Task01Provider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
      return Stream.of(
        Arguments.of(4, new int[]{5, 5, 1, 7, 2, 3, 5}, 5),
        Arguments.of(16, new int[]{1, 15, 5, 51, 4, 7, 9, 1, 3, 4, 5, 8, 9, 6, 3, 5, 4, 7, 6, 5, 5}, 5),
        Arguments.of(0, new int[]{1, 1, 1, 1, 1, 1}, 5),
        Arguments.of(0, new int[]{5, 5, 5, 5, 5, 5, 5}, 5)
      );
    }
  }

  static class Task02Provider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
      return Stream.of(
        Arguments.of(new int[]{1, 1, 0, 1}, new int[]{1, 0, 0, 1, 1}, 9),
        Arguments.of(new int[]{1, 1, 0, 1, 0, 1, 1}, new int[]{1, 0, 0, 1, 1, 1}, -23)
      );
    }
  }

  @ParameterizedTest
  @ArgumentsSource(Task01Provider.class)
  void task01(int expected, int[] testArray, int x) {
    Assertions.assertEquals(expected, Solution.task01(x, testArray));
  }

  @ParameterizedTest
  @ArgumentsSource(Task02Provider.class)
  void task02(int[] expected, int[] input) {
    Assertions.assertArrayEquals(expected, Solution.task02(input));
  }

  @ParameterizedTest
  @ArgumentsSource(Task02Provider.class)
  void convertBinaryToDecimal(int[] expected, int[] input, int expectedDecimal) {
    Assertions.assertEquals(expectedDecimal, Solution.negativeBinaryToDecimal(input));
  }
}
