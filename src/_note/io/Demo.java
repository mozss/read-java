package _note.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Demo {
	public static void main(String[] args) {
		Reader in_1 = new InputStreamReader(System.in);
		//System.out.println(in.toString());
		
		String content = String(Files.readAllBytes(".note/res/hello.txt"));
	}
}
