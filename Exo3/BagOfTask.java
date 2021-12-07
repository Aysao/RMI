
public class BagOfTask implements IBagOfTask{

    public boolean[] tab;
    private volatile int currentN;

    public BagOfTask(int N)
    {
        tab = new boolean[N];
    }

    public ITask getNext()
    {
        currentN++;
        return new Task(currentN);
    }

    public void sendResult(ITask t)
    {
        Task task = (Task)t;
        tab[task.getNumber()] = task.isPrimary();
    }

    public int getSize()
    {
        return tab.length;
    }

    public boolean[] getTab(){
        return tab;
    }
}
