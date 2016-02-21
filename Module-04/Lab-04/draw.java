public void draw(Canvas canvas, int x, int y, int rotation) {

        // Please write your code after this line
				int selfType = this.getType();
       	String imgUrl = "";
        if (selfType == 0) imgUrl = "rock.png";
        if (selfType == 1) imgUrl = "paper.png";
        if (selfType == 2 ) imgUrl = "scissors.png";
        ColorImage img = new ColorImage(imgUrl);
        img.setRotation(rotation);
        canvas.add(img, x, y);





}
