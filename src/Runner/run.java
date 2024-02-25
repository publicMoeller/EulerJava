package Runner;

import Problems.*;
import java.io.File;
import java.lang.reflect.*;

import java.util.Arrays;


public class run {
    /**
     * Runs all implemented project Euler solutions, but not specific ones.
     * Mostly a device to enforce somewhat efficient implementations.
     */
    //TODO iterate over all files instead of manually listing them.
    //TODO look at Javas version of REGEX and write a function to extract the problem number
    //TODO Get the Index of the highest/last problem
    //TODO print the intervals of missing problems.
    //TODO reports about time elapsed
    public static void main(String[] args) {

       // Avoiding dynamic loading, getting to use reflections though.
        String[] classes = collectClasses();
        Arrays.sort(classes);
        for( String clazz : classes){
            System.out.println(clazz + " " +callMyClazz(clazz));

        }
    }
    private static String[] collectClasses(){
        /**
         * Collects the names of all the classes in the Problems folder.
         */
        String folderPath = "src/Problems";
        File folder = new File(folderPath);
        File[] files = folder.listFiles();


        String[] classes = new String[files.length];
        for (int i = 0; i < files.length; i++){
         classes[i] = files[i].getName().replace(".java","");
        }

        return classes;
    }

    private static String callMyClazz(String name) {
        /**
         * Calls the class with the name of the argument, calls solve(), returns the result.
         */
        Class<?> clazz = null;
        try {
            clazz = Class.forName("Problems."+ name);
            Constructor<?> constructor = clazz.getConstructor();
            Object instance = constructor.newInstance();

            // Get the 'solve()' method from the class
            Method solveMethod = clazz.getMethod("solve");

            // Invoke the 'solve()' method on the instantiated object
            Object result = solveMethod.invoke(instance);
            return result.toString();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }


}
