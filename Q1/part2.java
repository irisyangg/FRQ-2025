 public int moneyCount(int startHour, int endHour){
        int money=0;
        for(int i=startHour; i<endHour; i++){
            int dogs=walkDogs(i);
            money=money+(dogs*5);
            if((dogs==maxDogs)||(hours>=9&&<=17)){
                money=money+3;
            }
        }
        return money;
    }
