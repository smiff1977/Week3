public class Week3 //nesting methods and creating breakpoints
{
    public static void main(String[] args)
    {
        String firstName = "Mike"; //use breakpoints at the left here and click on little bug top right, then down blue arrow to watch execution of each line
        String surname = "Smith";
        printline();//method void
        String fullname = getFullName(firstName, surname);
        welcome(fullname); //method String
        printline(); //method void (empty in brackets!)
        ifStatementCode(); //method void
        System.out.println("End of program");
    }

        public static void printline() //printline method
        {
            System.out.println("############################"); //body of the method
        }

        public static String getFullName (String firstname, String surname) // String method
    {
        return firstname + " " + surname; //String methods need a "return"
    }
        public static void welcome(String name)
    {
        String output = "Hello " + name + "!";
        System.out.println(output);
    }

        public static void ifStatementCode()
    {
        int x = 99;

        if (x < 10)
        {
            System.out.println("x is less than 10");
        }
        else if (x <= 100) //less than or equal to
        {
            System.out.println("x is between 10 and 100");
        }
        else
        {
            System.out.println("x is greater than 100");
        }

        String[] animals = {"cat", "cat", "dog", "tortoise", "cat", "rabbit", "dog", "cat", "dog", "cat"};

        int numDogs = 0;
        int numCats = 0;

        for (int i = 0; i < animals.length; i++)
        {
            if (animals[i] == "cat") //equal to operator returns true if = "cat" i.e counts 1 if "cat"
            {
                numCats++;
            }
            else if (animals[i] == "dog")
            {
                numDogs++;
            }
        }
            System.out.println("Number of cats: " + numCats);
            System.out.println("Number of dogs: " + numDogs);


            int[] ages = {24, 31, 29, 40, 18, 20, 42, 50};
    }
}
