package academy.java2.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test02 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();


        System.out.println("1. List 만들기");
        list.add(20);
        list.add(3);
        list.add(6);
        list.add(84);
        list.add(17);
//		list.addAll(Arrays.asList(20,3,5,84,17));

        System.out.println(list);
        System.out.println();


        System.out.println("2. 최소값 구하기");
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println(min);
        System.out.println();


        System.out.println("3. 합계 구하기");
        Iterator<Integer> iter = list.iterator();

        int sum = 0;
        while (iter.hasNext()) {
            sum += iter.next();
        }
        System.out.println(sum);
        System.out.println();


        System.out.println("4. 리스트 삭제");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }


//		List<Integer> sub = list.subList(i, j);
//		Iterator<Integer> iterr = sub.iterator();
//		while(iterr.hasNext()) {
//			if (iterr.next() % 2 == 0) {
//				iterr.remove();
//			}
//		}

        // 다시 사용할 경우 다시 .iterator() 로 초기화 해야함
        iter = list.iterator();
        while(iter.hasNext()) {
            Integer number = iter.next();

            if (number % 2 == 0) {
                iter.remove();
            }
        }

        System.out.println(list);

    }
}