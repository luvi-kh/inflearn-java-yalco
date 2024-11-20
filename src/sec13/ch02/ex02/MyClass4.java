package sec13.ch02.ex02;

import java.util.Arrays;
import java.util.stream.Collectors;

// ...
@InheritF
@InheritT
public class MyClass4 {
// ...
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("\n- - - - -\n");

        Class<?> mySubclass = Class.forName("sec13.chap02.ex02.MySubclass");
//        System.out.println(
//                "MySubclass의 어노테이션 : " +
//                        Arrays.stream(mySubclass
//                                        .getAnnotations())
//                                .map(Annotation::toString)
//                                .collect(Collectors.joining(","))
//        );
    }
}
