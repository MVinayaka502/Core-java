// String buffer

public class _36StringBuffer {
    public static void main(String[] args){
        // creating String Buffer

        StringBuffer sb=new StringBuffer("Vinay");
        System.out.println(sb);

        //sb.capacity();// default size is 16 characters
        System.out.println(sb.capacity());


        sb.length();// gives the length of the string
        System.out.println(sb.length());

// inserting data to string :mutable Strings
        sb.append(" Kumar");
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb); // deletes the character at the index 3



    }
}
