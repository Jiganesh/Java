public class ToStringWIthObjects {
    public static void main(String[] args) {
        Person somebody = new Person("Jiganesh");
        System.out.println(somebody.getname());
        System.out.println(somebody.toString());

    }
}

class Person {
    String name;
    int rollno;

    public Person(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }
}

/*
 * The toString method for class Object returns a string consisting of the name
 * of the class of which the object is an instance, the at-sign character `@',
 * and the unsigned hexadecimal representation of the hash code of the object.
 * In other words, this method returns a string equal to the value of:
 * getClass().getName() + '@' + Integer.toHexString(hashCode())
 */