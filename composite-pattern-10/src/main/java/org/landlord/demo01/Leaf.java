package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:17
 */
public class Leaf extends Component{
    @Override
    public void add(Component c) {
        //具体操作
    }

    @Override
    public void remove(Component c) {
        //具体操作
    }

    @Override
    public Component getChild(int i) {
        //具体操作
        return new Leaf();
    }

    @Override
    public void operation() {
        //叶子节点的具体业务方法
    }
}
