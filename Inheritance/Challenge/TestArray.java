

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1, 2, 3, 4, 9});
        ArrayOperations.Statistics stats = opr.new Statistics();
        System.out.println(stats.mean());
    }
}
