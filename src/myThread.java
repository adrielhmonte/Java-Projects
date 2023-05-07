public class myThread extends Thread {

    @Override
    public void run() {
        if(this.isDaemon()) { 
            System.out.println("This is a Daemon thread running");
        }
        else {
            System.out.println("This is a user thread that is running");
        }

    }
    
}
