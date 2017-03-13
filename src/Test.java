
public class Test {

    public static void main(String[] args){

        TestDrive f = new TestDrive();
        f.title = "La-la-land";
        f.genre = "drama";
        f.rating = 9;
        f.playIt();
        System.out.println("Movie title " + f.title + ", genre " + f.genre + " and rating " + f.rating);

    }
}
