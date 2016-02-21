public void loadTwoImagesOnTheSameCanvas() {

        // Please write your code after this line
				ColorImage image1 = new ColorImage();
        ColorImage image2 = new ColorImage();
        Canvas canvas = new Canvas(image1.getWidth() + image2.getWidth(), + image1.getHeight());
        canvas.add(image1);
        canvas.add(image2, image1.getWidth(), 0);     





}
