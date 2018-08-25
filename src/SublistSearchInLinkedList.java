import java.util.LinkedList;

public class SublistSearchInLinkedList {
    public static int checkExactMatching(LinkedList<Integer> sup, int startingPosInSup, LinkedList<Integer> sub){
        int loop=0;
        while(loop<sub.size()){
            if(sub.get(loop)==sup.get(startingPosInSup)){
                loop++;
                startingPosInSup++;
            }else {
                loop--;
                break;
            }
        }
        if(loop==sub.size()){
            return 1;
        }else {return -1; }
    }

    public static void subListSearchWithNode(){
        LinkedList<Integer> sup=new LinkedList<Integer>();
        sup.add(1);
        sup.add(2);
        sup.add(2);
        sup.add(3);
        sup.add(4);
        LinkedList<Integer> sub=new LinkedList<Integer>();
        sub.add(1);
        sub.add(3);

        int i=0, returnedValue=0;
        System.out.print(sub.get(0));
        while (i<sup.size())
        {
            if(sup.get(i)==sub.get(0)){
                returnedValue = checkExactMatching(sup,i,sub);
            }
            if(returnedValue==1){
                System.out.print("Present");
                return;
            }
            i++;
        }
        System.out.print("Not Present");

    }
    public static void main(String[] args){
        //System.out.print("starting..");
        subListSearchWithNode();
    }
}
