public interface IBagOfTask
{
    public ITask getNext();
    public void sendResult(ITask t);
    public int getSize();
    public boolean[] getTab();
}