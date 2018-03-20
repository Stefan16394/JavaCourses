package cresla;


import cresla.IO.Input;
import cresla.IO.Output;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Input input =new Input(new BufferedReader(new InputStreamReader(System.in)));
        Output output=new Output();
        Controller c=new Controller();
        while (true)
        {
            List<String> command= Arrays.stream(input.readLine().split("\\s+")).collect(Collectors.toList());
            switch (command.get(0))
            {
                case "Reactor":
                    output.writeLine(c.reactorCommand(command.stream().skip(1).collect(Collectors.toList())));
                    break;
                case "Module":
                    output.writeLine( c.moduleCommand(command.stream().skip(1).collect(Collectors.toList())));
                    break;
                case "Report":
                    output.writeLine(c.reportCommand(command.stream().skip(1).collect(Collectors.toList())));
                    break;
                case "Exit":
                    output.writeLine(c.exitCommand(command.stream().skip(1).collect(Collectors.toList())));
                    return;
            }
        }
    }
}
