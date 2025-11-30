package SplitwiseLowLevelDesign;
import java.util.*;

public class GroupManager {
    Map<Person, List<Group>> groupsMapping;

    public GroupManager() {
        this.groupsMapping = new HashMap<>();
    }

    public void addGroup(Group group, Person person) {
        groupsMapping.putIfAbsent(person, new ArrayList<>());
        groupsMapping.get(person).add(group);
    }

    public List<Group> getGroupsForPerson(Person person) {
        return groupsMapping.getOrDefault(person, new ArrayList<>());
    }

    public Group getGroupByPerson(Person person, int groupId) {
        List<Group> groups = groupsMapping.getOrDefault(person, new ArrayList<>());
        for(Group group: groups) {
            if(group.groupId == groupId) {
                return group;
            }
        }

        return null;
    }
}