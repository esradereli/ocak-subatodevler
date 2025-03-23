//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,8,99,66};
        int max= arr[0];
        for (int num:arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Max is: "+max);



    }
}