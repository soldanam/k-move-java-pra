package chap06.passbyvalue;

class House {
    private Person owner;

    public House() { }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }
}

class Person {
    private String name = "";

    public Person(String name) {
        this.name = name;
    }

    public void buyHouse(House house) {
        house.setOwner(this);
    }

    public String getName() {
        return name;
    }
}

public class ThisReferenceExample {
    public static void main(String[] args) {
        House house = new House();
        Person person = new Person("홍길동");
        person.buyHouse(house);
        System.out.println("집주인 이름은 " + house.getOwner().getName());
    }
}
