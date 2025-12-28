package InterpreterDesignPattern;
import java.util.*;

public class Context {
    Map<String, Integer> variables;

    public Context() {
        variables = new HashMap<>();
    }

    public void setVariable(String var, int value) {
        variables.put(var, value);
    }

    public int getVariable(String var) {
        return variables.get(var);
    }
}
