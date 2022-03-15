package com.example.validatingforminput;

import javax.validation.constraints.NotNull;

public class CounterForm {
    @NotNull
    private String word;

    @NotNull
    private Character letter;

    private Integer amountOfChar;

    public CounterForm(String word, Character letter) {
        this.word = word;
        this.letter = letter;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public Integer getAmountOfChar() {
        return amountOfChar;
    }

    public void setAmountOfChar(Integer amountOfChar) {
        this.amountOfChar = amountOfChar;
    }
}
