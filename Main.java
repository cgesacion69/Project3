class Main {
 public static void main(String[] args){
    int[] z = new int[10];
    z[0] = 223;
    z[1] = 23;
    int[] x = {23,32,43,12,43,45,69,84,26,77,59,21,13,53,68};
    System.out.println(z[0]);
    System.out.println(z[1]);
    System.out.println(x[3]);
    System.out.println(x[4]);
    System.out.println(x[5]);
    System.out.println(x[6]);
    System.out.println(x[7]);
    System.out.println(x[8]);
    System.out.println(x[9]);
    System.out.println(x[10]);
    System.out.println(x[11]);
    System.out.println(x[12]);
    System.out.println(x[13]);
    System.out.println(x[14]);
    String[] strArray = { "A", "B", "C" , "D" , "E" , "F" , "G" , "H" , "I" , "J" , "K" , "L" , "M" , "N" , "O"};
		boolean found = false;
		int index = 0;
		String s = "B";
		for (int i = 0; i < strArray.length; i++) {
			if(s.equals(strArray[i])) {
				index = i; found = true; break;
			}
		}
		if(found)
			System.out.println(s +" found at index "+index);
		else
			System.out.println(s +" not found in the array");

      System.out.println("what is your name");
      System.out.println("my name is cameron");

		
	}


  }
