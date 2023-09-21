package week4.practicequiz;

public class NumberCruncher{

    public static int numberChanger(int number){
        int result = number + 2;
        if(result > 12.0){
            int decrease = 5;
            result -= decrease;
        }else{
            int increase = 7;
            result += increase;
        }
        return result;
    }

    public static int changeNumber(int number){
        int answer = number;
        for(int i = 0; i < 2; i++){
            answer = numberChanger(answer);
        }
        return answer;
    }

    public static void main(String[] args){
        int number = 10;
        int result = changeNumber(number);
        System.out.println(result);
    }

}
