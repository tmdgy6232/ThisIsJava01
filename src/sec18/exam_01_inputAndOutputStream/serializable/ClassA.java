package sec18.exam_01_inputAndOutputStream.serializable;

import java.io.Serializable;

public class ClassA implements Serializable {
    int field1; //직렬화 포함
    ClassB file2 = new ClassB(); // 직렬화 포함
    static int field3; // 직렬화 제외
    transient int field4; // 직렬화 제
}
