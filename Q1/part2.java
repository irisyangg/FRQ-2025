 public int dogWalkShift(int startHour, int endHour){
        int money=0;
        for(int i=startHour; i<endHour; i++){
            if(maxDogs==walked(i)){
                money=(walked*5)+3;
            }
            else{ 
                money=money+(walked*5);
                if(i>=9&&<=17){
                    money=money+3;
                }
            }
        }
        return money;
    }
