class Calc{
    public int add(int ...a){  // act as an Array a[] = {2,3,4,5,6,7,7}
        int sum = 0;
        for(int val: a){
            sum += val;
        }
        return sum;
    }
}

public class LaunchVarArgs {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println("The Sum of N numbers of arguments: " + c.add(3,4,5,6,7,7));
    }
}
