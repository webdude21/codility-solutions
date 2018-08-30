package eu.webdude.codilitysolutions.cyclicrotation;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest implements ArgumentsProvider {


  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
    return Stream.of(
      Arguments.of(new int[]{3, 8, 9, 7, 6}, 3, new int[]{9, 7, 6, 3, 8}),
      Arguments.of(new int[]{1, 2, 3, 4, 5}, 5, new int[]{1, 2, 3, 4, 5}),
      Arguments.of(new int[]{1, 2, 3, 4, 5}, 15, new int[]{1, 2, 3, 4, 5})
    );
  }

  @ParameterizedTest
  @ArgumentsSource(SolutionTest.class)
  void solution(int[] input, int rotations, int[] expected) {
    assertArrayEquals(expected, Solution.solution(input, rotations));
  }
}
