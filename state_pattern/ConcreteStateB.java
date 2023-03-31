public class ConcreteStateB extends State {
    ConcreteStateB() {}

    @Override
    public void Handle1() {
        System.out.println("사용자 요청에 따라 B상태 on");
    }
    
    @Override
    public void Handle2() {
        System.out.println("사용자 요청에 따라 B상태에서 A상태로 변경");
        this.context.transitionTo(new ConcreteStateA());
    }
}

