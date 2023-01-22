public class MyDIApplication implements Consumer {

    private MessageService service;

    public MyDIApplication(MessageService ms){
        this.service = ms;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
