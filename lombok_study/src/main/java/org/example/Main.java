package org.example;

import lombok.*;

import java.io.Serializable;


//@NoArgsConstructor : The constructor has no parameters. So if you write something like this below, you'll get an error
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
//@ToString(exclude ={"age", "name"})
    @ToString
@EqualsAndHashCode
//equals와 hashcode를 같이 써야하는 이유 알기
class Student implements Serializable {
    @NonNull private String studentId;
    @NonNull private String name;
    private int age;
}

//롬복의 역할 : boli
//@Getter @Setter @EqualsAndHashCode
//@RequiredArgsConstructor
//class Student{
//    @NonNull private String studentId;
//    @NonNull private String name;
//    private int age;
//}

@Builder
class Rectangle{
    private int width, height;

}
public class Main {
    public static void main(String[] args)
    {
        Student s1 = new Student("A1234", "jonh", 20);
        Student s2 = new Student("A1234", "jonh", 20);
        System.out.println(s1);
        System.out.println(s1.equals(s2));

        Rectangle.RectangleBuilder builder = Rectangle.builder();
        

    }
}