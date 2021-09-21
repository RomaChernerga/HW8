package HW8;

public class Robot implements Sportsmens {  //релизация внутри данного класса методов, описанных в указанном интерфейсе

    public String name;
    public  int jump_height; //высота прыжка
    public  int running_endurance; // возможность пробежать

    public Robot(String name, int jump_height, int running_endurance) {
        this.name = name;
        this.jump_height = jump_height;
        this.running_endurance = running_endurance;
    }

    @Override
    public boolean jump(int height) {
        if(this.jump_height >= height){ //сравнение высоты прыжка с заданной высотой припятствия
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean run(int lenght) {
        if(this.running_endurance >= lenght){ //сравнение выносливости для забега с заданной длинной припятствия
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
