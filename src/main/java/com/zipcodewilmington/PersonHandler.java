package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
            // begin loop
            while(counter < getPersonArray().length) {
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
                Person currentPerson = personArray[counter];
                String stringRep = currentPerson.toString();
                result +=  stringRep;
                counter++;
            }
            // end loop

        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

            // use the above clauses to declare for-loop signature
            // begin loop
            for(int i=0; i<personArray.length;i++) {
            // use `counter` to identify the `current Person` in the array
               Person currentPerson = personArray[i];
            // get `string Representation` of `currentPerson`
                String stringRep = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
                result+=stringRep;
            // end loop
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
        for(Person person : personArray)
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

                 result += person.toString();

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
