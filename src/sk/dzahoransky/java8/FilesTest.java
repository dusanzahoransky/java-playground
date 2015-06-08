package sk.dzahoransky.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesTest {

	public static void main(String[] args) throws IOException {
		Path start = Paths.get("");

		System.out.println("Searching dir: " + start.toAbsolutePath().toString());

		try (Stream<Path> stream = Files.find(start, 10, (path, attr) -> String.valueOf(path).endsWith(".java"))) {
			System.out.println("Found:");
			stream.sorted().forEach((path) -> System.out.println(path.toString()));
		}
	}
}
