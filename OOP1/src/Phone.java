public class Phone {
    //Phone HAS: os,name,owner
    String os,name;//Both os & name IS String
    Citizen owner;//owner IS Citizen
    Phone(Citizen owner){
        this.owner=owner;
    }
    //Phone does: makeCall & getCall
    void makeCall(Phone p){
        p.getCall(this);
    }
    void getCall(Phone p){
        System.out.println("ring ring");
        System.out.println(p.owner.name+" calling to "+this.owner.name);
    }
}
