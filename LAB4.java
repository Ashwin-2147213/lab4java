import java.util.*;
public class LAB4
 {
    static String task;
    static int choice;
    static int task_counter;
    
 

LAB4(String t, int c)
{
    task=t;
    choice= c;
}
static{
    task_counter=0;
}
Void Task_Reader(String task)
{
    Scanner sc=new Scanner(System.in);
    task=sc.nextLine();
    sc.close();
    return null;
}

static void display()
{
    System.out.println("\nTask Added Successfully");
}


public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    LAB4 ob=new LAB4(task, choice);
    System.out.println("To Enter task press 1.\n To Exit Press 0.\n ");
    choice=sc.nextInt();
    sc.close();
    if(choice==0)
    {
        System.exit(0);

    }
    else if(choice==1)
    {
        ob.Task_Reader(task);
        task_counter++;
    }
}}
 