package HW8;

public class Running_track implements Obstacle { //релизация внутри данного класса методов, описанных в указанном интерфейсе
    private int lenght;

    public Running_track(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean overcome(Sportsmens sportsmens){
        if(sportsmens.run(this.lenght)){  //если спортсмены смогли пробежать длинну препятситвия:
            System.out.printf(" %s смог пробежать дорожку протяженностью %s m.\n", sportsmens.getName(), lenght);  //вывод, если смогли
            return true;
        }
            System.out.printf("%s не смог пробежать дорожку из %s m.\n", sportsmens.getName(), lenght); //вывод, если не смогли
        return false;
    }




}
