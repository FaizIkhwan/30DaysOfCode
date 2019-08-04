class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores)
    {
        super(firstName, lastName, id);
        testScores = scores;
    }
    public char calculate()
    {
        int sum = 0, avg = 0;
        char res = 'a';
        for(int i=0; i<testScores.length; i++)
        {
            sum += testScores[i];
        }
        avg = sum / testScores.length;
        if(avg>=90 && avg<=100)
            res = 'O';
        else if(avg>=80 && avg<90)
            res = 'E';
        else if(avg>=70 && avg<80)
            res = 'A';
        else if(avg>=55 && avg<70)
            res = 'P';
        else if(avg>=40 && avg<55)
            res = 'D';
        else if(avg<40)
            res = 'T';
        return res;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}