package net.stoneiron.java.hw3;

import java.io.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class WordCount {
    static HashMap<String, Integer> words = new HashMap<>(); // 단어별 횟수를 저장하는 해시맵

    public static void main(String[] args) {
        System.out.println("강석철/컴퓨터공학과/12211554");
        try {
            // 사용자로부터 input 파일과 output 파일 경로를 받기
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input file name: ");
            BufferedReader br = new BufferedReader(new FileReader(scanner.nextLine()));
            System.out.print("Output file name: ");
            BufferedWriter bw = new BufferedWriter(new FileWriter(scanner.nextLine()));

            int read;
            StringBuilder sb = new StringBuilder(); // 단어를 완성시키기 위해 StringBulder 사용
            while ((read = br.read()) != -1) { // 파일이 끝날 때까지 계속 읽기
                switch ((char) read) { // 단어 구분자를 기준으로 단어를 분리 저장하는 구문
                    case '\n':
                    case '\r':
                    case '\t':
                    case ' ':
                    case ',':
                    case '.':
                    case ':':
                    case ';':
                    case '?':
                    case '!':
                    case '[':
                    case ']':
                    case '(':
                    case ')':
                        if (sb.length() == 0) // 저장할 단어가 없다면 continue
                            continue;
                        String key = sb.toString().toLowerCase(Locale.ROOT); // 소문자로 일괄 처리
                        if (words.containsKey(key)) { // 이미 단어가 존재하면 카운트 증가
                            words.put(key, words.get(key) + 1);
                        } else { // 단어가 존재하지 않으면 새로 추가
                            words.put(key, 1);
                        }
                        sb = new StringBuilder();
                        break;
                    default:
                        sb.append((char) read); // 한 문자씩 추가하면서 단어를 완성하기
                }
            }

            for (String key : words.keySet()) { // 해시맵에 저장된 단어와 횟수를 출력
                bw.write(key + "\t" + words.get(key) + "\n");
            }
            System.out.println("Word count finished");

            br.close();
            bw.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
