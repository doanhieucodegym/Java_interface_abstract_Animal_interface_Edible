package Main;

import Fruits.Apple;
import Fruits.Fruit;
import Fruits.Orange;
import Interface.Edible;
import abstract_.Animal;
import abstract_.Chicken;
import abstract_.Tiger;

public class Main {

        public static void main(String[] args) {
            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();
            for (int i = 0; i < animals.length; i++) {
                System.out.println(animals[i].makeSound());

                ///chuyển  đổi ép kiểu dữ liệu
                if (animals[i] instanceof Chicken) {
                    Edible edibler = (Chicken) animals[i];
                    System.out.println(edibler.howToEat());
                }
            }


            // gọi lớp trái cây nó được kết  thừa  từ  1 interfac ,các  lớp con của nó nhận được các phương thức của  interface
            Fruit  [] fruits =new Fruit[2];// đối tượng  mình  vùa  tạo côi như một biến
                fruits[0] = new Orange();// phần  tử của  mảng  là các đối tượng
                fruits[1] =new Apple();

                for(Fruit fruit:fruits){
                    System.out.println(fruit.howToEat());
                }
        }
}
