//stringBuilder
public class stringBuilder {
    public static void main (String []args){
        StringBuilder sb = new StringBuilder("Hello");
        /*//char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0,'s');
        System.out.println(sb);*/

        /*sb.insert(2,'n');
        System.out.println(sb);

        //delete the extra 'n'
        sb.delete(2,4);
        System.out.println(sb);

        //to append char here append means -> to add something at the end
        StringBuilder bs = new StringBuilder("h");
        bs.append('e'); //bs = bs+e = he
        bs.append('l');
        bs.append('l');
        bs.append('o');
        System.out.println(bs.length());*/

        for (int i = 0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i; //5-1-0 => 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
