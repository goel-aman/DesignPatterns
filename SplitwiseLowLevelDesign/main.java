package SplitwiseLowLevelDesign;
import java.util.*;

public class main {
    public static void main(String[] args) {

        Person aman = new Person(1, "Aman");
        Person venkat = new Person(2, "Venkat");
        Person siddarth = new Person(3, "Siddarth");
        Person naina = new Person(4, "Naina");

        Group mediamelonGroup = new Group(1, "MediaMelon Office", List.of(aman, venkat, siddarth, naina));

        List<Person> members = new ArrayList<>();
        members.add(aman);
        members.add(venkat);
        members.add(siddarth);
        members.add(naina);
        
        Splitwise splitwiseApp = new Splitwise(createUserSet());
        
        for(Person p: members) {
            splitwiseApp.getGroupManager().addGroup(mediamelonGroup, p);
        }

        // we will show users list of group he/she is associated with...
       // List<Group> amanGroups = splitwiseApp.getGroupManager().getAllGroupForPerson(aman);

       // then add expenses...
        mediamelonGroup.addExpense(1200, aman, List.of(aman, venkat, siddarth));
        mediamelonGroup.addExpense(800, venkat, List.of(venkat, siddarth, naina, aman));

        // functionality for settling expenses...        
        mediamelonGroup.settleExpenses();
    }

    public static Set<Person> createUserSet() {
        Set<Person> userSet = new HashSet<>();
        userSet.add(new Person(1, "Aman"));
        userSet.add(new Person(2, "Venkat"));
        userSet.add(new Person(3, "Siddarth"));
        userSet.add(new Person(4, "Naina"));
        userSet.add(new Person (5, "Aditi"));
        userSet.add(new Person(6, "Rupa"));
        userSet.add(new Person(7, "Lavekush"));
        return userSet;
    }
}
