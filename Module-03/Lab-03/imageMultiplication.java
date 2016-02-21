public void imageMultiplication() {

        // Please write your code after this line
				ColorImage img1 = new ColorImage();
        ColorImage img2 = new ColorImage();
        ColorImage img3 = img1.multiply(img2);
        Canvas canvas = new Canvas(img1.getWidth() + img2.getWidth() + img3.getWidth() + 2*10, img1.getHeight());
        canvas.add(img1);
        canvas.add(img2, img1.getWidth()+10, 0);
        canvas.add(img3, img1.getWidth()+10 + img2.getWidth()+10, 0);





}
