package HW8;

public class Wall implements Obstacle {  //релизация внутри данного класса методов, описанных в указанном интерфейсе
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Sportsmens sportsmens){
        if(sportsmens.jump(height)){  //если спортсмены смогли перепрыгнуть высоту препятситвия:
            System.out.printf(" %s смог перпепрыгнуть стену высотой %s m.\n", sportsmens.getName(), height );// вывод, в случае инстинности
            return true;
        }
        System.out.printf("%s не смог перепрыгнуть стену высотой %s m.\n", sportsmens.getName(), height); // вывод, в случае ложности выражения
        return false;
    }
}
