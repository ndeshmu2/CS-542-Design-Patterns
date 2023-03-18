package studentRecordsBackupTree.bst;
import java.util.Vector;

public class BstObservable {
    private Vector<BstObserver> observers = new Vector<>();
    private int state;

    public int getState(){return this.state;}

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(BstObserver observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(BstObserver observer : observers){
            observer.update(state);
        }
    }
}