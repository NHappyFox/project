public class circle extends figure {

    int radius;
    float pi = 3.14F;

    public circle() {
        name = "circle";
    }

    public void print(int radius) {
        float sq = radius*radius*pi;
        System.out.println(name + " " + sq);
    }

}
