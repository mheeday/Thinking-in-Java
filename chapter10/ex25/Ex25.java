package chapter10.ex25;

class WatermistGreenhouseControls extends GreenhouseControls{
    private boolean watermist = false;
    public class WaterMistOn extends Event {
        public WaterMistOn(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here to
            // physically turn on the water mist generators.
            watermist = true;
        }
        public String toString() { return "Water mist generators are on"; }
    }
    public class WaterMistOff extends Event {
        public WaterMistOff(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here to
            // physically turn off the water mist generators.
            watermist = false;
        }
        public String toString() { return "Water mist generators are off"; }
    }
}

public class Ex25 {
    public static void main(String[] args) {
        WatermistGreenhouseControls wmgc = new WatermistGreenhouseControls();	//Type of controls has to be changed
        wmgc.addEvent(wmgc.new Bell(900));
        Event[] eventList = {
                wmgc.new WaterMistOn(200),			//Adding event that switches water mist generators on
                wmgc.new WaterMistOff(400),		//Adding event that switches water mist generators off
        };
        wmgc.addEvent(wmgc.new Restart(2000, eventList));
        if(args.length == 1)
            wmgc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        wmgc.run();
    }
}
