package testEx;

import java.io.FileNotFoundException;
import java.io.FileReader;

import junit.framework.TestCase;

public class FileReaderTester extends TestCase {

	public FileReaderTester(String name) {
		super(name);
	}

	@Override
	protected void setUp() {

		try {
			FileReader _input = new FileReader("data.txt");
		} catch (FileNotFoundException e) {
			throw new RuntimeException("테스트 파일을 열 수 없음");
		}

	}

	@Override
	protected void tearDown() {

	}

}
