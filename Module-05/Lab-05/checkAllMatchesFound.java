public boolean checkAllMatchesFound() {

        // Please write your code after this line
				boolean b = true;
        for(Card c:cards)
        if (!c.isFacingUp()) b = false; 
        return b;





}
