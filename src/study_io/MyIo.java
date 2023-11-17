package study_io;

import java.io.BufferedReader;
import java.io.FileReader;

public class MyIo {

    public static void main(String[] args) {
        // 파일 경로 지정
        String filePath = "C:\\workspace\\java_lab\\MyWorkspace\\src\\store\\rudiyade_keypling.txt";

        // BufferedReader를 try-with-resources 문을 사용하여 열기
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // 파일에서 한 줄 씩 읽기
            String line;
            while ((line = reader.readLine()) != null) {
                Thread.sleep(750);
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // try - with - resources 블록을 벗어나면 BufferedRead는 자동으로 close() 됨
    }

}
