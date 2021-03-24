package MidtermII;

public interface QuickServiceInterface {
    public void invokeService(Command command);
    public void setService(ServiceInterface service);
    public QuickServiceInterface getNext();
    public void setNext(ServiceInterface service);
    public void add(ServiceInterface service);
}
