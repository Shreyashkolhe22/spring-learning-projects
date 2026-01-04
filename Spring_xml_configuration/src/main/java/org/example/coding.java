package org.example;

public class coding {

    private ExecutionProcess exe;
    private int ram;

    //constructor dependency injection
    public coding(int ram,ExecutionProcess exe)
    {
        System.out.println("constructor dependency injection is done");
        this.ram=ram;
        this.exe=exe;

    }

    public void code()
    {
        System.out.println("coding.....");
        exe.compile();
        exe.run();
    }


}
