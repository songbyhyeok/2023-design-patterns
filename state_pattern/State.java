public abstract class State {
    void setContext(Context context) {
        this.context = context;
    }

    public abstract void Handle1();
    public abstract void Handle2();        

    protected Context context;
}