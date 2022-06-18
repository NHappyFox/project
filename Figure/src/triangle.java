public class triangle extends figure{

    public triangle(){
        name="triangle";
    }

    public void print(int a,int h) {
        float i = 0.5F;
        float sq = i*a*h;
        System.out.println(name + " " + sq);
    }
}
