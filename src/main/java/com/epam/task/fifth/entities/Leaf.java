package com.epam.task.fifth.entities;

import java.util.Objects;

public class Leaf implements Component {
    private String lexeme;
    private LeafType leaf;

    public Leaf(String lexeme, LeafType leaf) {
        this.lexeme = lexeme;
        this.leaf = leaf;
    }

    public String getLexeme() {
        return lexeme;
    }

    public LeafType getLeaf() {
        return leaf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf1 = (Leaf) o;
        return Objects.equals(lexeme, leaf1.lexeme) && leaf == leaf1.leaf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lexeme, leaf);
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "lexeme='" + lexeme + '\'' +
                ", leaf=" + leaf +
                '}';
    }
}
