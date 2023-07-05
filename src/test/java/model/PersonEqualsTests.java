package model;

public class PersonEqualsTests {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Артём");
        p.setLastName("Клевко");
        p.setAge(19);
        p.setId(17);

        Person p1 = new Person(17 , "Артём" , "Клевко" , 19);





        //I случай = для разных объектов ссылки всегда различны !!!

        System.out.println("p == p1 > " + (p == p1));//double Equals

        Person p2 = p;
        System.out.println("p2 == p > " + (p2 == p));






        //II Equals == по умолчанию проверяет ссылки , смотрите пункт I
        //если не переопределить Equals всегда будут сравнивоться ссылки

//        Cat cat1 = new Cat("Мурзик");
//        Cat cat2 = new Cat("Барсик");


        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Мурзик");

        Person person1 = new Person(123 , "Mike" , "Tyson" , 45);
        person1.setCat(cat1);

        Person person2 = new Person(123 , "Mike" , "Tyson" , 45);
        person2.setCat(cat2);

        //для того чтобы объекты сравнивались коректно надо переопределить метод Equals.
        // Как правило объекты сравниваються по полям.
        System.out.println("person1 Equals person2 == " + person1.equals(person2));


        //HashCode = функция которая вернёт целое число
        System.out.println("cat1 hashCode " + cat1.hashCode());//он для объекта возвращает int
        System.out.println("cat2 hashCode " + cat2.hashCode());

        System.out.println("person1 hashCode " + person1.hashCode());
        System.out.println("person2 hashCode " + person2.hashCode());
    }
}
