package SplitwiseLowLevelDesign;
import java.util.*;

public class BalanceManager {
    Map<Person, Integer> balances;

    public BalanceManager(List<Person> members) {
        this.balances = new HashMap<>();
        for(Person person: members) {
            balances.put(person, 0);
        }
    }

    public void paidByDivideBetween(int amount, Person paidBy, List<Person> splitBetween) {
        int splitAmount = amount / splitBetween.size();

        balances.put(paidBy, balances.get(paidBy) + amount);

        for(Person person: splitBetween) {
            balances.put(person, balances.get(person) - splitAmount);
        }
    }

    public void settle() {
        // create two priortiy queue, one as max priority queue (for people who needs to take money)
        //   & min priority queue (for people who needs to give money.)

        PriorityQueue<Map.Entry<Person, Integer>> maxPQ = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        PriorityQueue<Map.Entry<Person, Integer>> minPQ = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.getValue(), b.getValue())
        );

        for(Map.Entry<Person, Integer> entry: balances.entrySet()) {
            if(entry.getValue() > 0) {
                maxPQ.add(entry);
            } else if(entry.getValue() < 0) {
                minPQ.add(entry);
            }
        }
        
        while(!maxPQ.isEmpty()) {
            Map.Entry<Person, Integer> creditor = maxPQ.poll();
            Map.Entry<Person, Integer> debtor = minPQ.poll();

            int settlementAmount = Math.min(creditor.getValue(), -debtor.getValue());

            System.out.println(debtor.getKey().name + " Pas " + settlementAmount + " to " + creditor.getKey().name);

            if(creditor.getValue() > settlementAmount) {
                creditor.setValue(creditor.getValue() - settlementAmount);
                maxPQ.add(creditor);
            }

            if(-debtor.getValue() > settlementAmount) {
                debtor.setValue(debtor.getValue() + settlementAmount);
                minPQ.add(debtor);
            }
        }
    }
}   
