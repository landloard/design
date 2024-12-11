package org.landlord.demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author spikeCong
 * @date 2022/10/19
 **/
public class Player {

    private int money;      //所持金钱
    private List<String> fruits = new ArrayList();  //获得的水果
    private Random random = new Random();   //随机数对象
    private static String[] fruitsName={    //表示水果种类的数组
      "苹果","葡萄","香蕉","橘子"
    };

    //构造方法
    public Player(int money) {
        this.money = money;
    }

    //获取当前所持有的金钱
    public int getMoney() {
        return money;
    }

    //获取一个水果
    public String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }

        //从数组中获取水果
        String f = fruitsName[random.nextInt(fruitsName.length)];
        return prefix + f;
    }

    //掷骰子游戏
    public void yacht(){

        int dice = random.nextInt(6) + 1;   //掷骰子
        if(dice == 1){
            money += 100;
            System.out.println("所持有的金钱增加了..");
        }else if(dice == 2){
            money /= 2;
            System.out.println("所持有的金钱减半..");
        }else if(dice == 6){   //获取水果
            String fruit = getFruit();
            System.out.println("获得了水果: " + fruit);
            fruits.add(fruit);
        }else{
            //骰子结果为3、4、5
            System.out.println("无效数字,继续投掷");
        }
    }

    //拍摄快照
    public Memento createMemento(){
        Memento memento = new Memento(money);
        for (String fruit : fruits) {
            if(fruit.startsWith("好吃的")){
                memento.addFruit(fruit);
            }
        }

        return memento;
    }

    //撤销方法
    public void restore(Memento memento){
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "Player{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
