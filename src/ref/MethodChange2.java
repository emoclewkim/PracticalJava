package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); //10
        System.out.println("dataA=" + dataA); // 참조값
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); //
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX=" + dataX); // 참조값
        dataX.value = 20;
        Data Y = dataX;
        Y.value = 1000;
    }
}
