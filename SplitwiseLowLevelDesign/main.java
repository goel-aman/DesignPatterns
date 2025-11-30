package SplitwiseLowLevelDesign;
import java.util.*;

public class main {
    public static void main(String[] args) {

        Person aman = new Person(1, "Aman");
        Person venkat = new Person(2, "Venkat");
        Person siddarth = new Person(3, "Siddarth");
        Person naina = new Person(4, "Naina");

        Group mediamelonGroup = new Group(1, "MediaMelon Office", List.of(aman, venkat, siddarth, naina));

        GroupManager groupManager = new GroupManager();

        List<Person> members = new ArrayList<>();
        members.add(aman);
        members.add(venkat);
        members.add(siddarth);
        members.add(naina);

        for(Person p: members) {
            groupManager.addGroup(mediamelonGroup, p);
        }

        mediamelonGroup.addExpense(1200, aman, List.of(aman, venkat, siddarth));
        mediamelonGroup.addExpense(800, venkat, List.of(venkat, siddarth, naina, aman));

        
        mediamelonGroup.settleExpenses();
    }
}
