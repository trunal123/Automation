class first_prog{
    public static void main( String args[] )
    {
        first_prog Test = new first_prog();
	int Z = Test.Addition ( 5,6 );
 	System.out.println ("Result is : "+Z);
    }
    
    int Addition ( int a, int b)
    {
        int result;
        result = a + b;
        //System.out.println (result);
	return result;
    }
}
