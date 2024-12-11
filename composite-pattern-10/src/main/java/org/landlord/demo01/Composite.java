package org.landlord.demo01;

import java.util.ArrayList;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:15
 */
public class Composite extends Component {
    private ArrayList<Component> components = new ArrayList<>();
    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        components.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }

    @Override
    public void operation() {
        for (Component component : components) {
            component.operation();
        }
    }
}
