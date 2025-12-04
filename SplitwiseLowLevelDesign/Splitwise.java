package SplitwiseLowLevelDesign;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
public class Splitwise {
    GroupManager groupManager;
    Set<Person> users;

    public Splitwise(Set<Person> users) {
        this.groupManager = new GroupManager();
        this.users = users;
    }

    public GroupManager getGroupManager() {
        return groupManager;
    }

    public void setGroupManager(GroupManager groupManager) {
        this.groupManager = groupManager;
    }

    public List<Person> getUsers() {
        List<Person> persons = new ArrayList<>(users);
        return persons;
    }

    public void setUsers(Set<Person> users) {
        this.users = users;
    }
}
