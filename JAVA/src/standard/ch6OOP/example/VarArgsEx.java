package standard.ch6OOP.example;

class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("[" + concatenate(",") + "]");
    }

    // 여러 문자열을 하나로 결합하여 반환
    static String concatenate(String delim, String... args) {
        String result = "";
        for (String str : args) {
            result += str + delim;
        }
        return result;
    }

//    static String concatenate(String... args) {
//        return concatenate("", args);
//    }

// Ambiguous method call. Both concatenate (String, String...)
// in VarArgsEx  and concatenate (String...) in VarArgsEx match
// 두 오버로딩된 메서드가 구분되지 않아서 에러 발생!
}

/*
결과

100200300
100-200-300-
1,2,3,
[]
[]
 */

