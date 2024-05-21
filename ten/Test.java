package ten;
public class Test

{

            public static void main(String [] args)

            {

                        try

                       {

                                m1();

                                System.out.print("After m1 in main;");      

                        }

                        catch (Exception e)

                        {

                                System.out.print("Exception in main;");

                        }

            }

            public static void m1()

           {

                        try

                       {

                                 System.out.print(1/0);

                                 System.out.print("After 1/0 in m1;");

                        }

                        catch (Exception e)

                        {

                                 System.out.print("Exception in m1;");

                        }

            }

}