import sample.Question;

class Quiz extends Question {
    Question qlist[]; //list of questions
    int top; //index of the last question added
    public Quiz(int no)  //number of questions in the quiz
    {

        qlist = new Question[no];
    }
    public void addQuestion(Question q)
    {
        qlist[top] = q;
        top +=1;
    }


}
