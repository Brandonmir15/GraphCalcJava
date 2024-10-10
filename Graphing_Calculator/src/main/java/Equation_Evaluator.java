/*

Working on building a class (or finding a library)

that will be able to parse user input equations and return an expression
that can be put into the equation varible inside my graph panel class

 */

import javax.script.ScriptEngineManager;    //<----
import javax.script.ScriptEngine;           //<-----
import javax.script.ScriptException;//<-----

//import org.graalvm.polyglot.Context;
public class Equation_Evaluator {

    public static void main(String[] args) throws ScriptException{
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine ee = manager.getEngineByName("js"); // "js" is for JavaScript

        if (ee != null) {
            try {
                // Now you can safely call the eval method
                ee.eval("print('Hello, World!')");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("ScriptEngine for JavaScript is not available.");
        }
    }

}


