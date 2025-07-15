public class abc{
    public static void main(String[] args){
        //Check if any arguments were passed
        if (args.length==0){
            System.out.println("No argument passed.");
        }else{
            for(String arg : args){
                System.out.println(arg);
            }
        }
    }
}
