package com.epam.task.fifth.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Composite implements Component {

    private List<Component> components = new ArrayList<>();

    public Composite(List<Component> children) {
        this.components = children;
    }

    public Composite() {

    }

    public void add(Component component) {
        components.add(component);
    }
    public void remove(Component component) {components.remove(component);}

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Composite composite = (Composite) o;
        return Objects.equals(components, composite.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }

    @Override
    public String toString() {
        return "Composite{" +
                "components=" + components +
                '}';
    }
}
