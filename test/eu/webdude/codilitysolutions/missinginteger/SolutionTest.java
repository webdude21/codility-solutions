package eu.webdude.codilitysolutions.missinginteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

class SolutionTest implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
    return Stream.of(
      Arguments.of(5, new int[]{1, 3, 6, 4, 1, 2}),
      Arguments.of(4, new int[]{1, 2, 3}),
      Arguments.of(1, new int[]{-1,})
    );
  }

  @ParameterizedTest
  @ArgumentsSource(SolutionTest.class)
  void missingIntegerSolution(int expected, int[] testInput) {
    Assertions.assertEquals(expected, Solution.solution(testInput));
    Assertions.assertEquals(expected, Solution.solutionWithReduce(testInput));
  }
}
