package sec13.ch02.ex02;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MyClass2 {

    @RetSource
    int retSource;

    @RetClass
    int retClass;

    @RetRuntime
    int retRuntime;

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> myClass = Class.forName("sec13.chap02.ex02.MyClass");
        for (Field f : myClass.getDeclaredFields()) {
            if (f.getAnnotations().length > 0) {
//                System.out.printf(
//                        "%s : %s%n",
//                        f.getName(),
//                        Arrays.stream(f.getAnnotations())
//                                .map(Annotation::toString)
//                                .collect(Collectors.joining(","))
//                );
            }
        }
    }
}
