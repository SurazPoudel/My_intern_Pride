package com.company;

class Subject
{
    //Properties
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    //Constructors
    public Subject(String subID, String name)
    {
        this.subID = subID;
        this.name = name;
    }

    public Subject(String subID, String name, int maxMarks)
    {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }


    //Getters
    public String getSubID()
    {
        return subID;
    }

    public String getName()
    {
        return name;
    }

    public int getMaxMarks()
    {
        return  maxMarks;
    }

    public int getMarksObtain()
    {
        return marksObtain;
    }

    //Setters
    public void setSubID(String subID)
    {
        this.subID = subID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMaxMarks(int maxMarks)
    {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(int marksObtain)
    {
        this.marksObtain = marksObtain;
    }

    //Methods
    public boolean isQualified()
    {
        return marksObtain >= maxMarks/10*4;
    }

    public String toString()
    {
        return "\nSubject ID:" + subID + "\nName: " + name + "\nMarks Obtained: " + marksObtain;

    }


}


public class Main {

    public static void main(String[] args) {

        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101","DS", 100);
        subs[1] = new Subject("s102","Algorithms",100);
        subs[2] = new Subject("s103", "Operating Systems", 100);

        for(Subject s:subs)
            System.out.println(s);

    }
}
