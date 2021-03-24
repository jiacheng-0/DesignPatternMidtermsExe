package MidtermII;

public class QuickService implements QuickServiceInterface {
    private QuickServiceInterface nextService;
    private ServiceInterface currService;

    @Override
    public void setService(ServiceInterface service) {
        currService = service;
    }

    @Override
    public void add(ServiceInterface service){
        QuickServiceInterface c = this;
        while(c.getNext()!=null){
            c = c.getNext();
        }
        c.setNext(service);
    }

    @Override
    public QuickServiceInterface getNext(){
        return  nextService;
    }

    @Override
    public void setNext(ServiceInterface service){
        nextService = new QuickService();
        nextService.setService(service);
    }

    @Override
    public void invokeService(Command command) {
        if(currService != null){
            currService.processService(command);
            if (nextService!=null) nextService.invokeService(command);
        }
    }
}
