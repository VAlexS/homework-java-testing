package clases.comandos;

public class Console {


public int checkCommand (String input) {
   String posibleCommand = input.toLowerCase();  // la entrada a minúsculas

    String[] validCommands = {
            "enroll \\d+ \\d+", //0
            "assign \\d+ \\d+",//1
            "show courses",//2
            "lookup course \\d+",//3
            "show students",//4
            "lookup student \\d+",//5
            "show teachers",
            "lookup teacher \\d+",//6
            "show profit" //7
    };
    /*
    for (String regex : validCommands) {
        if (posibleCommand.matches(regex)) {
            return true;
        }
    }*/
    for (int i=0; i<posibleCommand.length();i++){
        if (posibleCommand.matches(validCommands[i])) {
            return i;
        }

    }
    return -1;


}

}

