public class Test {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        //A 상태를 취득한 상황에서 B상태 행위들을 제어
        context.request1();
        context.request2();

        //B 상태를 취득한 상황에서 B상태 행위들을 제어
        context.request1();
        context.request2();
    }    
}
