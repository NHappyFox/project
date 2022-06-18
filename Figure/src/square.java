public class square extends figure{

    public square() {
        name = "square";
    }

    public void print(int leght) {
        int sq = leght*leght;
        System.out.println(name + " " + sq);
    }

}
