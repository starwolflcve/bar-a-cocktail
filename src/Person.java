public class Person {
    String name;
    int age;
    int height;

    Person(String nName, int nAge, int nHeight) {
        name = nName;
        age = nAge;
        height = nHeight;
    }

    void Appel() {
        IO.println("je m'appele " + name + "et j'ai " + age + "ans" + ", je mesure " + height + " cm ");
    }
}
