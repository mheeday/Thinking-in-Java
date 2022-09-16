package chapter10.ex11;

interface State {
    void funds();
}
class MegaState {
    private class Lagos implements State {
        public void funds() {}
    }
    State getState(){
        return new Lagos();
    }
}

public class Ex11 {
}
