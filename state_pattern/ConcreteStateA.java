public class ConcreteStateA extends State {
    ConcreteStateA() {}

    @Override
    public void Handle1() {
        System.out.println("사용자 요청에 따라 A상태 on");
    }
    
    @Override
    public void Handle2() {
        System.out.println("사용자 요청에 따라 A상태에서 B상태로 변경");
        this.context.transitionTo(new ConcreteStateB());
    }
}

