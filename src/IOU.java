import java.util.HashMap;
public class IOU {
    private HashMap<String, Double> debts;

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));



        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }

    public IOU() {
        this.debts = new HashMap<String, Double>();
    }

    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (debts.containsKey(toWhom)) {
            return debts.get(toWhom);
        } else {
            return 0;
        }
    }

}
