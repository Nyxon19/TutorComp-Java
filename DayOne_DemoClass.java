class DayOne_DemoClass{
    public static void main(String[] args) {
        System.out.println("Shanyu Saharsh Nalumas");
        oddNumber(5);
        oddNumber(6);
        int b = 0;
        for(int a = 1; a<=100; a++){
            b=b+a;
            if(b<=100)
            System.out.println(b);
        }
    }

    static void oddNumber(int a){
        if(a%2==1){
            System.out.println("odd Number");
        }else{
            System.out.println("even number");
        }
        
    }
}