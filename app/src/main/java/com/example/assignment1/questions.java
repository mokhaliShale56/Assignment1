package com.example.assignment1;

public class questions {

    public String questions []={
            "what is the name of the celebrity?"
            "what is the name of the celebrity?"
            "what is the name of the celebrity?"
    };
    private String choice[][]={
            {"Nas"},
            {"2pac"},
            {"Dr Dre"},
    };

    private String correctAnswer[]={"Nas", "2pac", "Dr Dre"};

    public String[] getQuestion(int a) {
        String question=questions[a];
        return question;
    }
    public String[] getChoice1(int a)[0] {
        String choice=Choices[a][0];
        return choice;
}

    public String[] getChoice2(int a)[1] {
        String choice=Choices[a][0];
        return choice;
    }
    public String[] getChoice3(int a)[2] {
        String choice=Choices[a][0];
        return choice;
    }
