class car{
    float price(){return 5000f;}
}
class volvo extends car{
    float price(){return 2000f;}
}
class bmw extends car{
    float price(){return 4000f;}
}
class benz extends car{
    float price(){return 7000f;}
}
class cars{
    public static void main(String args[]){
        car eng=new volvo();
        System.out.println("volvo price: "+eng.price());
        eng=new bmw();
        System.out.println("bmw pricet: "+eng.price());
        eng=new benz();
        System.out.println("benz price: "+eng.price());
    }
}