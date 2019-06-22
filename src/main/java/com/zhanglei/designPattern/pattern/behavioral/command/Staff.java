package pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: suxun
 * @Date: 2018/12/9 17:57
 * @Description:
 */
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
