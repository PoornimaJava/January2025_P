public class RenameReplaceWithChar {
    public static void main(String[] args){
        String val = "this is a simple test";


        char ch[] = val.toCharArray();

        for(Character c :ch){
            if(c.toString().equalsIgnoreCase("t"))
                System.out.println(c.toString().replace("t", "r"));
            else{
                System.out.println(c.toString());
            }
        }
    }
}
