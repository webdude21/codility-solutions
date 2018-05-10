package eu.webdude.codilitysolutions.arrayinversions;

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
                Arguments.of(new int[]{-1, 6, 3, 4, 7, 4}, 4),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, 10)
        );
    }

    @ParameterizedTest
    @ArgumentsSource(SolutionTest.class)
    void countArrayInversions(int[] testInput, int expected) {
        var actual = Solution.solution(testInput);
        Assertions.assertEquals(expected, actual);
    }
}