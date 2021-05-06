package com.downs.societysim.decisiontree;

public interface DecisionTreeInterface<T> extends BinaryTreeInterface<T> {

    // p. 585 Data Structures Book
    public T getCurrentData();
    public void setCurrentData(T newData);
    public void setAnswers(T answerForNo, T answerForYes);
    public boolean isAnswer();
    public void advanceToNo();
    public void advanceToYes();
    public void reset();


}
