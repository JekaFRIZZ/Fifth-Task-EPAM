package com.epam.task.fifth.entities;

import java.util.Objects;

public class Leaf implements Component {
    private String lexeme;

    public Leaf(String lexeme) {
        this.lexeme = lexeme;
    }

    public String getLexeme() {
        return lexeme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf = (Leaf) o;
        return Objects.equals(lexeme, leaf.lexeme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lexeme);
    }
}
