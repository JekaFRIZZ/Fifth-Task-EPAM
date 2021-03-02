package com.epam.task.fifth.entities;

import java.util.Objects;

public class Lexeme implements Component {
    private String lexeme;
    private LeafType leafType;

    public Lexeme(String lexeme, LeafType leafType) {
        this.lexeme = lexeme;
        this.leafType = leafType;
    }

    public Lexeme(String lexeme) {
        this.lexeme = lexeme;
    }

    public String getLexeme() {
        return lexeme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lexeme leaf = (Lexeme) o;
        return Objects.equals(lexeme, leaf.lexeme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lexeme);
    }
}
