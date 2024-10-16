public class Prac8 {
    public static void main(String[] args) {
        int a[]={1,4,9,8,7,2,6,4,9,9};
        int count=0;
        for(int i=0;i<10;i++)
        {
            if(a[i]==9)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
