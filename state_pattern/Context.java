public class Context {
    public Context(State state) {
        transitionTo(state);
    }

    public void transitionTo(State state) {
        System.out.println(state.getClass().getSimpleName() + " 상태로 변경되었다.");
        this.state = state;
        this.state.setContext(this);
    }

    public void request1() {
        this.state.Handle1();
    }

    public void request2() {
        this.state.Handle2();
    }

    private State state;
}
