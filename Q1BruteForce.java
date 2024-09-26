public class q1 {
    //given a list of elements from a range start to end , arrange the elements(Not required to be sorted) such that elements belonging to the first half of the range will be found first followed by the second half
    public static void main(String [] args){
        int start=1;
        int end=7;
        int []arr={1, 6, 5, 3, 4, 2, 7};
        int index=0;
        int between= (end+start)/2;
        int []res= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=between){
                res[index]=arr[i];
                index++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>between){
                res[index]=arr[i];
                index++;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(res[i]+" ");// 1 3 4 2 6 5 7
        }
    }
}
