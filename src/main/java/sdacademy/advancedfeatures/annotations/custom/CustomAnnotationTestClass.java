package sdacademy.advancedfeatures.annotations.custom;

public class CustomAnnotationTestClass {

    @MyAnnotation(name = "Tomas", age = 26)
    public void sayHello() {
        System.out.println("Hello world!");
    }
}
