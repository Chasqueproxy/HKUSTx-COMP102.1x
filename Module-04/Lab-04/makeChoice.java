public void makeChoice() {

        // Please write your code after this line
        Random random = new Random();
        int choiceRandomNumb = random.nextInt(10);
        
        if (choiceRandomNumb <= 3) 
        {
            choiceRandomNumb = 0;
        } 
        else if (choiceRandomNumb > 3 && choiceRandomNumb <= 6) 
        {
            choiceRandomNumb = 1;
        } 
        else 
        {
            choiceRandomNumb = 2;
        }
        
        Choice choice = new Choice(choiceRandomNumb);
        this.choice = choice;	





}
