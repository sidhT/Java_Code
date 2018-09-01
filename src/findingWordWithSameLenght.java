public class findingWordWithSameLenght {
        public static void main(String[] args) {
            String a="this is the example code";
            String ab[]=a.split(" ");
            System.out.print(ab.length);
            int count=0;
            for(int i=0;i<ab.length;i++){
                if(ab[i].length()==4){
                    count++;
                }
            }
        }

}
