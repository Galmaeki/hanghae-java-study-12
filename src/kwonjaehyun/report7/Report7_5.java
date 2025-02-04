package kwonjaehyun.report7;
//6-21번 문제
//메서드명: abs
//기능 : 주어진 값의 절대값을 반환한다.
//반환타입 : int
//매개변수 : int value
public class Report7_5 {
    static int abs(int a){
        if (a<0){
            return -a;
        }
        return a;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10