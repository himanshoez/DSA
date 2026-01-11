class print{
    static void printName(int cnt){
        
            if(cnt == 5){
                return;
            }
            
            System.out.println("Palak"); 
            printName(cnt + 1);
    }

    static void main(String[] args){
        printName(0);
    }
}