package standard.ch11CollectionsFramework.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {

        final int LIMIT = 10;   // 자르고자 하는 글자 개수 설정

        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()zzz";
        int length = source.length();

        List list = new ArrayList(length / LIMIT + 10);

        for (int i = 0; i < length; i+=LIMIT) {
            if (i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT));
            } else {
                list.add(source.substring(i));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

/*
결과

0123456789
abcdefghij
ABCDEFGHIJ
!@#$%^&*()
zzz
 */
