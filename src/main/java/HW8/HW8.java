package HW8;

public class HW8 {
    public static void main(String[] args) {

        //1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
        // Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
        //2. Создайте два класса беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия
        // (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        //3. Создайте два массива с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
        //4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        // Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.


        Sportsmens[] sportsmens = {
                new Cat("Boris", 9, 100),
                new Cat("Murzik", 12,90),
                new Human("Petr", 11,100),
                new Human("John", 13,100),
                new Robot("Elektronik", 10,100),
                new Robot("T-1000", 8,100),

        };

        Obstacle[] obstacles = {
            new Running_track(100),
            new Wall(10),
            new Running_track(110),
            new Wall(12),
            new Running_track(120),
            new Wall(11),
        };
        for(Sportsmens s : sportsmens){
            for(Obstacle o  : obstacles){
                if(!o.overcome(s)) break;
            }
        }
    }
}
