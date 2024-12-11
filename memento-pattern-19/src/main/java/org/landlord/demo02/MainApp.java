package org.landlord.demo02;

/**
 * 游戏主程序
 * @author spikeCong
 * @date 2022/10/19
 **/
public class MainApp {

    public static void main(String[] args) throws InterruptedException {

        Player player = new Player(100);        //最初所持的金钱数
        Memento memento = player.createMemento();       //保存最初状态

        for (int i = 0; i < 100; i++) {
            //显示扔骰子的次数
            System.out.println("=====" + i);

            //显示当前状态
            System.out.println("当前状态: " + player);

            //开启游戏
            player.yacht();
            System.out.println("所持有的金钱为: " + player.getMoney() + " 元");

            //决定如何操作Memento
            if(player.getMoney() > memento.getMoney()){
                System.out.println("赚到金币,保存当前状态,继续游戏!");
                memento = player.createMemento();
            }else if(player.getMoney() < memento.getMoney() / 2){
                System.out.println("所持金币不多了,将游戏恢复到初始状态!");
                player.restore(memento);
            }

            Thread.sleep(1000);
            System.out.println("");
        }

    }

}
