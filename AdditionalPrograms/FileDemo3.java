class FileDemo3{
	public static void main(String args[]);
	{
	File f=new File("data.txt");
	FileWriter fout=new FileWriter(f);
	           BufferedWriter bout=new BufferedWriter(fout);

	        Scanner sc=new Scanner(System.in)
	        boolean flag=true;

	        while(flag){
	        System.out.println("enter s.no");
	        bout.write(Integer.toString(sc.nextint()));
	        bout.write('');
	        System.out.println("enter name");
	        bout.write(sc.next());
	        bout.write('');
	        System.out.println("enter cgpa");
	        bout.write(Float.toString(sc.nextFloat()));
	        bout.write('');
	        System.out.println("enter grade:(A/B/C/D");
	        bout.write(sc.next().CharAt(0));

	        bout.newline();
	        System.out.println("\ndo you want to continue entering data Y/N");
	        Char c=sc.next().CharAt(0);
	        if(c=='n' || c=='N'){
	        flag=false;
	        }
	        }
	        FileReader fin=new FileReader(f);
	                BufferReader bin=new BufferedReader(fin);
	                String sr;
	                System.out.println("the contents of file are:\n");
	                while((sr=bin.readline())!=null){
	                String[] strs=sr.split("");
	                System.out.println((strs[0])+""+strs[1]+ ""+strs[2]+ ""+strs[3]);
	                }
                     
                     catch(Exception e){
                     e.printStackTrace();
                     }





	}
}