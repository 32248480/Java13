import java.io.*;
class Exception520 extends Exception{
}

public class Main{
public static void main(String args[]) throws IOException{
try{
 String str;
 BufferedReader buf;
 buf=new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Input a string:");
 str=buf.readLine();
if(str.equals("520"))
 throw new Exception520();
else
 System.out.println("string="+str);
}
catch(Exception520 e){
 System.out.println("這是由字串 520 所引起的例外");
}
}
}

//a=5, b=5, c=5
//這是正三角形